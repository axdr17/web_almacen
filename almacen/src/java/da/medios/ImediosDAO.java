/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.medios;

import java.util.Collection;


/**
 *
 * @author Druet Rodriguez
 */
public interface ImediosDAO {
    
    void cargar_oficina();
    
    void cargar_computacional();
    
    public Collection<medios> obtener_medios();
}
