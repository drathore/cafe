/**
  * Created by deepesh on 28/06/2017.
  */
class CafeAppTest extends org.scalatest.FunSuite {

  test("when customer just had cola, one cola price in the total"){
    val listOfItems = List("Cola")

    val billAmount = CafeApp.calculateBillFor(listOfItems)
    assert(billAmount == BigDecimal(0.50))
  }
}
