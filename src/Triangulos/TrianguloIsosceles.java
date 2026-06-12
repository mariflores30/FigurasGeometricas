/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;
/**
 *
 * @author María J
 */
    public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(double ladoAB, double ladoC) {
        super(ladoAB, ladoAB, ladoC);
    }

    @Override
    protected double calcularArea() {
        return ladoC * (Math.sqrt(4 * Math.pow(ladoA, 2) - Math.pow(ladoC, 2)) / 4);
    }

    @Override
    public String toString() {
        return "Triangulo Isosceles{" +
               "\nLado A: " + ladoA +
               "\nLado B: " + ladoB +
               "\nLado C: " + ladoC +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea() +
               "\n}";
    }
}