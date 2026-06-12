/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;

/**
 *
 * @author María J
 */
public class Cuadrado extends Rectangulo {
    protected double Area;
    protected double Perimetro;
    protected double lado;
    protected double base;
    
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    protected double calcularArea() {
        return Math.pow(base, 2);
    }

    
   @Override
protected double calcularPerimetro() {
    return 4 * Math.pow(lado, 1);
}
    

    @Override
    public String toString() {
        return "Cuadrado{" +
               "\nLado: " + base +
               "\nPerimetro: " + calcularPerimetro() +
               "\nArea: " + calcularArea() +
               "\n}";
      }
}

