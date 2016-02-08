/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.medios;
import da.Persistent;
/**
 *
 * @author Druet Alan
 */
public class medios extends Persistent implements Cloneable{
    public int codigo;
    public String material;
    public String productor;
    public double costo;
    public String fecha;
    
    public medios() {
        super();
        this.codigo =0;
        this.material = null;
        this.productor = null;
        this.costo = 0;
        this.fecha = null;
    }
    
    public medios(int codigo, String material, String productor, double costo, String fecha) {
        super();
        this.codigo = codigo;
        this.material = material;
        this.productor = productor;
        this.costo = costo;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public Object clone(){
    	medios grupo = new medios();
    	grupo.id = id;
    	return grupo;
    }
    
    public String toString(){
        return this.codigo+", "+this.material+", "+this.productor+", "+this.costo+", "+this.getFecha();
    }
}
