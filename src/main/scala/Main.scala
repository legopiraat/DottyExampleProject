import shop.TaxRateCalculator
import shop.ProductTypes
import shop._

object Main {

  implicit val discountRate: Double = 0.1

  def main(args: Array[String]): Unit = {
      val shop = new Shop()
      shop.createProduct(ProductTypes.Clothing, 4.12, "Super cool Scala hoodie", TaxRateCalculator.High)

      println(shop.findProduct(1))
      println(shop.findProduct(4))

      val product = shop.findProduct(4).head
      println(shop.discountedPrice(product))
  }
}