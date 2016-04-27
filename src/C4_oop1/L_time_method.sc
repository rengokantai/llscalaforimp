class Time(h:Int,m:Int=0){
  private var msincem = h*60+m
  def hours = msincem/60
  def minutes=msincem%60
  def minutes_=(newval:Int){msincem=hours*60+newval}

  if(h<0||m<0||h>=24||m>=60) throw new IllegalArgumentException
  def before(other:Time)= msincem<other.msincem
  override def toString=f"${hours}:${minutes}"

}