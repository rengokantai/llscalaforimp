import scala.collection.mutable.ArrayBuffer
def removeAllButFirstNeg(b:ArrayBuffer[Int]): Unit ={
  var first=true
  var idx=0
  while(idx<b.length){
    if(b(idx)<0){
      if(first){
        first=false
        idx+=1
      }
      else{
        b.remove(idx)
      }
    }
    else idx+=1
  }
}
val buf=ArrayBuffer(1,2,-1,-2,-3)
removeAllButFirstNeg(buf)
def removeAllButFirstNeg2(buf:ArrayBuffer[Int]): Unit = {


  val indexes = for (i <- 0 until buf.length if buf(i) < 0) yield i
  val indextoremove = indexes.drop(1)
  for(i<-indextoremove.reverse) buf.remove(i)
}
removeAllButFirstNeg2(buf)
buf

def removeAllButFirstNeg3(buf:ArrayBuffer[Int]): Unit = {
val indexesToRemove =(for (i<-0 until buf.length if buf(i)<0)yield i).drop(1)
  for(i<-0 until buf.length if !indexesToRemove.contains(i))yield buf(i)
}