package package1;

public class Robot {
	
	int id;
	
	/*
	 * Java supports nesting classes.
	 * A class can be member of another class.
	 * Unlike a class, an inner class can be private.
	 * Once you declare an inner class private, it can not be accessed from an object outside the class.
	 */
	
	/*
	 * Robot class has an inner class Brain.
	 * The inner class can access all of the member variables and methods of its outer class.
	 * The inner class can not be accessed from any outside class.
	 */

	
	//Constructor
	Robot(int i){
		id =i;
		Brain b = new Brain();
		b.think();
	}
	
	private class Brain{
		public void think(){
			System.out.println(id + " is thinking");
		}
	}
	

}
