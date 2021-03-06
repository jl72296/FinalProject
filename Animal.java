
public class Animal {
	
	//////////////////////////// Parent Class Animal /////////////////////////////////
	private int AnimalLine = 1;
	public int[] x_direction = new int[60];
	private int Time = 0;
	private int Horizontal_Position;
	private int speed;
	private int MaxSpeed;
	private int Mass = 170;
	
	////////////////////////// Set conditions for type of animal //////////////////////
	public void setDialog( int speech )
	{
		AnimalLine = speech;
	}
	
	public void setAnimalSpeed( int v )
	{
		MaxSpeed = v;
	}
	
	public void setWeight( int m )
	{
		Mass = m;
	}
	
	/////////////////////////// Animal Constructor///////////////////////////////////
	public Animal()
	{
		Time = 0;
		Horizontal_Position = 0;
		speed = 0;
		MaxSpeed = 5;
		AnimalLine = 6;
		Mass = 170;
	
	}
	
	////////////////////////// Animal's Talk ///////////////////////////////////////
	public String Talk()
	{
		String expression = "";
		int lineSelection;
		lineSelection = 1 + (int)(Math.random()*AnimalLine);
		if ( lineSelection == 1 )
			expression = "[Nothing]";
		else if ( lineSelection == 2 )
			expression = "Oh Oh Oh Ah Ah Ah";
		else if ( lineSelection == 3 )
			expression = "OH AH OH AH OH AH";
		else if ( lineSelection == 4 )
			expression = "I'll be back";
		else if ( lineSelection == 5 )
			expression = "GET TO THE CHOPPA!!!";
		else
			expression = "Every man dies, not every man really lives.";
		return expression;
	}
	
	///////////////////////////// Animal's Horizontal Position ////////////////////////////
	public String Walk()
	{
		String currentPosition = "";
		int currentPos = Horizontal_Position;
		for ( int minute = Time; minute <= 60; ++minute )
		{
			speed = 0 + (int)(Math.random()*MaxSpeed);
			x_direction[Time] = currentPos + (minute)*speed;
			currentPos = x_direction[Time];
			currentPosition = currentPosition + "\n" + currentPos;
		}
		return "and its position is: " + currentPosition;
		
	}
	
	public String Weight()
	{
		String myAnimalsWeight = "";
		int mass;
		mass = 1 + (int)(Math.random()*Mass);
		myAnimalsWeight = "is " + mass + " lbs";
		return myAnimalsWeight;
	}

}
