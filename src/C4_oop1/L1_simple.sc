class Point(val x:Double){  //if var x, then x is mutable
  println("this message will print every time")
  def move(dx:Double)=new Point(x+dx)
  override def toString =f"${x}%8.2f"
}

val p =new Point(3)
p.move(3)

