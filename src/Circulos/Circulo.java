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
    private double diametro;
    private static final  double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
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
        this.diametro=radio*2;
        return diametro;
    }
    
    
@Override 
    public double calcularPerimetro(){
        this.perimetro=2*Circulo.PI*this.radio;
        return 0;
    }
    
    @Override 
        public double calcularArea(){
            this.area=Math.pow(radio,2)*Circulo.PI;
            return area;
        }
        
    }
        
    
