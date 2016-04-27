//in java, we need to use  new BufferedReader(new InputStreamReader(new FileInputStream())) to read file
import java.io._

trait Buffered extends InputStream{
  val size = 1024
  private var end =0
  private val buffer = new Array[Byte](size)
  private var pos =0

  override def read()={
    if(pos==end){
      end = super.read(buffer,0,size)
      pos=0
    }
    if(pos==end)-1 else{
      pos+=1
      buffer(pos-1)
    }
  }
}

var my = new FileInputStream("../L3_inheritance.sc")with Buffered

my.read()






