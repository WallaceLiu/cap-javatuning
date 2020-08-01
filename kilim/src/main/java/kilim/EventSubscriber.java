package bdata.cap.com.CH4.kilim_project.src.kilim;

public interface EventSubscriber {
    void onEvent(EventPublisher ep, Event e);
}
