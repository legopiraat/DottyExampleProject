enum TaxRate(val rate: Double) {
  case Low extends TaxRate(0.06)
  case High extends TaxRate(0.21)
}

trait TaxRateCalculator extends PriceRounder {

    def calculateTaxedPrice(price: Double, taxRate: TaxRate) : Double = {
      roundUp(price + (taxRate.rate * price))
    }
}