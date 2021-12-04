
public class HelloWorld {
	
public static void main(String[] args) {
	System.out.println("Hello, World!");
	
	String[] petAnimal = {"Fish", "Parrot", "Bunny", "Cat", "Dog"};
	
	int k=0;
	for (int i=0; i<petAnimal.length; i++) {
		if (petAnimal[i] == "Bunny") {
			k=i;
			break;
		}
	}
	System.out.println(k);
	
}
}
