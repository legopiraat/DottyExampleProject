import Validator._

object Main {

  implicit val discountRate: Double = 0.1

  def main(args: Array[String]): Unit = {
      printValidation(validate(5, 5))
      printValidation(validate(5L, 5L))
      printValidation(validate(5f, 5f))
      
      printValidation(validate2(5, 5))
      printValidation(validate2(5L, 5L))
      printValidation(validate2(5f, 5f))

      printScalaProgrammer(new ScalaProgrammer("Gijs"))
      //printScalaProgrammer(new JavaProgrammer("Henk"))
  }
}