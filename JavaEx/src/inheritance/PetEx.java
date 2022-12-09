package inheritance;

public class PetEx {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Fish fish = new Fish();
		
		cat.name = "고양이";
		fish.name = "물고기";
		
		cat.display();
		cat.live();
		
		fish.display();
		fish.live();	
	}
}