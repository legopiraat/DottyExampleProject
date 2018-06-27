package helper

trait PriceRounder {
    
    def roundUp(price: Double) = {
      BigDecimal(price).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}