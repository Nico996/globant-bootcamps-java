package topic_0.AbstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory() {
		
		return new ConnectionFactory();
		
	}
}
