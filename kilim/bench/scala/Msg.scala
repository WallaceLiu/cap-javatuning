package bdata.cap.com.ch4.kilim_project.bench.scala

abstract class PingMessage
case class MsgStart() extends PingMessage
case class MsgPingInit(count: int, pong: Pong) extends PingMessage
case class MsgSendPing extends PingMessage
case class MsgPong(sender: Pong) extends PingMessage

abstract class PongMessage
case class MsgPing(sender: Ping) extends PongMessage
case class MsgStop() extends PongMessage

