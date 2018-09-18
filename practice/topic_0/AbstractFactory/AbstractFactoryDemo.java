package topic_0.AbstractFactory;
import java.util.Scanner;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose connection type (MySQL/PostgreSQL)");
	    String type = scanner.nextLine();
	    
	    AbstractFactory conFactory = FactoryProducer.getFactory();
	    Connection connection = conFactory.getConnection(type);
	    
	    connection.connect();
	    scanner.close();
	     

	}

}
