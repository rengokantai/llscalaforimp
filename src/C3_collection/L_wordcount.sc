var in = new java.util.Scanner(new java.net.URL("https://raw.githubusercontent.com/sequenceiq/docker-spark-native-yarn/master/sample-data/wordcount.txt").openStream)
//mutable
val count = scala.collection.mutable.Map[String,Int]()
while(in.hasNext){
  val word = in.next()
  count(word)=count.getOrElse(word,0)+1
}

count("their")


//immutable
var in2 = new java.util.Scanner(new java.net.URL("https://raw.githubusercontent.com/sequenceiq/docker-spark-native-yarn/master/sample-data/wordcount.txt").openStream)
var count2 = Map[String,Int]()
while(in2.hasNext) {
  val word = in2.next()
  count2 = count2 + (word -> (count2.getOrElse(word, 0) + 1))
}
count2("their")