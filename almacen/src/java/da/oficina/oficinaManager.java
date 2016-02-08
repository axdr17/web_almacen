/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.oficina;

import da.IoficinaManager;
import java.util.Collection;

/**
 *
 * @author PC90
 */
public class oficinaManager implements IoficinaManager {
    private IoficinaDAO oficinaDao;

    public oficinaManager() {
        oficinaDao = new oficinaDAO();
    }
    
    @Override
    public void guardar_oficina(oficina elemento) {
        this.oficinaDao.guardar_oficina(elemento);
    }

    @Override
    public Collection<oficina> obtener_oficina() {
        return this.oficinaDao.obtener_oficina();
    }
    
}
