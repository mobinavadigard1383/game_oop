
public class player1 {
	private String name;
	private String weapon;
	private int health;
	
	public player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health;
	}
	
	public void damageByGun1() {
		this.health-=30;
		if(this.health<=0) {
			this.health=0;
		}
		
		System.out.println("Got hit by gun1. Health is reduced by 30. New is" + this.health);
		if(this.health == 0) {
			System.out.println("player is dead!");
		}
	}

}
