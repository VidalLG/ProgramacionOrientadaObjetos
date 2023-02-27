package Java_Advanced.Polimorfismo.AnulacionDeMetodo;

public class Perros extends Animales {

    public void sound (){
        System.out.println("Los perros ladran");

    }

}



class m{

    public static void main(String[] args) {
        Perros p = new Perros();
        p.sound();

    }


}
