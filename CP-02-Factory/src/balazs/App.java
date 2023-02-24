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
		Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
		cat.bark();
		Animal ghost = AnimalFactory.getAnimal(AnimalType.GHOST);
		ghost.bark();
	}

}
