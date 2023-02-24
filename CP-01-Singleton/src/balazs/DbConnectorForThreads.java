package balazs;

public enum DbConnectorForThreads {
	INSTANCE; // It's a thread safe
	public void connection() {
		System.out.println("Connection DB for threads");
	}
	
	public void closeConnection() {
		System.out.println("Close Connection DB for threads");
	}
}
