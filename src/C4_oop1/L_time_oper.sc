class Time(val hour:Int,val minute:Int){
  def this(h:Int){this(h,0)}
  if(hour<0||minute<0||hour>=24||minute>=60) throw new IllegalArgumentException
  def before(other:Time)=hour<other.hour || hour==other.hour&&minute<other.minute
  def -(other:Time)=hour*60+minute-other.hour*60-other.minute
  def <(other:Time)=this-other<0
  override def toString=f"${hour}:${minute}"
}

new Time(9,8)-new Time(11,2)
new Time(9,8)<new Time(11,2)

