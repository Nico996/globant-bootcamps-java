package topic_0.Singleton;

public class SingletonDb {

	private static SingletonDb singletonExample = null;
	private String user;
	private String dbName;
	private String pass;
	private String host;
	
	private SingletonDb(String host, String user, String pass, String dbName) {
		this.dbName = dbName;
		this.user = user;
		this.pass = pass;
	}

	public static SingletonDb getInstance(String host, String dbName, String user, String pass) {
		if (singletonExample == null) {
			singletonExample = new SingletonDb(host, user, pass, dbName);
		}
		return singletonExample;
	}

	public void status() {			//This method may be used to test the singleton
		System.out.println("Succesfully connected to database");
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}	
	
}
