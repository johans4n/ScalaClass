package co.s4n.clases

class Gato(val nombre: String, val color: String, val comida: String)

object IO extends Gato(nombre = "IO", color = "Fawn", comida = "Churrus")

object Make extends Gato(nombre = "Make", color = "Red", comida = "Leche")

object Docker extends Gato(nombre = "Docker", color = "Blue", comida = "Cuido")


object VentaDeChurrus {
  def despachar(gato: Gato): Boolean = gato.comida match {
    case "Churrus" => true
    case _ => false
  }
}
