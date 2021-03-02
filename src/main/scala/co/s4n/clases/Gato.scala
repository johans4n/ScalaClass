package co.s4n.clases

/**
 * Clase que hace referencia a un gato
 *
 * @param nombre Nombre del gato
 * @param color  Color del gato
 * @param comida Comida favorita
 */
class Gato(val nombre: String, val color: String, val comida: String)

/**
 * Instancia de un objeto de tipo Gato
 *
 */
object IO extends Gato(nombre = "IO", color = "Fawn", comida = "Churrus")

/**
 * Instancia de un objeto de tipo Gato
 *
 */
object Make extends Gato(nombre = "Make", color = "Red", comida = "Leche")

/**
 * Instancia de un objeto de tipo Gato
 *
 */
object Docker extends Gato(nombre = "Docker", color = "Blue", comida = "Cuido")


/**
 * Objeto que implementa una función para verificar si la comida favorita de un gato es churrus
 *
 */
object VentaDeChurrus {

  /**
   * Método que devuelve true si la comida favorita de un gato es "Churrus"
   *
   * @param gato objeto de tipo Gato a recibir
   * @return true o false dependiendo de si la comida favorita del gato es "Churrus"
   */
  def despachar(gato: Gato): Boolean = gato.comida match {
    case "Churrus" => true
    case _ => false
  }

}
