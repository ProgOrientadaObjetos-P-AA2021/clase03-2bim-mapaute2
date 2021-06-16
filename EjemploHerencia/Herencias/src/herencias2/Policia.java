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
public class Policia extends Persona{
    
    private String rango;
    
    public Policia(String n, String a, int e, String rango){
        super(n, a, e);
        establecerRango(rango);
    }
    
    public void establecerRango(String tipo){
        rango=tipo;
    }
    public String obtenerRango(){
        return rango;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), obtenerRango());
    }
}
