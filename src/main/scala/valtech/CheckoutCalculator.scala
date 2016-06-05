package valtech

class CheckoutCalculator {
  val productRepository: Map[String, BigDecimal] = Map("apple" -> BigDecimal("0.60"), "orange" -> BigDecimal("0.25"))

  def calculateTotalCost(items: Seq[String]): String = {
    val totalCost = items.map(item => productRepository(item.toLowerCase)).fold(CheckoutCalculator.Zero)(_ + _)
    "£%.2f".format(totalCost)
  }
}


object CheckoutCalculator {
  val Zero = BigDecimal("0.00")
}