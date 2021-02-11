package check;

import constants.Constants;

public class Check {

	public static void main(String[] args) {

	String firstName = "祐奈";
   	String lastName = "金谷";

   	System.out.println("printNameメソッド→" + printName(firstName, lastName));

   	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();


	RobotPet rbp = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
	rbp.introduce();

	
	}

	private static String printName(String firstName, String lastName) {
		return lastName + firstName;
	}

}
