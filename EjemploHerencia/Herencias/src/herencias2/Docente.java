/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author usuario
 */
public class Docente extends Persona{
    
    private double sueldo;
    
    public Docente(String n, String a, int e, double sue){
        super(n, a, e);
        establecerSueldo(sue);
    }
    
    public void establecerSueldo(double tipo){
        
        if (sueldo <1000){
            sueldo=1000;
        }else{
           sueldo=tipo; 
        }
    }
    public double obtenerSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), obtenerSueldo());
    }
}
