//run command: xcrun swift enum.swift

typealias Doors = Int
typealias MPH = Int

enum Vehicle {

  // use type aliases and/or named parameters, who knows what Int would mean in the context without it?
  // if it is super clear what the type is, then it is OK to discard the above advice, but be careful
  // no need to over complicated anything

  // i will use type aliases for Car and name parameters for Truck for this example
  case Truck(torque: Int)
  case Car(Doors, MPH)

}

func drive(vehicle: Vehicle) {
  //exhaustive match
  switch vehicle {
    case Vehicle.Truck(let torque): println("i got \(torque) foot/pounds of torque and carry equipment")
    case Vehicle.Car(let doors, let maxMPH): println("i got \(doors) doors and go \(maxMPH) mph")
  }
}

let f150 = Vehicle.Truck(torque: 300)
let ferrari = Vehicle.Car(2, 200)

drive(f150)
drive(ferrari)
