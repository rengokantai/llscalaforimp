def sum(args:Int*)={ //args is a Seq[Int]
  var res=0
  for(arg<-args) res+=arg
  res
}

val s=sum(1,2)

val r = sum( 1 to 3:_*)
// seq must declare with :_*

