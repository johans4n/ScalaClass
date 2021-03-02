package co.s4n.clases

class Contador(val contador: Int) {

  def incr(opcional: Int = 1): Contador = new Contador(contador + opcional)

  def decr(): Contador = new Contador(contador - 1)

  def ajuste(sum: Sumador): Contador = new Contador(sum.adicionar(contador))

}

class Sumador(monto: Int) {
  def adicionar(valor: Int) = valor + monto
}
