def While(cond: =>Boolean)(body: =>Unit): Unit ={
  if(cond){
    body;While(cond)(body)
  }
}

val n=10
var i=1
var f=1
While(i<n){f*=i;i+=1}
f


