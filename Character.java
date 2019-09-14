import java.util.Scanner;

public class Character {
	
	//method for user to select a charcter
	public static int getCharacter(int userValue) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter Your Charcter By Selecting Any Number \n1 for Human Fighter \n2 for Orc \n3 for Barbarian \n4 for wizard \n5 for Monk ");
		int getUserValue = input.nextInt();
		if(getUserValue<0||getUserValue>5) {
			//sanity check the usr input
			System.err.println("Invalid Input Given");
			System.exit(0);
		}
		return getUserValue;
	}
	
	//method for enter the level
	public static int getLevel(int userLvel) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Level between 1-18");
		int getUsertLevel = input.nextInt();
		if(getUsertLevel<0) {
			//sanity check the useer input
			System.err.println("Invalid Input ");
			System.exit(0);
		}
		return getUsertLevel;
	}

	public static int getVar(int[] getDice) {

		//Assigning the values to variables.Assigning array index value
		int Str = getDice[0];
		int Dex = getDice[1];
		int Con = getDice[2];
		int Int = getDice[3];
		int Wis = getDice[4];
		int Cha = getDice[5];

		//variables for store each bonus
		int bonusStr = 0;
		int bonusDex = 0;
		int bonusCon = 0;
		int bonusInt = 0;
		int bonusWis = 0;
		int bonusCha = 0;
		
		//Calculating Hitdice
		if ((Str == 10) && (Str == 11)) {
			System.out.println("Str:" + "[" + Str + "]" + "[" + "0" + "]");

		} else if ((Str > 10) && (Str != 11)) {
			for (int i = 10; i < Str - 1; i++) {
				if (i % 2 == 0) {
					bonusStr = bonusStr + 1;
				}
			}
			System.out.println("Str:" + "[" + Str + "]" + "[" + "+" + bonusStr + "]");

		} else {
			for (int i = 10; i >= Str; i--) {
				if (i % 2 == 1) {
					bonusStr = bonusStr - 1;
				}
			}
			System.out.println("Str:" + "[" + Str + "]" + "[" + bonusStr + "]");

		}

		if ((Dex == 10) && (Dex == 11)) {
			System.out.println("Dex:" + "[" + Dex + "]" + "[" + "0" + "]");

		} else if ((Dex > 10) && (Dex != 11)) {
			for (int i = 10; i < Dex - 1; i++) {
				if (i % 2 == 0) {
					bonusDex = bonusDex + 1;
				}
			}
			System.out.println("Dex:" + "[" + Dex + "]" + "[" + "+" + bonusDex + "]");

		} else {
			for (int i = 10; i >= Dex; i--) {
				if (i % 2 == 1) {
					bonusDex = bonusDex - 1;
				}
			}
			System.out.println("Dex:" + "[" + Dex + "]" + "[" + bonusDex + "]");

		}

		if ((Con == 10) && (Con == 11)) {
			System.out.println("Con:" + "[" + Con + "]" + "[" + "0" + "]");

		} else if ((Con > 10) && (Con != 11)) {
			for (int i = 10; i < Con - 1; i++) {
				if (i % 2 == 0) {
					bonusCon = bonusCon + 1;
				}
			}
			System.out.println("Con:" + "[" + Con + "]" + "[" + "+" + bonusCon + "]");

		} else {
			for (int i = 10; i >= Con; i--) {
				if (i % 2 == 1) {
					bonusCon = bonusCon - 1;
				}
			}
			System.out.println("Con:" + "[" + Con + "]" + "[" + bonusCon + "]");

		}

		if ((Int == 10) && (Int == 11)) {
			System.out.println("Int:" + "[" + Int + "]" + "[" + "0" + "]");

		} else if ((Int > 10) && (Int != 11)) {
			for (int i = 10; i < Int - 1; i++) {
				if (i % 2 == 0) {
					bonusInt = bonusInt + 1;
				}
			}
			System.out.println("Int:" + "[" + Int + "]" + "[" + "+" + bonusInt + "]");

		} else {
			for (int i = 10; i >= Int; i--) {
				if (i % 2 == 1) {
					bonusInt = bonusInt - 1;
				}
			}
			System.out.println("Int:" + "[" + Int + "]" + "[" + bonusInt + "]");

		}

		if ((Wis == 10) && (Wis == 11)) {
			System.out.println("Wis:" + "[" + Wis + "]" + "[" + "0" + "]");

		} else if ((Wis > 10) && (Wis != 11)) {
			for (int i = 10; i < Wis - 1; i++) {
				if (i % 2 == 0) {
					bonusWis = bonusWis + 1;
				}
			}
			System.out.println("Wis:" + "[" + Wis + "]" + "[" + "+" + bonusWis + "]");

		} else {
			for (int i = 10; i >= Wis; i--) {
				if (i % 2 == 1) {
					bonusWis = bonusWis - 1;
				}
			}
			System.out.println("Wis:" + "[" + Wis + "]" + "[" + bonusWis + "]");

		}

		if ((Cha == 10) && (Cha == 11)) {
			System.out.println("Cha:" + "[" + Cha + "]" + "[" + "0" + "]");

		} else if ((Cha > 10) && (Cha != 11)) {
			for (int i = 10; i < Cha - 1; i++) {
				if (i % 2 == 0) {
					bonusCha = bonusCha + 1;
				}
			}
			System.out.println("Cha:" + "[" + Cha + "]" + "[" + "+" + bonusCha + "]");

		} else {
			for (int i = 10; i >= Cha; i--) {
				if (i % 2 == 1) {
					bonusCha = bonusCha - 1;
				}
			}
			System.out.println("Cha:" + "[" + Cha + "]" + "[" + bonusCha + "]");

		}
		//gets the con bonus for calculate hitpoints
		return bonusCon;

		

	}

}
