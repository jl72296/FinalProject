
public class AnimalTest {

  public static void main(String[] args) {
		Animal animal = new Animal();
		Animal bi = new Bi_ped();
		Animal animalType = new Monkey();
		Animal human = new Human();
		Animal machine = new Robot();
		

		System.out.println("My animal says: " + animal.Talk());
		System.out.println(bi.Talk());
		
		System.out.println(animalType.Talk());
		System.out.println(human.Talk());
		System.out.println(machine.Talk());
		
		/*
		System.out.println("Animal's Position: " + animal.Walk());
		System.out.println(bi.Walk());
		System.out.println(animalType.Walk());
		System.out.println(human.Walk());
		System.out.println(machine.Walk());
		*/
		


	}

}
