
public class Human extends Bi_ped {
  public void Human()
	{
		super.setDialog(5);
		super.setAnimalSpeed(3);
	}
	
	public String Talk()
	{
		String animalName = "";
		String id = "";
		int nameSelector;
		nameSelector = 1 + (int)(Math.random()*5);
		switch ( nameSelector )
		{
		case 1:
			animalName = "Michael";
		case 2:
			animalName = "Paul";
		case 3:
			animalName = "Ellie";
		case 4:
			animalName = "John";
		default:
			animalName = "Lorena";
			break;
		}
		id = animalName + ", an engineer,";
		return id + super.Talk();
	}

	public String Walk()
	{
		String msg;
		msg = "My animal is a Human ";
		msg = msg + super.Walk();
		return msg;
	}
}
