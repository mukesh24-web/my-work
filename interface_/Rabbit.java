package interface_;

public class Rabbit implements prey{
	@Override
	public void flee() {
		System.out.println("*The rabbit running away* ");
	}
}
