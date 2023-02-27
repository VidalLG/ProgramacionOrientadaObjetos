package Java_Advanced.Constructores;

public class ClasePrincipal {
    public static void main(String[] args) {

        //Sin Constructor
        //Instancia a la clase que no tiene Constructor

        SinConstructor sin = new SinConstructor();
        sin.PedirNombre();
        sin.Imprimir();

        System.out.println("----------------------------------------------");
        // Con Constructor
        //Instancia a la clase que tiene el constructor
        ConConstructor con = new ConConstructor();





    }
}
