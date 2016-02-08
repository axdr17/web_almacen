/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.computacionales;

import hibernate.configuracion.Hibernate;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.hibernate.Session;

/**
 *
 * @author Druet Rodriguez
 */
public class computacionalesDAO implements IcomputacionalesDAO {
    
    final private String SELECT_ALL_COMPUTACIONALES = "from computacionales";

    public computacionalesDAO() {
        super();
    }
    
    @Override
    public void guardar_computacional(computacionales elemento) {
        Session session = Hibernate.getSession();
		org.hibernate.Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(elemento);
			tx.commit();
		}
		catch ( Throwable e ){	
			if ( tx != null ) {
				tx.rollback();
			}
			
			if ( !(e instanceof Exception) ){
				Hibernate.initialize();
			}
			
			throw e;
		}
		finally{
			session.close();
			tx = null;
			session = null;
		}
    }

    @Override
    public Collection<computacionales> obtener_computacional() {
        Session session = Hibernate.getSession();	
	Collection<computacionales> grupos = new Vector<>();
	for(computacionales group:(List<computacionales>)session.createQuery(SELECT_ALL_COMPUTACIONALES).list() ){
            grupos.add( (computacionales) group.clone() );
	}
	session.close();
	return grupos;
    }
    
}
