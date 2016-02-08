/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.medios;

import hibernate.configuracion.Hibernate;
import da.oficina.oficina;
import da.computacionales.computacionales;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.hibernate.Session;

/**
 *
 * @author Druet Rodriguez
 */
public final class mediosDAO implements ImediosDAO{
    final private String SELECT_ALL_OFICINA = "from oficina";
    final private String SELECT_ALL_COMPUTACIONALES = "from computacionales";
    Collection<medios> grupos = new Vector<>();
    
    public mediosDAO() {
    }
    
    @Override
    public void cargar_oficina() {
        Session session = Hibernate.getSession();
	for(oficina group:(List<oficina>)session.createQuery(SELECT_ALL_OFICINA).list() ){
            grupos.add((oficina) group.clone());
	}
	session.close();
    }

    @Override
    public void cargar_computacional() {
        Session session = Hibernate.getSession();
	for(computacionales group:(List<computacionales>)session.createQuery(SELECT_ALL_COMPUTACIONALES).list() ){
            grupos.add((computacionales) group.clone());
	}
	session.close();
    }

    @Override
    public Collection<medios> obtener_medios() {
        return this.grupos;
    }
    
}
