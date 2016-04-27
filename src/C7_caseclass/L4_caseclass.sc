abstract class A
case class B(v:Double) extends A //implicit val. each of the constructor parameters becomes val
val a = new B(1.0)

a match{
  case B(v)=>v
}

//other methods: apply copy

