
public class GorillaTest {
	// Here we're testing the Gorilla and (implicitly) the Mammal classes
		
	public static void main(String[] args) {
		//Create a new gorilla:
		Gorilla kingKong = new Gorilla();
		
		// Have it throw objects three times: 
		kingKong.throwSomething();
		kingKong.throwSomething();
		kingKong.throwSomething();
		
		//Eat bananas twice
		kingKong.eatBanana();
		kingKong.eatBanana();
		
		//Climb once
		kingKong.climb();
		
//		kingKong.throwSomething();
		
		//Display the energy level:
		System.out.print("Gorilla's enery level is: ");
		kingKong.displayEnergy();
	}

}
