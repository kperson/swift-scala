//run command: scala enum.scala


//begin enum definition
sealed abstract class Vehicle

final case class Truck(torque: Int) extends Vehicle
final case class Car(numDoors: Int, maxMPH: Int) extends Vehicle
//end enum definition

def drive(vehicle: Vehicle) {
  //exhaustive match
  vehicle match {
    case Truck(torque) => println(s"i got ${torque} foot/pounds of torque and carry equipment")
    case Car(doors, maxMPH) => println(s"i got ${doors} doors and go ${maxMPH} mph")
  }
}

val f150 = Truck(300)
val ferrari = Car(2, 200)

drive(f150)
drive(ferrari)
