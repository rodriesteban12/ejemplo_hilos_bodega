/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icesi.edu.co.servicios.problemadelabodega;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author distribuidos
 */
public class Bodega {
    
    private int tipo1,tipo2;
    private ArrayList<String> tipoo1,tipoo2;
    
    public Bodega(){
        tipo1=1;
        tipo2=2;
        tipoo1=new ArrayList<String>() ;
        tipoo2=new ArrayList<String>();
    }
    
    public void descargarArticulo(int tipo){
        if(tipo==tipo1){
            tipoo1.add("Uno");
            
        }else if(tipo==tipo2){
             tipoo2.add("Uno");
             
        }
    }
    
    public void crearPaquete(){
        for (int i = 0; i < 3; i++) {
            tipoo1.remove(tipoo1.size()-1);
        }
        
        for (int i = 0; i < 4; i++) {
            tipoo2.remove(tipoo2.size()-1);
        }
    }
    
    public ArrayList<String> getListaTipo1(){
        return tipoo1;
    }
    
    public ArrayList<String> getListaTipo2(){
        return tipoo2;
    }
}
