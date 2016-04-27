def swap(p:(Int,Int))=p match {case (x,y)=>(y,x)}

swap((1,2))

//swap 1st and 2nd elem of arrat
def swap2(a:Array[Int])=a match{case Array(x,y,rest@_*)=>Array(y,x)++rest}

swap2(Array(1,2,3))



