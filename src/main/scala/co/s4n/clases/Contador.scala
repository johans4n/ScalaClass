package co.s4n.clases

/**
 * Clase de tipo contador que recibe un parámeto entero el cual corresponde a un contador
 *
 * @param contador Variable entera que se toma como contador y es utilizada en las funciones
 */
class Contador(val contador: Int) {

  /**
   * Incr es una función que retorna un objeto de tipo contador
   *
   * @param opcional Entero a recibir si no es enviado como parámetro tendrá un valor por omisión de 1
   * @return Objeto de tipo contador el cual se le suma el entero en su atributo contador
   */
  def incr(opcional: Int = 1): Contador = new Contador(contador + opcional)

  /**
   * Decr es una función que retorna un objeto de tipo contador
   *
   * @return Objeto de tipo contador el cual se le resta el entero en su atributo contador
   */
  def decr(): Contador = new Contador(contador - 1)

  /**
   * ajuste es una función que recibe un objeto de la clase Sum y retorna un Contador
   *
   * @param sum Objeto de la clase Sum
   * @return Objeto de tipo Contador al cual se le asigna un valor resultado de un método de la clase sum en su
   *         valor 'contador'
   */
  def ajuste(sum: Sumador): Contador = new Contador(sum.adicionar(contador))

}

/**
 * Esta clase recibe un monto como parámetro
 *
 * @param monto Valor de tipo entero
 */
class Sumador(monto: Int) {

  /**
   * Sumador recibe un valor y se lo suma al monto de la clase
   *
   * @param valor Valor entero
   * @return Valor sumado con el monto
   */
  def adicionar(valor: Int) = valor + monto

}
