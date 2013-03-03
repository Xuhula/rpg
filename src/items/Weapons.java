package items;
public class Weapons{
	String weapon;
	String description;
	public Weapons(String key, String value)
	{
		
		weapon=key;
		description = value;
		
	}
	public Weapons swords(int choice)
	{
		String swords [][] = {
				{"Katana","a blade forged in the distant land of Asia"},
				{"Longsword","A mighty durable blade forged for endurance"},
				{"Swiss Army Knife", "A mystery knife with all types of surprises"},
				{"Scimitar", "A sword with a curved blade"},
				{"Short Sword", "Durable sword with a short blade"}
				};

		Weapons weapon = new Weapons(swords[choice][0],swords[choice][1]);
		return weapon;
	}
	public Weapons staff(int choice)
	{
		String staff[][] = {
				{"Staff","a weapon for ordinary wizards"},
				{"Dark Staff", "A staff used for dark magic"},
				{"Ominious staff", "A staff that's a little weird."}
				};
		Weapons weapon = new Weapons(staff[choice][0],staff[choice][1]);
		return weapon;

	}
	public String toString(){
		return "This class is for weapons.";
	}
	
}
