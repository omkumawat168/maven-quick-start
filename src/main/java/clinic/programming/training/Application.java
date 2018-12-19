//Adding a sample application class
package clinic.programming.training;
import java.util.*;

public class Application{
		
	public Application(){
		System.out.println("Dummy App");
	}

	public void greet(){
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");

		for(String s:list){
			System.out.println(s);
		}
	}

	public static void main(String[] args){
		System.out.println("This is a sample application.");
		Application app = new Application();
		app.greet();

	}
}

