/*
Remember: Pattern matching allows us to destruct an element

Pattern are very powerful in scala, scala has a special class to make pattern
matching a very.

It's called a case class.  They are like enums (in fact we modeled enums in scala using case classes)
You can pattern match of the parameter of the constructor.
*/

case class Dog(breed: String, weight: Int)
case class Human(name: String, age: Int)

val fluffy = Dog("Poddle", 2)
val billy = Human("Billy", 8)


def describeThing(x: Any) {
  x match {
    case Dog(breed, weightInPounds) => println(s"${breed} weighs ${weightInPounds} pounds")
    case Human(name, age) => println(s"${name} is ${age} years old")
    case _ => println("i have no clue what this is")
  }
}

describeThing(fluffy)
describeThing(billy)


/*
  I want to point out some benefits of writing code like this.
  1. The inputs need not be be related.
     That is, they don't have to share a common ancestor class or a child/parent relation ship is not required.
     This means we don't have to enforce artificial and brittle structure in our code.
  2. This code is super readable,
     Sometimes we try to replicate this behavior, but is not very readable.

    //I'm not a Java programmer, but I believe this usually expressed like the following
    void describeThing(x: java.lang.Object) {
      if (x.getClass == Dog.class) {
        Dog d = (Dog)x
        println(s"${d.breed} weighs ${d.weightInPounds} pounds")
      }
      else if(x.geClass == Human.class) {
        Human h = (Human)x
        println(s"${h.name} is ${h.age} years old")
      }
      else {
        "i have no clue what this is"
      }
    }

    //NOT READABLE
    //TOO MUCH CODE
    //TOO COMPLICATED
}
*/

/*
So when is pattern matching useful?
I used it quite a bit, a lot of times as an alternative to an if else flow.

My favorite use case is routing messages.  Recently, I made an app, MyTube60.  To play
videos, I used a JavaScript bridge




*/
