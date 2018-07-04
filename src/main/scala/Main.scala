import DiscountRates._

object Main {

  implicit val discountRate: Double = 0.1

  def main(args: Array[String]): Unit = {
      val shop = new Shop()
      shop.createProduct(ProductType.Clothing, 4.12, "Super cool Scala hoodie", TaxRate.High)

      println(shop.findProduct(1))
      println(shop.findProduct(4))

      val product = shop.findProduct(4).head
      println(shop.discountedPrice(product))
  }
}