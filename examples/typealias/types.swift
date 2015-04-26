// run command: xcrun swift types.swift

/*
everything in Swift in bound to the module name, if defined in the current module
nothing is require, otherwise an import is required (e.g. import MyFramework)
*/

//you can write this anywhere in the module
typealias FirstName = String
typealias LastName = String
typealias FullName = (FirstName, LastName)

let firstName:FirstName = "Jane"
let lastName:LastName = "Smith"

println(firstName)
println(lastName)

let fullName: FullName = (firstName, lastName)
println(fullName)

func numLettersInName(fullName: FullName) -> Int {
  /*
    if you defined typealias FullName = (first: FirstName, last: LastName) you could also do
    let first = fullName.first
    let last = fullName.last
  */
  let (first, last) = fullName
  return count(first) + count(last)
}

println("letters in name: \(numLettersInName(fullName)) ")
