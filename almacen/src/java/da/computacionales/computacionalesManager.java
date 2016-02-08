/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.computacionales;

import da.IcomputacionalesManager;
import java.util.Collection;

/**
 *
 * @author Druet Rodriguez
 */
public class computacionalesManager implements IcomputacionalesManager {
    private IcomputacionalesDAO computacionalesDao;

    public computacionalesManager() {
        computacionalesDao =new computacionalesDAO();
    }

    @Override
    public void guardar_computacional(computacionales elemento) {
        this.computacionalesDao.guardar_computacional(elemento);
    }


    @Override
    public Collection<computacionales> obtener_computacional() {
        return this.computacionalesDao.obtener_computacional();
    } 
    
}
