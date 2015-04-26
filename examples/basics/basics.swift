//run command: xcrun swift basics.swift

//let (in swift) is the same as val (scala)
//swift and scala use var in signal mutation

let x:Int = 2
var y:Int = 1

//x = 2, won't work
y = 3

let name: String = "Kelton"
let price: Double = 23.99

func add(a: Int, b: Int) -> Int {
  return a + b
}

//no -> sign
func nonReturningFunction(a: Int, b: Int) {
  println(a)
  println(b)
}

let eight = add(3, 5)
println(eight)

//both swift and scala allow for type coercion, so you can often do the following

let d = 2
let g = "name"
let h = 2.4
