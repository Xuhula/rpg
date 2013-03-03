package items;

public class Weapon {

	public String swords(int choice)
	{
		String swords [][] = {
				{"Katana","a blade forged in the distant land of Asia"},
				{"Longsword","A mighty durable blade forged for endurance"},
				{"Swiss Army Knife", "A mystery knife with all types of surprises"},
				{"Scimitar", "A sword with a curved blade"},
				{"Short Sword", "Durable sword with a short blade"}
				};
		String weapon =  swords[choice][1];
		
	
		return weapon;
	}
	public String secondary(int choice)
	{
		String swords [] = {"Dagger", "Whip", "", "Scimitar", "Short Sword" };
		return swords[choice]; 
	}
	
}
