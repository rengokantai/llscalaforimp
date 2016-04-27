1.to(10).reduceLeft(_*_)
//curry
def fac(n:Int)=1.to(n).reduceLeft(_*_)
fac(10)

1.to(10).map(n=>2).reduceLeft(_*_)


def pow(a:Int,b:Int)=1.to(b).map(n=>a).reduceLeft(_*_)

pow(2,4)

def concat(str:Seq[String],sep:String)= str.reduceLeft(_+sep+_)
concat(Array("a","b")," ")


