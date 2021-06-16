/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

import java.util.ArrayList;
import herencias2.Policia;
/**
 *
 * @author usuario
 */
public class ReportePolicia extends Reporte{
    
    private double promedioEdades;
    private ArrayList<Policia> listaPolicia;
    
    public ReportePolicia(String c, ArrayList<Policia> li){
        super(c);
        establecerListaPolicia(li);
    }
    
    public void establecerPromedioEdades(){
       double suma = 0;
       for(int i=0; i<listaPolicia.size();i++){
           suma = suma + obtenerListaPolicia().get(i).getEdad();
           
       }
       promedioEdades = suma/listaPolicia.size();
        
    }
    
    public void establecerListaPolicia(ArrayList<Policia> tipo){
        listaPolicia = tipo;       
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    public ArrayList<Policia> obtenerListaPolicia(){
        return listaPolicia;
    }
    
    @Override
    public String toString(){  
        String cadena = String.format("%s\nReporte Policia\n",
                super.toString());
        
        for(int i=0;i<listaPolicia.size();i++){
            cadena = String.format("%sNombre: %s\nApelldio: %s\n"
                    + "Edad: %d\nRango: %s\n",cadena,
                    obtenerListaPolicia().get(i).getNombre(),
                    obtenerListaPolicia().get(i).getApellido(),                 
                    obtenerListaPolicia().get(i).getEdad(),
                    obtenerListaPolicia().get(i).obtenerRango());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\n",
                cadena,obtenerPromedioEdades());
        return cadena;
    }
    
}
