/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.oficina;

import hibernate.configuracion.Hibernate;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.hibernate.Session;

/**
 *
 * @author PC90
 */
public class oficinaDAO implements IoficinaDAO{
    final private String SELECT_ALL_OFICINA = "from oficina";
    
    public oficinaDAO() {
    }

    @Override
    public Collection<oficina> obtener_oficina() {
        Session session = Hibernate.getSession();	
	Collection<oficina> grupos = new Vector<>();
	for(oficina group:(List<oficina>)session.createQuery(SELECT_ALL_OFICINA).list() ){
            grupos.add((oficina) group.clone());
	}
	session.close();
	return grupos;
    }

    @Override
    public void guardar_oficina(oficina elemento) {
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
    
}
