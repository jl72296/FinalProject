
public class Robot extends Bi_ped {
  public void Robot()
	{
		super.setDialog(4);
		super.setAnimalSpeed(10);
		
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
			animalName = "J.A.R.V.I.S.";
		case 2:
			animalName = "Skynet";
		case 3:
			animalName = "T-1000";
		case 4:
			animalName = "Bishop";
		default:
			animalName = "V.I.K.Y.";
			break;
		}
		id = animalName + ", the robot,";
		return id + super.Talk();
	}
	
	public String Walk()
	{
		String msg;
		msg = "My animal is a Robot ";
		msg = msg + super.Walk();
		return msg;
	}

}
