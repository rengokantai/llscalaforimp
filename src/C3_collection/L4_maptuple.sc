val s= Map("a"->1,"b"->2)

val r= scala.collection.mutable.Map("a"->1,"b"->2)  //can assign new value

s.getOrElse("e",0)
r+=("d"->3)
r-="d"

for((k,v)<-r)yield(v)


//tuple
val tu =(1,"a")
tu._1 // 1 based
val(_,sec)=tu
sec



