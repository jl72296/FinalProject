
public class Monkey extends Bi_ped {
	public void Monkey()
	{
		super.setDialog(2);
		super.setAnimalSpeed(3);
		super.setWeight(50);
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
			animalName = "Lorena";
		case 2:
			animalName = "Tamir";
		case 3:
			animalName = "Bubbles";
		case 4:
			animalName = "Koko";
		default:
			animalName = "George";
			break;
		}
		id = animalName + ", the monkey,";
		return id + super.Talk();
	}
	
	public String Walk()
	{
		String msg;
		msg = "My animal is a Monkey ";
		msg = msg + super.Walk();
		return msg;
	}
	
	public String Weight()
	{
		String msg;
		msg = "The monkey's weight, ";
		msg = msg + super.Weight();
		return msg;
	}

}
