//define a function, unless is recursive, return type is not necessary

def abs(x:Double)=if(x>=0)x else -x

def fac(x:Int):Int=if(x<=0)x else x * fac(x-1)


//procedure: no '='

def proc(x:String): Unit ={
  print(x)
}
proc("x")


def facproc(i:Int)={
  var j=1
  for(i<-1 to i) j=j*i
  j
}

facproc(3)