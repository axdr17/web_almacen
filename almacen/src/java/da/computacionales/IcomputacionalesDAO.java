/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.computacionales;

import java.util.Collection;

/**
 *
 * @author Druet Alan
 */
public interface IcomputacionalesDAO {    
    
    void guardar_computacional(computacionales elemento);
    
    public Collection<computacionales> obtener_computacional();
    
}
