
public class BatTest {
	public static void main(String[] args) {
		//Create a new bat:
		Bat dracula = new Bat();
		
		// Have have it attack three towns: 
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		System.out.print("\n");


		//Eat two humans:
		dracula.eatHumans();
		dracula.eatHumans();
		System.out.print("\n");
		
		//fly twice:
		dracula.fly();
		dracula.fly();
		System.out.print("\n");
		
		//Display the energy level:
		System.out.print("Dracula's enery level is: ");
		dracula.displayEnergy();
	}
}

