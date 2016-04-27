import java.awt._
var r  = new Rectangle(1,1,10,10)
r.translate(10,10)

import java.awt.geom._

trait RecLike{
  def setFrame(x:Double,y:Double,w:Double,h:Double)
  def getX:Double
  def getY:Double
  def getWidth:Double
  def getHeight:Double
  def translate(dx:Double,dy:Double): Unit ={
    setFrame(getX+dx,getY+dy,getWidth,getHeight)
  }
  override def toString= f"${getX}${getY}"
}

var e = new Ellipse2D.Double(1,1,10,10) with RecLike
e
e.translate(10,10)
e
