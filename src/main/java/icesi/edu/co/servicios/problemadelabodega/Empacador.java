/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icesi.edu.co.servicios.problemadelabodega;

import com.sun.imageio.plugins.common.BogusColorSpace;

/**
 *
 * @author distribuidos
 */
public class Empacador extends Thread {
    private Bodega bodega;
    
    public Empacador(Bodega bodega){
       this.bodega=bodega;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(bodega.getListaTipo1().size()+"tipo1");
             System.out.println(bodega.getListaTipo2().size()+"tipo2");
            if(bodega.getListaTipo1().size()>3 -1 && bodega.getListaTipo2().size()>4 -1){
                bodega.crearPaquete();
                 System.out.println("Se empacó un paquete");
            }else{
                try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            }
            
        }
    }
    
    
}
