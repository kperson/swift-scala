// run command: scala types.scala

object model {

  type FirstName = String
  type LastName = String
  type FullName = (FirstName, LastName)

}

import model._

val firstName:FirstName = "Jane"
val lastName:LastName = "Smith"

println(firstName)
println(lastName)

val fullName: FullName = (firstName, lastName)
println(fullName)

def numLettersInName(name: FullName) : Int = {
  val (first, last) = name
  return first.length + last.length
}

println(s"letters in name: ${numLettersInName(fullName)}")

/*
this can also be bound to a package, normally you will do this

this meaning that is contained within the package automatically has these
definitions, like normal package behavior
see http://www.scala-lang.org/docu/files/packageobjects/packageobjects.html

this way you don't have to import the aliases all over the place
remember! you can only have one package object per package

//maybe in a com/demo/package.scala
package com.demo
package object model {

  type FirstName = String
  type LastName = String
  type FullName = (FirstName, LastName)

}

//if outside of package
import com.demo.model._
*/
