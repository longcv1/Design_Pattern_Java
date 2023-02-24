/**
 * 
 */
package balazs;

/**
 * @author longcv1
 * 
 */
public class App {

	public static void main(String[] args) {
		// Eager
//		DbConnector d1 = DbConnector.INSTANCE;
//		d1.connect();d1.disconnect();
//		DbConnector d2 = DbConnector.INSTANCE;
//		System.out.println(d1==d2);
		
		DbConnector d3 = DbConnector.getInstance();
		DbConnector d4 = DbConnector.getInstance();
		System.out.println("d3" + d3);
		System.out.println("d4" + d4);
		
		DbConnectorForThreads o1 = DbConnectorForThreads.INSTANCE;
		DbConnectorForThreads o2 = DbConnectorForThreads.INSTANCE;
		System.out.println(o1 == o2);
		DbConnectorForThreads.INSTANCE.connection();
		DbConnectorForThreads.INSTANCE.closeConnection();
	}

}
