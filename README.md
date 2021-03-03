# ScalaClases :pencil:

ScalaClases es una colección de ejemplos utilizando varias clases haciendo uso de conceptos como herencia y objetos.

## Requisitos :wrench:

* **sbt version: 1.4.7**
* **Scala version: 2.13.4**

## Implementación :hammer:

```
$ sbt console
$ run
```

## Clases :bulb:
* **Conductor**
  

* **Escudería** 
  

* **Contador(contador:Int):** 
  
    * **incr(opcional:Int = 1):** Incr es una función que retorna un objeto de tipo contador
  * **decr():** Decr es una función que retorna un objeto de tipo contador
  * **ajuste():** Ajuste es una función que recibe un objeto de la clase Sum y retorna un Contador
    

* **Sumador(monto:Int)** 
    * **adicionar(valor: Int):** Recibe un valor y se lo suma al monto de la clase
    

* **Gato(nombre:String, color:String, comida:String)**
  * **VentaDeChurrus** 
      * **despachar(gato:Gato):** Método que devuelve true si la comida favorita de un gato es "Churrus"
    
* **Comp**
  * **cuadrado(v:Float):** Retorna el cuadrado de un valor
  * **cubo(v:Double):** Retorna el Cubo de un valor
    

* **Comp2**
    * **cuadrado(v:Double):** Retorna el cuadrado de un valor
    * **cubo(v:Double):** Retorna el Cubo de un valor




## Archivos de pruebas
Al interior encontrará archivos de pruebas los cuales son
* **ClasesSpec:** Pruebas para todas las clases.
