abstract class DoubleOption{
  def isEmpty: Boolean
  def get:Double
}

class SomeDouble(val value:Double) extends DoubleOption{
  def isEmpty = false
  def get=value
}

class NoDouble extends DoubleOption{
  def isEmpty = true
  def get =throw new NoSuchElementException
}


