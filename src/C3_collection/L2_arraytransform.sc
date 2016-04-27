val a = Array[Int](1,2,3)
val b = for(i<-a if i%2==0)yield 2 * i
b
