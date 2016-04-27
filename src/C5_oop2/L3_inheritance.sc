class A(a:Int){}
//superclass construction
class B(x:Int,y:Int) extends A(x:Int){}

val b = new B(1,2)

b.isInstanceOf[B]
b.asInstanceOf[B]
b.getClass ==classOf[B]

//5.3
//traits can have concrete and abstract methods,cannot have constructor parameters
