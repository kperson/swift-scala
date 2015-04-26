//run command: classes.scala

class Airplane(val make: String, val model: String) {

  def fly(to: String) {
    println(s"${make} ${model} flying to ${to}")
  }

  def fly(to: String, on: String) {
    println(s"${make} ${model} flying to ${to} ${on}")
  }

}

val a380 = new Airplane("Airbus", "A380")
a380.fly("New York")

println(a380.make)
println(a380.model)

//Inheritance
class FighterJet(val maxSpeed: Int) extends Airplane("Lockhead", "Raptor") {

  override def fly(to: String) {
    println(s"${make} ${model} flying to ${to} going ${maxSpeed}")
  }

}

val fighterJet = new FighterJet(1500)
fighterJet.fly("Air Force Base")

//Named parameters can be used in scala, no special syntax is required.
fighterJet.fly(on = "May 29th", to = "Chicago")
