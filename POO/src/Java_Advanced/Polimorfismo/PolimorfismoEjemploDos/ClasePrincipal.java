package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClasePrincipal {
    public static void main(String[] args) {

        ClasePadre suma = new ClaseHijaSuma();
        suma.pedirDartos();
        suma.operaciones();
        suma.mostrarResultado();


        ClasePadre resta = new ClaseHijaResta();
        resta.pedirDartos();
        resta.operaciones();
        resta.mostrarResultado();

    }




}
