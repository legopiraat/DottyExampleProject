package shop

import helper.PriceRounder

object TaxRateCalculator {
    sealed trait TaxRate(val rate: Double)
    case object Low extends TaxRate(0.06)
    case object High extends TaxRate(0.21)
}

trait TaxRateCalculator extends PriceRounder {

    import TaxRateCalculator._

    def calculateTaxedPrice(price: Double, taxRate: TaxRate) : Double = {
      roundUp(price + (taxRate.rate * price))
    }
}