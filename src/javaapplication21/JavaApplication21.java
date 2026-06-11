/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import Circulos.Circulo;

/**
 *
 * @author María J
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c1=new Circulo(2);
        c1.calcularDiametro();
        c1.calcularPerimetro();
        c1.calcularArea();
        System.out.println(c1.getRadio());
        System.out.println(c1.getDiametro());
        System.out.println(c1.getArea());
        
        

 Circulo c2=new Circulo(3);
        c2.calcularDiametro();
        c2.calcularPerimetro();
        c2.calcularArea();
        
        System.out.println(c2.getRadio());
        System.out.println(c2.getDiametro());
        System.out.println(c2.getPerimetro());
        System.out.println(c2.getArea());
    }
}
