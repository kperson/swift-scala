//run command: xcrun swift classes.swift

class Airplane {

  let make: String
  let model: String

  init(make: String, model: String) {
    self.make = make
    self.model = model
  }

  func fly(to: String) {
    println("\(make) \(model) flying to \(to)")
  }

  func fly(to: String, on: String) {
    println("\(make) \(model) flying to \(to) on \(on)")
  }

}

let a380 = Airplane(make: "Airbus", model: "A380")
a380.fly("New York")
a380.fly("Chicago", on: "May 29th")

println(a380.make)
println(a380.model)


//Inheritance
class FighterJet : Airplane {

  let maxSpeed: Int

  //super is called after the new properties are set, not super intuitive
  init(maxSpeed: Int) {
    self.maxSpeed = maxSpeed
    super.init(make: "Lockhead", model: "Raptor")
  }

  override func fly(to: String) {
    println("\(make) \(model) flying to \(to) going \(maxSpeed) MPH")
  }

}

let fighterJet = FighterJet(maxSpeed: 1500)
fighterJet.fly("Air Force Base")


/*
  Swift can be a little confusing when it comes to named parameters.
  In the constructor, I had to name the parameters, but in the instance method I did NOT have to do so for the first parameter

  If you want to force methods to have named parameters, put a '#' before the parameter

    func fly(#to: String) {
      println("\(make) \(model) flying to \(to)")
    }

    fly(to: "New York")


  If you want to force methods to NOT have name parameters, put a '_ ' before the parameter
  func fly(to: String, _ on: String) {
    println("\(make) \(model) flying to \(to) on \(on)")
  }

  fly("Chicago", "May 29th")


  For the most part, XCode will correct you if you make a mistake here, you will get used to
  it pretty quickly.

*/
