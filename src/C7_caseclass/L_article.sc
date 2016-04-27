abstract class Item
case class Article(n:String,p:Int) extends Item
case class Bundle(n:String,dis:Double,items:Item*)extends Item

val book =Article("B",1)
val gift = Bundle("g",20.0,book, Article("C",2))

def price(i:Item)=i match{
  case Article(_,p)=>p
}

price(book)

