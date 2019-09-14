import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class Assesable5 {
	
		public static void main(String args[]) throws FileNotFoundException {
			Scanner input2 = new Scanner(System.in);
			int answer2=0;
			do {
			int answer = 0;
			int userValue = 0;
			// getting the user input value from charcter class
			int getCha = Character.getCharacter(userValue);
			int userLvel = 0;
			// getting the user input level from charcter class
			int Level = Character.getLevel(userLvel);
			int getDiceType = 0;
			int Hitpoint = 0;
			int skillselecton = 0;
			int stataffinity=0;
			int rank=0;
			System.out.println("Level:" + "[" + Level + "]");

			// array for store stats
			int[] getDice = new int[6];
			do {
				// selecting the dice type according to user input
				if (getCha == 1) {
					//setting the dicetype
					getDiceType = 4;
					// getting the dice roll results from the method
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Humen Fighter");
				} else if (getCha == 2) {
					getDiceType = 6;
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Orc");
				} else if (getCha == 3) {
					getDiceType = 8;
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Barbarian");
				} else if (getCha == 4) {
					getDiceType = 8;
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Wizard");
				} else if (getCha == 5) {
					getDiceType = 10;
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Monk");
				} else if (getCha == 6) {
					getDiceType = 12;
					getDice = lowestDice(getDiceType);
					System.out.println("Your Character is : Dragon");
				}

				// getting the bonus from charcter class
				int bonusCon = Character.getVar(getDice);
				getDice = lowestDice(getDiceType);
				Scanner input = new Scanner(System.in);
				// calculating hitpoints per level
				Hitpoint = bonusCon + getDiceType*Level;
				System.out.println("Hp:" + "[" + Hitpoint + "]");
				//calculating the stat_affinity
				stataffinity = getDiceType+Level;
				//calculating the rank
				rank = Level+bonusCon;
				// asking the user to reroll
				System.out.println("Enter 1 for Roll again,0 for Stop");
				answer = input.nextInt();
			} while (answer == 1);
			if (answer == 0) {
				// display the previous output again
				switch (getCha) {
				case 1:
					System.out.println("Your Character is : Humen Fighter");
					break;
				case 2:
					System.out.println("Your Character is : Orc");
					break;
				case 3:
					System.out.println("Your Character is : Barbarian");
					break;
				case 4:
					System.out.println("Your Character is : Wizard");
					break;
				case 5:
					System.out.println("Your Character is : Monk");
					break;
				case 6:
					System.out.println("Your Character is : Dragon");
					break;
				}
				// parsing the values to getVar method in charcter class
				Character.getVar(getDice);
				System.out.println("Hp:" + "[" + Hitpoint + "]");

			}
			//creating string variable for store the read values
			String name = new String();
			//setting the file to be read
			File file = new File("skills.txt");
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()) {
				//storing the read values for the variable
				name = sc.nextLine();
				//display the file
				System.out.println(name);
			}
			do {
				//prompt for slelect a skill
				System.out.println("Enter the Skill Number to get your Skill ");
				Scanner input = new Scanner(System.in);
				int skillselection = input.nextInt();
				//setting the arguments
				Skill Skill1 = new Skill("Your Skill is : Acrobatics", " Optional in : Dexterity  ",
						"Skill Discription : Standard action or move action, depending on the stunt",stataffinity,rank, null);
				Skill Skill2 = new Skill("Your Skill is : Athletics", "  Optional in : Strength ",
						"Skill Discription : attempt physical activities that rely on muscular strength, including climbing, escaping from a grab, jumping, and swimming.",
						stataffinity, rank, null);
				Skill Skill6 = new Skill("Your Skill is : Medicine", " Optional in : Wisdom ", "Skill Discription : lets you try to stabilize a dying companion.",
						stataffinity,rank, null);
				Skill Skill3 = new Skill("Your Skill is : History", "Optional in : Inteligence  ",
						"Skill Discription : to haggle with a patron, to demonstrate proper etiquette and decorum, or to negotiate a deal in good faith.",
						stataffinity, rank, null);
				Skill Skill4 = new Skill("Your Skill is :Nature", "Optional in : Inteligence ",
						"Skill Discription : Make an Endurance check to stave off ill effects and to push yourself beyond normal physical limits.",
						stataffinity, rank, null);
				Skill Skill5 = new Skill("Your Skill is : Insight", "Optional in : Wisdom ",
						"Skill Discription : Make a Perception check to notice clues, detect secret doors, spot imminent dangers.", stataffinity, rank,
						null);
				Skill Skill7 = new Skill("Your Skill is :Stealth", "Optional in : Strength ",
						"Skill Discription : check when you attempt to conceal yourself from enemies", stataffinity, rank, null);
				Skill Skill8 = new Skill("Your Skill is : Religion", "Optional in : Inteligence ",
						"Skill Discription : check measures your ability to recall lore about deities, rites and prayers, religious hierarchies.",
						stataffinity, rank, null);
				Skill Skill9 = new Skill("Your Skill is : Survival", "Optional in : Wisdom  ", "Skill Discription : check to follow tracks , hunt wild game.", stataffinity, rank,
						null);
				Skill Skill10 = new Skill("Your Skill is : Persuasion", "Optional in : Charisma ",
						"Skill Discription :  persuading others include convincing a chamberlain to let your party see the king, negotiating peace between warring tribes.",
						stataffinity, rank, null);
				Skill Skill11 = new Skill("Your Skill is :Intimidation", "Optional in : Charisma  ",
						"Skill Discription : using the edge of a broken bottle to convince a sneering vizier to reconsider a decision.", stataffinity, rank,
						null);
				Skill Skill12 = new Skill("Your Skill is : Arcana ", " Optional in : Inteligence ",
						"Skill Discription : Arcana is a knowledge type skill linked to Intelligence.",stataffinity, rank, null);
				Skill Skill13 = new Skill("Your Skill is : Investigation", "Optional in: Inteligence  ",
						"Skill Discription : you look around for clues and make deductions based on those clues", stataffinity, rank, null);
				Skill Skill14 = new Skill("Your Skill is : Animal-Handling", "Optional in : Wisdom ",
						"Skill Discription : you can calm down a domesticated animal, keep a mount from getting spooked.",stataffinity, rank, null);
				Skill Skill15 = new Skill("Your Skill is : Deception", "Optional in : Charisma  ",
						"Skill Discription :  determines whether you can convincingly hide the truth, either verbally.", stataffinity,rank, null);
				Skill Skill16 = new Skill("Your Skill is :Sleight-of-Hand", "Optional in : Strength ",
						"Skill Discription : an act of legerdemain  such as planting something on someone", stataffinity,rank, null);
				Skill Skill17 = new Skill("Your Skill is : MedicinePreception", "Optional in : Wisdom ",
						"Skill Discription : check	lets you spot, hear, or otherwise detect the presence of something.", stataffinity, rank, null);
				Skill Skill18 = new Skill("Your Skill is : Performance", "Optional in : Charisma  ",
						"Skill Discription : determines how well you can delight an audience with  form of entertainment.",stataffinity, rank, null);
				//getting the selected skill
				if (skillselection == 1) {
					//setting the currentSkill to the slected skill
					Skill currentSkill = Skill1;
					while (currentSkill != null) {
						//display the skill
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}
				}
				if (skillselection == 2) {

					Skill currentSkill = Skill2;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}
				} else if (skillselection == 3) {

					Skill currentSkill = Skill3;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}
				} else if (skillselection == 4) {

					Skill currentSkill = Skill4;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 5) {

					Skill currentSkill = Skill5;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 6) {

					Skill currentSkill = Skill6;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 7) {

					Skill currentSkill = Skill7;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 8) {

					Skill currentSkill = Skill8;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 9) {

					Skill currentSkill = Skill9;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 10) {

					Skill currentSkill = Skill10;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 11) {

					Skill currentSkill = Skill11;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 12) {

					Skill currentSkill = Skill12;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 13) {

					Skill currentSkill = Skill13;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 14) {

					Skill currentSkill = Skill14;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 15) {

					Skill currentSkill = Skill15;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 16) {

					Skill currentSkill = Skill16;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 17) {

					Skill currentSkill = Skill17;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				} else if (skillselection == 18) {

					Skill currentSkill = Skill18;
					while (currentSkill != null) {
						currentSkill.print();
						currentSkill = currentSkill.getNext_Skill();
					}

				}
				System.out.println("Enter 1 for get a new skill or enter 0 for Stop");
				answer = input.nextInt();
			} while (answer == 1);
			System.out.println("Enter 1 for Select New Character again Or enter 0 for Exit");
			answer2 = input2.nextInt();
			}while(answer2 == 1);
			if (answer2 == 0) {
				System.exit(0);
			}
			}
		/*from this method stats will be generated according to the
		 * user selected dicetype.This is array type method and its returning the array to
		 * get values for variables(Str,Dex....)
		 */
		public static int[] lowestDice(int getDiceType) {

			int[] getDice = new int[6];
			int lastTotal = 0;
			int total = 0;
			int minValue = getDiceType;
			// int diceRoll = 0;
			for (int i = 0; i < 6; i++) {
				for (int k = 0; k < 4; k++) {
					int diceRoll = (int) ((Math.random() * 1000 % (getDiceType) + 1));
					if (diceRoll < minValue) {
						minValue = diceRoll;
					}
					total = total + diceRoll;

				}
				lastTotal = total - minValue;
				getDice[i] = lastTotal;

			}
			return (getDice);
		}

	}
