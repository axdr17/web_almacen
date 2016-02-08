package da;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

abstract public class Persistent implements Serializable{	
	private static final long serialVersionUID = 309689379297902310L;
	
	protected long id;
	
	public Persistent() {
        }
	
	public long getId(){
		return id;
	}
	
	private void setId( long id ){
		this.id = id;
	}
	
	private void readObject( ObjectInputStream stream ) throws IOException, ClassNotFoundException {	
		id = (Long) stream.readObject();
	}
	
	private void writeObject( ObjectOutputStream stream ) throws IOException {
		stream.writeObject( id );		
	}
	
	// Methods for serializable set collections
	
	final protected Set readSetCollection( ObjectInput stream ) throws IOException, ClassNotFoundException{
		Set collection = new HashSet();
		
		int length = ((Integer)stream.readObject()).intValue();		
		for ( int i = 0; i < length; i++ ){
                    collection.add( stream.readObject() );
		}
		
		return collection;
	} 
	
	final protected void writeSetCollection( Set collection, ObjectOutput stream ) throws IOException{
		stream.writeObject( collection.size() );
		for ( Object object : collection ){
                    stream.writeObject( object );
		}
	}
}