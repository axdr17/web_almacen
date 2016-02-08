package hibernate.configuracion;

import java.io.File;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Hibernate 
{
	private static File PROYECT_DIRECTORY;
	
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	
	public static void setProyectDirectory( File proyectDirectory )
	{
		PROYECT_DIRECTORY = proyectDirectory;
	}
	
	public static void initialize()
	{
		char sep = File.separatorChar;
		
		String dir = PROYECT_DIRECTORY.getAbsolutePath() + sep + "db" + sep + "ejemplo_db_hibernate";				
		String url = "jdbc:derby:" + dir + ";create=true";
		
		configuration = new Configuration().setProperty( "hibernate.connection.url", url )
										   .setProperty( "hibernate.connection.username", "sa" )
										   .setProperty( "hibernate.connection.password", "" );
		sessionFactory = configuration.configure().buildSessionFactory();
	}
	
	public static Session getSession() throws HibernateException
	{	
		return sessionFactory.openSession();
	}
}