/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.medios;

import da.ImediosManager;
import java.util.Collection;

/**
 *
 * @author Druet Rodriguez
 */
public class mediosManager implements ImediosManager{
    private ImediosDAO mediosDao;

    public mediosManager() {
        mediosDao=new mediosDAO();
    }
    
    @Override
    public Collection<medios> obtener_medios() {
        return this.mediosDao.obtener_medios();
    }
    
    public int codigo_costo(){
        int codigo=0;
        double costo=0;
        Collection<medios> groups =mediosDao.obtener_medios();
        for(medios elemento:groups){
            if(elemento.costo>costo){
               costo=elemento.getCosto();
               codigo=elemento.getCodigo();
            }
        }
        return codigo;
    }
    
    public int codigo_max(){
        int codigo=0;
        Collection<medios> groups =mediosDao.obtener_medios();
        for(medios elemento:groups){
            if(elemento.codigo>codigo){
               codigo=elemento.getCodigo();
            }
        }
        return codigo;
    }
    
    public String obtener_productor(int codigo){
        Collection<medios> groups =mediosDao.obtener_medios();
        for(medios elemento:groups){
            if(elemento.codigo==codigo){
                return elemento.getProductor();
            }
        }
        return "";
    }
    
    public void mostrar_medios(double valor){
        Collection<medios> groups=mediosDao.obtener_medios();
        for(medios elemento:groups){
            if(elemento.costo>valor)
                System.out.println(elemento.toString());
        }
    }
    
    public void accesoDatos(){
        this.mediosDao.cargar_computacional();
        this.mediosDao.cargar_oficina();
    }
    
    public String generar_codigo(){
        int codigo=0;
        codigo=codigo_max()+1;
        return ""+codigo;
    }
    
}
