"Abc".partition(_.isUpper)
val(pos, neg) = Array(1,2,-3).partition(_<0)
val pairs = Array(1,2,3).zip(Array("a","b","c"))

"a"*3
//3*"a" iilegal
for((s,n)<-pairs)print(n*s)
