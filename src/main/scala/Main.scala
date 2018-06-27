import Validator._
import DiscountRates._

object Main {

  implicit val discountRate: Double = 0.1

  def main(args: Array[String]): Unit = {
      // old -> printValidation(validateInt(5, 5))
      // old -> printValidation(validateLong(5L, 5L))
      //printValidation(validateInt(5, 5L)) <-- Compileert niet.

      printValidation(validate(5, 5))
      printValidation(validate(5, 5L))
      printValidation(validate(5, 6f))

      val shop = new Shop()
      shop.createProduct(ProductType.Clothing, 4.12, "Super cool Scala hoodie", TaxRate.High)

      println(shop.findProduct(1))
      println(shop.findProduct(4))

      val product = shop.findProduct(4).head
      println(shop.discountedPrice(product))
  }
}