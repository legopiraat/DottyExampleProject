object Validator {

  type Validateable = Int | Long | Float

   def printValidation(func: => Boolean) = {
      println(s"The result of the validation is: [$func]")
  }

  val validate: (Validateable, Validateable) => Boolean = (a, b) => a == b
  val validate2: (Int | Long | Float, Int | Long | Float) => Boolean = (a, b) => a == b 

  trait Human
  trait ScalaDeveloper
  case class ScalaProgrammer(name: String) extends Human with ScalaDeveloper
  case class JavaProgrammer(name: String) extends Human

  def print(programmer: Human & ScalaDeveloper) = {
    println(programmer)
  }
}