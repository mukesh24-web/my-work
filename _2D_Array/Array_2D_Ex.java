package _2D_Array;

public class Array_2D_Ex {

	public static void main(String[] args) {
		
		
		
		String[] fruits = {"apple","banana","orange"};
		String[] vegetables = {"raddish","cucumber","cabbage"};
		String[] meat = {"chicken","goat","fish"};
		
		String[][] groceries = {   // instead of writing this add value in it.
				fruits,vegetables,meat
		};
		
		for(String[] type : groceries) { // fruits, vegetables, meat
			for(String item : type) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		
		
			
		
		char[][] telephone = {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'},
				{'#','0','*'}
		};
		
		for(char[] phone:telephone) {
			for(char call:phone) {
				System.out.print(call+" ");
			}
			System.out.println();
		}
		
		
		for(String fruit:fruits) { // fetch array element one-by-one, just one array
			System.out.println(fruit);
		}
	}

}
