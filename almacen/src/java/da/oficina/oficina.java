/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.oficina;

import da.medios.medios;

/**
 *
 * @author Druet Alan
 */
public class oficina extends medios {
    public String pais;
    
    public oficina() {
        super();
        this.pais=null;
    }
    
    public oficina(int codigo, String material, String productor, double costo, String fecha,String pais) {
        super(codigo, material, productor, costo, fecha);
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public Object clone(){
    	oficina grupo = new oficina();
    	grupo.id = id;
        grupo.pais=pais;
        grupo.codigo=codigo;
        grupo.costo=costo;
        grupo.fecha=fecha;
        grupo.material=material;
        grupo.productor=productor;
    	return grupo;
    }
    
    public String toString(){
        return super.toString()+", "+this.pais;
    }
}
