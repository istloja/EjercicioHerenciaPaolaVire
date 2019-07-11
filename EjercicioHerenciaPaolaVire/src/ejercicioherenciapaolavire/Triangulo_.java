
package ejercicioherenciapaolavire;

import ejercicioherenciapaolavire.Dos_Dimensiones;

public class Triangulo_ extends Dos_Dimensiones{
  private String estilo;
    //Constructor
    Triangulo_(String s, double b, double h){
        setBase(b);
        setAltura(h);
        estilo=s;
    }
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lado3{
    public static void main(String[] args) {
        Triangulo_ t1=new Triangulo_("Estilo 1",4.0,4.0);
        Triangulo_ t2=new Triangulo_("Estilo 2",8.0,12.0);
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());   
}
}