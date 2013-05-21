
public class Bi_ped extends Animal{

	public String Talk()
	{
		String msg;
		msg = " a Bi-Ped Animal says, ";
		msg = msg + super.Talk();
		return msg;
	}
	
	public String Walk()
		{
			String msg;
			msg = "which is a Bi-Ped ";
			msg = msg + super.Walk();
			return msg;
		}
	
	public String Weight()
	{
		String msg;
		msg = "a Bi-Ped ";
		msg = msg + super.Weight();
		return msg;
	}


}
