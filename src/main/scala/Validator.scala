object Validator {

   def printValidation(func: => Boolean) = {
      println(s"The result of the validation is: [$func]")
  }

  val validateInt: (Int, Int) => Boolean = (a, b) => a == b
  val validateLong: (Long, Long) => Boolean = (a, b) => a == b
}