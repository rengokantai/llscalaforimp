//traverse index
val a=new Array[Int](10)



//print index
for(i<-0 until a.length)a(i)=i*i
a

//print element
for(i<-a)println(i)

import scala.collection.mutable.ArrayBuffer
val b = new ArrayBuffer[Int]()
b+=1
b+=(2,3)
b++=Array(4,5)
b.remove(3)
b.insert(3,4)
b.trimEnd(3) //remove last 3 elm
b.toArray.toBuffer
