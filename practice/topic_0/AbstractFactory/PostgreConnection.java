package topic_0.AbstractFactory;

public class PostgreConnection implements Connection{
	 
	@Override
	public void connect() {
		
		System.out.println("Connecting to PostgreSQL...");
		
	  }
}
