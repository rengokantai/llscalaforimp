val ch= '+'
var sign:Int
var digit:Int
ch match{
  case '+' =>sign=1
  case ch if Character.isDigit(ch)=>digit=Character.digit(ch,10)
  case _ =>sign=0
}

sign

