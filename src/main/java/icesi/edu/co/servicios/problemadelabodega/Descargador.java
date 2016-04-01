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
public class Descargador extends Thread {
    
    private Bodega bodega;
    public Descargador(Bodega bodega){
        this.bodega=bodega;
    }

    @Override
    public void run() {
        while(true){
           if(bodega.getListaTipo1().size()*9<=90 && bodega.getListaTipo2().size()*12<=180){
               int valor=(int) (Math.random() * 2)+1;
               
           bodega.descargarArticulo(valor);
          
           }
               try {
                sleep(500);
            } catch (InterruptedException e) {
            
        }}
    }
    
    
}
