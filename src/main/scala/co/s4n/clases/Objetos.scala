package co.s4n.clases

/**
 * Objeto que contiene 2 funciones adentro
 */
object comp {
  /**
   * Retorna el cuadrado de un valor
   *
   * @param v Valor a recibir
   * @return Valor transformado al cuadrado
   */
  def cuadrado(v: Float): Double = v * v

  /**
   * Retorna el cubo de un valor utilizando la función cuadrado
   *
   * @param v Valor a recibir
   * @return Valor transformado al cubo
   */
  def cubo(v: Double): Double = cuadrado(v.toFloat) * v

}

/**
 *  Objeto que transforma las funciones cuadrado y cubo en funciones que retornan con tipo long
 */
object comp2 {

  def cuadrado(v: Long): Long = v * v

  def cubo(v: Long): Long = cuadrado(v) * v

}

/**
 * Objeto con 3 funciones que retornan una variable.
 *
 */
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