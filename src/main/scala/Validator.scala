object Validator {

   def printValidation(func: => Boolean) = {
      println(s"The result of the validation is: [$func]")
  }

  // The new way
  type Validatable = Int | Long | Float
  val validate: (Validatable, Validatable) => Boolean = (a, b) => a == b

  // The old way
  val validateInt: (Int, Int) => Boolean = (a, b) => a == b
  val validateLong: (Long, Long) => Boolean = (a, b) => a == b
}