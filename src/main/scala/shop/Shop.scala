import DiscountRates._

class Shop extends TaxRateCalculator with PriceRounder {

  case class Product(id: Int, productType: ProductType, price: Double, description: String)

  var products = List(
    Product(1, ProductType.Book, 9.99, "Super cool Scala book"),
    Product(2, ProductType.Clothing, 19.99, "Super cool Scala T-Shirt"),
    Product(3, ProductType.EBook, 9.99, "Super cool Scala E-Book")
  )

  def createProduct(productType: ProductType, price: Double, description: String, taxRate: TaxRate): Unit = {
    products = Product(
      products.size + 1, 
      productType, 
      calculateTaxedPrice(price, taxRate), 
      description) :: products
  }

  def findProduct(id: Int): List[Product] = {
      products.filter(_.id == id)
  }

  def discountedPrice(product: Product): Discounted[Double] = {
      roundUp(product.price - (product.price * discountRate)
  }
}

object DiscountRates {
  type Discounted[T] = implicit Double => T
  def discountRate: Discounted[Double] = implicitly[Double]   
}