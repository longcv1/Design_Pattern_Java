/**
 * 
 */
package balazs;

/**
 * @author longcv1
 * 1. Definition: To add one or more behaviors dynamically to existing objects.
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Bavarage b = new PlainBaverage();
		Bavarage b = new BaverageWithMilk(new PlainBaverage());
		System.out.println(b.getPrice());
		System.out.println(b.description());
		
	}

}
