/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;

public class Escaleno extends Triangulo {

    public Escaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    protected double calcularArea() {
        double s = getPerimetro() / 2; // semiperímetro
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public String toString() {
        return "Triangulo Escaleno{" +
               "\nLado A: " + ladoA +
               "\nLado B: " + ladoB +
               "\nLado C: " + ladoC +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea() +
               "\n}";
    }
}

