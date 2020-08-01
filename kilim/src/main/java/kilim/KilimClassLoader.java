package bdata.cap.com.CH4.kilim_project.src.kilim;

/**
 * Extends Classloader just to have access to the (protected) findLoadedClass method
 */
public class KilimClassLoader extends ClassLoader {
    public KilimClassLoader(ClassLoader cl) {
        super(cl);
    }

    public Class<?> getLoadedClass(String className) {
        return super.findLoadedClass(className);
    }
    
    public boolean isLoaded(String className) {
        return getLoadedClass(className) != null;
    }
}
