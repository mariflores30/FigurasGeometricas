/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulos;
import javaapplication21.Figuras;
/**
 *
 * @author María J
 */
public class Circulo extends Figuras{
    private double radio;
    private static final  double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    protected double calcularDiametro(){
        return radio *2;
    }
    
    
@Override 
    protected double calcularPerimetro(){
        return 2*Circulo.PI*this.radio;
    }
    
    @Override 
        protected double calcularArea(){
            return Math.pow(radio,2)*Circulo.PI;
        }
        
    }
        
    
