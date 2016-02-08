/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.oficina;

import java.util.Collection;

/**
 *
 * @author PC90
 */
public interface IoficinaDAO {
    
    public Collection<oficina> obtener_oficina();

    void guardar_oficina(oficina elemento);
    
}
