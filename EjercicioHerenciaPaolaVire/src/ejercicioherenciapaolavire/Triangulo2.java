
package ejercicioherenciapaolavire;

import EjercicioHerenciaPaolaVire.DosDimensione;

public class Triangulo2 extends DosDimensione{
 String estilo;
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }  
    
    
}
class Lados_3{
 public static void main(String[] args) {
        Triangulo2 t1=new Triangulo2();
        Triangulo2 t2=new Triangulo2();
        t1.setBase(4.0);
        t1.setAltura(4.0);
        t1.estilo="Estilo 1";
        t2.setBase(8.0);
        t2.setAltura(12.0);
        t2.estilo="Estilo 2";
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