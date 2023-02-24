package balazs;

public class DbConnector {
	// Eager instantiation
	// public static DbConnector INSTANCE = new DbConnector();
	
	// Lazy instantiation
	public static DbConnector INSTANCE;
	private DbConnector() {}
	
	public void connect() {
		System.out.println("Connecting to DB...");
	}
	public void disconnect() {
		System.out.println("Dis-connecting to DB...");
	}
	public static DbConnector getInstance() {
		if(INSTANCE == null) {
			// if multithread but it not best solution due to slowly
			synchronized (DbConnector.class) {			
				INSTANCE = new DbConnector();
			}
		}
		return INSTANCE;
	}
}
