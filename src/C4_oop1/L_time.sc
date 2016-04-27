class Time(val hour:Int,val minute:Int){
  def this(h:Int){this(h,0)}
  if(hour<0||minute<0||hour>=24||minute>=60) throw new IllegalArgumentException
  def before(other:Time)=hour<other.hour || hour==other.hour&&minute<other.minute
  override def toString=f"${hour}:${minute}"
}
val oneparam = new Time(4)
val morning = new Time(4,12)
val after  =new Time(12,1)
morning.before(after)
