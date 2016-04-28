abstract class DoubleOption
case class SomeDouble (value:Double) extends DoubleOption // case class must have param
case object NoDouble extends DoubleOption  //no param

def inv(x:Double) = if(x==0)NoDouble else SomeDouble(1/x)

inv(5)
inv(0)

import scala.math._

def f(x:Double)= if(x<=1)SomeDouble(sqrt(1-x))else NoDouble

def compose(f:Double=>DoubleOption,g:Double=>DoubleOption)=(x:Double)=>g(x) match{
  case SomeDouble(result) => f(result)
  case NoDouble=>NoDouble
}

val h = compose(f,inv)

h(0)