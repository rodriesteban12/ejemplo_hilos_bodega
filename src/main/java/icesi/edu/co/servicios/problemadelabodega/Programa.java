/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icesi.edu.co.servicios.problemadelabodega;

/**
 *
 * @author distribuidos
 */
public class Programa {
   
   
   
    
    public static void main(String main[]){
       Bodega bodega=new Bodega();
        
        Programa programa = new Programa();
        Descargador procesoDescargador=new Descargador(bodega);
        Empacador procesoEmpacador=new Empacador(bodega);
        
        procesoEmpacador.start();
        procesoDescargador.start();
        
    }
            
}
