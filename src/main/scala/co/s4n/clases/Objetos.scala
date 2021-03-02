package co.s4n.clases


object comp {

  def cuadrado(v: Float): Double = v * v

  def cubo(v: Double): Double = cuadrado(v.toFloat) * v

}

object comp2 {

  def cuadrado(v: Long): Long = v * v

  def cubo(v: Long): Long = cuadrado(v) * v

}

object prueba {

  def x = {
    println("x")
    1
  }

  val y = {
    println("y")
    x + 2
  }

  def z = {
    println("z")
    x
    x + "c"
  }

}