//run command: scala basics.scala

//let (in swift) is the same as val (scala)
//swift and scala use var in signal mutation

val x:Int = 2
var y:Int = 1

//x = 2, won't work
y = 3

val name: String = "Kelton"
val price: Double = 23.99

def add(a: Int, b: Int) : Int = {
  return a + b
}

//no equal sign
def nonReturningFunction(a: Int, b: Int) {
  println(a)
  println(b)
}


val eight = add(3, 5)
println(eight)

//both swift and scala allow for type coercion, so you can often do the following

val d = 2
val g = "name"
val h = 2.4

/*
scala allows for coercion for return type so the following are valid, in addition*
also, the last executed line is returned (the keyword return is not required)
*/

def addV2(a: Int, b: Int) = a + b

def addV3(a: Int, b: Int) = {
  a + b
}


def addV4(a: Int, b: Int) : Int = {
  return a + b
}
