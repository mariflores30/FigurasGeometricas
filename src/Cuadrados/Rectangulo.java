/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;
import javaapplication21.Figuras;

/**
 *
 * @author María J
 */
public class Rectangulo extends Figuras {

    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getDiagonal() {
        return calcularDiagonal();
    }

    private double calcularDiagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    protected double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    protected double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
               "\nBase: " + base +
               "\nAltura: " + altura +
               "\nDiagonal: " + getDiagonal() +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea() +
               "\n}";
    }
}