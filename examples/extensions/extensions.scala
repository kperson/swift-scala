//run command: scala extensions.scala

//expresses time in seconds
implicit class TimeUnit(x: Int) {
  def milliseconds = x * 0.001
  def seconds = x * 1000.milliseconds
}

println(4.milliseconds)
println(2.seconds)





/**
 OPTIONAL
 I would recommend putting this in an object (maybe a package object) so its to import
 You don't have to worry about the exact class to import

 object TimeConversions {

   implicit class UnitConversions(x: TimeInterval) {
     def milliseconds = x
     def seconds = x * 1000.milliseconds
   }

  }
 */
