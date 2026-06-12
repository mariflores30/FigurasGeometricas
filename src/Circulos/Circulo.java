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
    
    public double calcularDiametro(){
        return radio *2;
    }
    
    
@Override 
   public double calcularPerimetro(){
        return 2*Circulo.PI*this.radio;
    }
    
    @Override 
        public double calcularArea(){
            return Math.pow(radio,2)*Circulo.PI;
        }

    @Override
    public String toString() {
        return "Circulo{\nRadio:" + radio +"\ndiametro:" +getDiametro() +"\nCircunferencia:" + getPerimetro ()+"\narea:"+ getArea() + "\n}";
    }

    public boolean getRadio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }
        
    
