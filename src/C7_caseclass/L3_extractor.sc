val arr = Array(0,1,3)

arr match{
  case Array(1)=>print("1")
  case Array(x,1,3)=>print(x)
  case Array(2,_*)=>print("?")  //2 follow by any number elem
}
arr

