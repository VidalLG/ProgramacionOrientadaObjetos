package Java_Basic.ModificadoresDeAcceso;

public class ModificadorPrivate {

    private void ejemploTres(){
        System.out.println("No se puede acceder a este metodo desde otra clase, ya que es privada");
        /*  Modificador de acceso private es el mas restrictivo y especifica que los elenentos que lo utilizan,
        * solo pueden ser accedidos desde la clase en la que se encuentran, la unica manera de acceder a ellos
        * es por medio de los metodos getter y setter. Al utilizar metodos privados se puede entender que
        * estamos encapsulando codigo.*/
    }






}
