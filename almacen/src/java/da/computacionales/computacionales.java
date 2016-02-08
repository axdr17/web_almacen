/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.computacionales;

import da.medios.medios;

/**
 *
 * @author Druet Alan
 */
public class computacionales extends medios{
    public String marca;
    public String anio;
          
    public computacionales() {
        super();
        this.marca=null;
        this.anio=null;
    }
    
    public computacionales(int codigo, String material, String productor, double costo, String fecha,String marca,String anio) {
        super(codigo, material, productor, costo, fecha);
        this.marca=marca;
        this.anio=anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    @Override
    public Object clone(){
    	computacionales grupo = new computacionales();
    	grupo.id = id;
        grupo.anio=anio;
        grupo.codigo=codigo;
        grupo.costo=costo;
        grupo.fecha=fecha;
        grupo.marca=marca;
        grupo.material=material;
        grupo.productor=productor;
    	return grupo;
    }
    
    public String toString(){
        return super.toString()+", "+this.marca+", "+this.anio;
    }
}
