package topic_0.AbstractFactory;

public class ConnectionFactory extends AbstractFactory {
	
	public Connection getConnection(String type) {
		
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("MySql")) {
			return new MySqlConnection();
		} else if (type.equalsIgnoreCase("PostgreSql")) {
			return new PostgreConnection();
		}
		return null;
		
	}

}
