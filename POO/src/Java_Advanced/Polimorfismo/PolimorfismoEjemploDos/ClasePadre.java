package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

import java.util.Scanner;

public abstract class ClasePadre {
    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);

    public void pedirDartos (){

        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();
        System.out.println("Dame el segundo valor: ");
        valorDos = entrada.nextInt();

    }

    //Polimorfismo debemos crear metodos abstractos, y , por ende la clase tambien debe ser abstracta
    /* cabe mencionar que los metodos abstractos no llevan las llaves "{ }" ya que su logica (codigo)
      se implementa en otra clase. */


    public abstract void  operaciones ();

    public void mostrarResultado (){
        System.out.println("El resultado es: " + resultado);
    }











}
