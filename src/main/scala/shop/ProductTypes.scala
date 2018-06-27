package shop

object ProductTypes {
    sealed trait ProductType
    case object Clothing extends ProductType
    case object Book extends ProductType
    case object EBook extends ProductType
}