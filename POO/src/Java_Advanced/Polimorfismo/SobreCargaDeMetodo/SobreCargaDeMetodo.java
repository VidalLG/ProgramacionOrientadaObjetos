package Java_Advanced.Polimorfismo.SobreCargaDeMetodo;

public class SobreCargaDeMetodo {
    public void suma(int a, int b){
        System.out.println("resultado : " + (a + b));
    }

    public void suma (int a, int b, int c){
        System.out.println("resultado : " + (a + b + c));
    }


    //Motor

    public static void main(String[] args) {
        SobreCargaDeMetodo objSobreCargaDeMetodo = new SobreCargaDeMetodo();

        objSobreCargaDeMetodo.suma(100,100);
        objSobreCargaDeMetodo.suma(200,200,200);


    }



}
