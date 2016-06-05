package valtech

import org.scalatest.{MustMatchers, GivenWhenThen, FeatureSpec}

class CheckoutCalculatorSpec extends FeatureSpec with GivenWhenThen with MustMatchers {
  info("Shopping cart")
  info("A shop only sells apples and oranges")

  feature("Step one") {
    scenario("Calculate the cost of a collection of apples and oranges") {
      Given("a collection of three apples and one orange")
      And("an apple costs 60p and an orange cost 25p")
      val items = Seq("Apple", "Apple", "Orange", "Apple")

      When(s"the checkout calculator calculates the cost of the ${items.mkString(", ")}")
      val totalCost = new CheckoutCalculator().calculateTotalCost(items)

      Then("the total cost is £2.05")
      totalCost must be("£2.05")
    }

    scenario("Calculate the cost of a collection of just apples") {
      Given("a collection of two apples")
      And("an apple costs 60p and an orange cost 25p")
      val items = Seq("Apple", "Apple")

      When(s"the checkout calculator calculates the cost of the ${items.mkString(", ")}")
      val totalCost = new CheckoutCalculator().calculateTotalCost(items)

      Then("the total cost is £1.20")
      totalCost must be("£1.20")
    }

    scenario("Calculate the cost of a collection of just apples") {
      Given("a collection of two apples")
      And("an apple costs 60p and an orange cost 25p")
      val items = Seq("Apple", "Apple")

      When(s"the checkout calculator calculates the cost of the ${items.mkString(", ")}")
      val totalCost = new CheckoutCalculator().calculateTotalCost(items)

      Then("the total cost is £1.20")
      totalCost must be("£1.20")
    }
  }
}
