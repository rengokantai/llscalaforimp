val x=1
val res = if(x==1) 1 else 2

val nullres = if(x!=1) 1
val unit = ()


// value of block is the value of the last expression
val bk={
  val a=1
  val b=2
  a+b
}

//if the last expression is an assignment, block value is ()
/*
var n:Int
var i:Int
while(n>0){
  var i += 1
  n = n/2
}*/
