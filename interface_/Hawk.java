package interface_;

public class Hawk implements predator{
	@Override
	public void hunt() {
		System.out.println("*hunt begin*");
		System.out.println("*hawk is hunting*");
	}
}
