/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import da.computacionales.computacionales;
import java.util.Collection;


/**
 *
 * @author Druet Rodriguez
 */
public interface IcomputacionalesManager {
    
    void guardar_computacional(computacionales elemento);
    
    public Collection<computacionales> obtener_computacional();
   
}
