package check;

import constants.Constants;

public class Check {

	String firstName = "祐奈";
   	String lastName = "金谷";

   	public void printName(String firstName, String lastName) {
   	System.out.println("printNameメソッド→" + lastName + firstName);
   	}

   	public static void main(String[] args) {

   	Check name = new Check();
   	name.printName(name.firstName,name.lastName);

   	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();

	RobotPet rbp = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
	rbp.introduce();

	}

}