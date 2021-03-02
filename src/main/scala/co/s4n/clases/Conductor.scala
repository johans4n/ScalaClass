package co.s4n.clases

/**
 * Clase conductor
 *
 * @param nombre variable de tipo string que hace referencia al nombre del conductor
 * @param apellido   variable de tipo string que hace referencia al apellido del conductor
 * @param totalCarreras variable de tipo int que hace referencia al total de carreras realizadas por el conductor
 * @param carrerasTerminadas variable de tipo int que hace referencia al total de carreras terminadas por el conductor
 */
class Conductor(val nombre: String, val apellido: String, val totalCarreras: Int, val carrerasTerminadas: Int)

/**
 * Clase escudería
 *
 * @param nombre variable de tipo string que hace referencia al nombre
 * @param conductor Variable de tipo Conductor que es una composición de la clase Conductor
 */
class Escudería(val nombre: String, val conductor: Conductor)