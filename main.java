// Plant Encyclopedia App
// Topics: non-vascular plants (moss), vascular (fern, herbaceous: forb-- wildflower) fungi, graminoid (grass, bamboo), woody plant (tree, shrub), succulent (cactus, agave)
// non-vascular plants (moss), vascular (fern, herbaceous: forb-- wildflower) fungi, graminoid (grass, bamboo), woody plant (tree, shrub), succulent (cactus, agave)
// classes: Encyclopedia list all, plant definition category, main, definition,
// cactus extends category, category extends definition?

// graminoid inherits from plant class, grass inherits from graminoid, etc.
//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		List<String> nations = new ArrayList<String>();

				System.out.println("Welcome to Megan's Plant Encyclopedia! Home to a very basic list of only the coolest plants in the world. \nPlease select a category.");
				for(int i = 0; i < 5; ++i){
					String nation = scanner.nextLine();
				}
					//Always use equals for string comparisons.
					//THIS IS A CASE-SENSITIVE COMPARISON
					if(nation.equals("1")){
						System.out.println("Non-vascular Plants! They're fascinating!");
					}

					nations.add(nation);
          // search fn
		private static boolean ArrayContains(String[] array, String value){
			for(String element : array){
				if(element.equals(value))
					return true;
			}
			return false;
		}
}
