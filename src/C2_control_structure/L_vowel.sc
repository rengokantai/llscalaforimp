//def isVowel(c:Char)=c=='a'||c=='e'


//using contains
def isVowel(c:Char)="aeiou".contains(c)


//tridition for loop
def vowels(s:String)={
  var res=""
  for(ch<-s){
    if(isVowel(ch))res+=ch
  }
  res
}
vowels("asc") //return a string


//using yield
def vowels2(s:String)= for(ch<-s if isVowel(ch))yield ch
vowels2("asc")



//recursion
def vowels3(s:String): String={
  if(s.length==0)  ""
  else {
    val char = s(0)
    val rest = vowels3(s.substring(1))
    if(isVowel(char))char+rest else rest
  }
}
vowels3("asc")


//while
def vowels4(s:String)={
  var i=0
  var res=""
  while(i<s.length){
    val ch=s(i)
    if(isVowel(ch))res+=ch
    i+=1
  }
  res
}
vowels4("asc")


def isVowellong(ch:Char,vowelChars:String)=vowelChars.contains(ch)

def vowels5(s:String, vowelChars:String="aeiou",ignoreCase:Boolean=true)=
  for(ch<-(if(ignoreCase) s.toLowerCase else s) if isVowellong(ch,vowelChars))yield ch


