//a function has access to any variable from any enclosing scope
//even if the variable is no longer around when you call the function

//currying:
// turning a function that take two arguments into a function that
//takes one argument.
//that function return a function that consumes the second argument.

def mul(x:Int,y:Int)=x*y
def mulc(x:Int)= (y:Int)=>x*y   //must use =>

//Ex

val a =Array("a","b")
val b =Array("a","b")
//see scaladoc
a.corresponds(b)(_.equalsIgnoreCase(_))

a.corresponds(b,(s: String,t: String)=> s.equalsIgnoreCase(t))