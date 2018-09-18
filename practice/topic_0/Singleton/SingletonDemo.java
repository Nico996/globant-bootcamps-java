package topic_0.Singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonDb demoDb = SingletonDb.getInstance("localhost", "root", "", "testDatabase");

		demoDb.status();

	}

}
