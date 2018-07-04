import Validator._

object Main {

  def main(args: Array[String]): Unit = {
      printValidation(validateInt(5, 5))
      printValidation(validateLong(5L, 5L))
  }
}