package interface_;

public class Fish implements prey,predator{
	@Override
	public void flee() {
		System.out.println("*flee from big fish*");
	}
	
	@Override
	public void hunt() {
		System.out.println("*haunt the small fish*");
	}
}
