import Validator._

object Main {

  implicit val discountRate: Double = 0.1

  def main(args: Array[String]): Unit = {
      printValidation(validateInt(5, 5))
      printValidation(validateLong(5L, 5L))
  }
}