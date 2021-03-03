package co.s4n.clases

import co.s4n.clases._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ClasesSpec extends AnyFlatSpec with Matchers {

  "1. El cuadrado de 2  " should "4" in {
    comp.cuadrado(2) shouldEqual 4
  }

  "2. El cubo de 2 " should "8" in {
    comp.cubo(2) shouldEqual 8
  }

  "3. Despachar IO" should " true " in {
    VentaDeChurrus.despachar(IO) shouldEqual true
  }

  "4. Despachar Docker" should " true " in {
    VentaDeChurrus.despachar(Docker) shouldEqual false
  }

}
