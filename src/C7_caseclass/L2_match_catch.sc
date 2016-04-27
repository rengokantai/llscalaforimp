import java.io.IOException

//try

try{}
catch{
  case e:IOException=>print(e)
  case _:Throwable=>print("Throwable")
}