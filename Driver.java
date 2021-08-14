/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meisnerGravioso;

/**
 *
 * @author prettyzucchini
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
    private static final ArrayList<Dog> dogList = new ArrayList<Dog>();
    //Add Monkey ArrayList
    private static final ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        Scanner scnr = new Scanner(System.in);
        String userAction;
        
        //Do While loop for display menu using switch case statement
        do {
            displayMenu();
            userAction = scnr.next();
            
            switch(userAction) {
                case "1":
                    intakeNewDog(scnr);
                    break;
                    
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                    
                case "3":
                    System.out.println();
                    reserveAnimal(scnr);
                    break;
                    
                case "4":
                    printAnimals(userAction);
                    break;
                    
                case "5":
                    System.out.println();
                    printAnimals(userAction);
                    break;
                    
                case "6":
                    System.out.println();
                    printAnimals(userAction);
                    break;
                
                case "q":
                    System.out.println("Quit");
                    break;
                
                default:
                    System.out.println("Please enter a valid command.");
            }
        } while (!userAction.equals("q"));
    }
           
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        
        Monkey monkey1 = new Monkey("Frank Skabopolis ", "Male", "5", "20", "05-06-2021", "United States",
        "Phase III", false, "United States", "3", "6", "20", "Geunon");
        
        Monkey monkey2 = new Monkey("James Wonder", "Male", "2", "30", "05-06-2021", "United States",
        "Phase II", false, "United States", "3", "6", "20", "SquirrelMonkey");
        
        Monkey monkey3 = new Monkey("Theodore K. Mullins", "Male", "5", "10", "05-06-2021", "United States",
        "Phase I", false, "United States", "3", "6", "20", "Macaque");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

    
    }
    // Complete the intakeNewDog method
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        // Input dog information
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        System.out.println("What is the breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the age?");
        String age = scanner.nextLine();
        System.out.println("What is the weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the in service country?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the reservation status? true/false.");
        String reservedString;
        reservedString = scanner.nextLine();
        boolean reserved;
        // check value is true or false
        if (!"true".equals(reservedString) && !"false".equals(reservedString)) {
        	System.out.println("Re-input reservation status.");
        	reservedString = scanner.nextLine();
        }
        reserved = "true".equals(reservedString.toLowerCase());
        // Add to dog ArrayList
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        System.out.println("New dog added.");
        dogList.add(newDog);
        // Return to main
        main(null);
        }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	
        public static void intakeNewMonkey(Scanner scanner) {
        
        // Input monkey information
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        //Check monkey is valid breed
        String breed;
        do {
        	System.out.println("What is the breed?");
            breed = scanner.nextLine();
        }
        while (!"Capuchin".equals(breed) && !"Guenon".equals(breed) && !"Macaque".equals(breed) && !"Marmoset".equals(breed) && !"Squirrel monkey".equals(breed) && !"Tamarin".equals(breed)); {
        	System.out.println("Invalid breed. Please re-enter.");
        	breed = scanner.nextLine();
        System.out.println("What is the gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the age?");
        String age = scanner.nextLine();
        System.out.println("What is the weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the height?");
        String height = scanner.nextLine();
        System.out.println("What is the body length?");
        String bodyLength = scanner.nextLine();
        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the in service country?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the reservation status? true/false.");
        String reservedString = scanner.nextLine();
        boolean reserved;
        // check value is true or false
        if (!"true".equals(reservedString) && !"false".equals(reservedString)) {
        	System.out.println("Re-input reservation status.");
        	reservedString = scanner.nextLine();
        }
        reserved = "true".equals(reservedString.toLowerCase());
        // Add to monkey ArrayList
        Monkey newMonkey;
            newMonkey = new Monkey(name, breed, gender, age, weight, tailLength, height, bodyLength, acquisitionDate, acquisitionCountry,
                    trainingStatus, reserved, inServiceCountry);
            System.out.println("New monkey added.");
            monkeyList.add(newMonkey);
        
        // Return to main
            main(null);}
    }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        //If animal matches correct input access object from ArrayList
        //updated reserved attribute
        
            public static void reserveAnimal(Scanner scanner) {
                System.out.println("Please enter animal type.");
                String type;
                
                do { type = scanner.nextLine().toLowerCase();
                     String reserveType = type;
                     System.out.println("Input animal country.");
                     String reserveCountry = scanner.nextLine();
                     reserveCountry = reserveCountry.toLowerCase();
                switch (type) {
           ///MONKEY
                    case "monkey":
                        System.out.println("Here is the list of available monkeys.");
                        for (int i = 0; i < monkeyList.size(); i++) {
                            System.out.println(monkeyList.get(i).getName());
                        }
                        System.out.println("Enter the name of desired monkey.");
                        String monkeyName = scanner.nextLine().toLowerCase();
                        for (Monkey obj: monkeyList) {
                            if (obj.getName().equals(monkeyName)) {
                                obj.reserved = true;
                                monkeyList.add(obj);
                                System.out.println("Thank you for reserving " + monkeyName + " take care!");
                                return;

                            } else {
                                System.out.println("Sorry, we don't have that monkey!");
                                scanner.nextLine();
                                return;
                            }
                        }
                        break;
              ///DOG
                    case "dog":
                        System.out.println("Here are our available dogs.");
                        for (int i = 0; i < dogList.size(); i++) {
                            System.out.println(dogList.get(i).getName());

                        }
                        System.out.println("Enter the name of desired dog.");
                        String dogName = scanner.nextLine().toLowerCase();
                        for (Dog obj: dogList) {
                            if (obj.getName().equals(dogName)) {
                                obj.reserved = true;
                                dogList.add(obj);
                                System.out.println("Thank you for reserving " + dogName + " take care!");
                                return;


                            } else {
                                System.out.println("Sorry we don't have that dog!");
                                scanner.nextLine();
                                return;
                            }
                        }
                        break;
                
        }
            } while (!type.equals("q"));
                }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String newAction) {
            System.out.println("Enter Selection.");
            System.out.println("The user selection is: " + newAction);
            //menu option 4
            if (newAction.equals("4")) {
                System.out.println("Printing all dogs.");
                for (int i = 0; i < dogList.size(); i++) {
                    System.out.println(dogList.get(i).getName());
                }
            }
            //menu option 5
            if (newAction.equals("5")) {
                System.out.println("Printing all monkeys.");
                for (int i = 0; i < monkeyList.size(); i++) {
                    System.out.println(monkeyList.get(i).getName());
                }
            }
            //menu option 6
            if (newAction.equals("6")) {
                System.out.println("Printing all available animals.");
                
                for (int i = 0; i < dogList.size(); i++) {
                    if (!dogList.get(i).reserved) {
                        System.out.println(dogList.get(i).getName());
                    }
                }
            for (int i = 0; i < monkeyList.size(); i++) {
                if (!monkeyList.get(i).reserved) {
                    System.out.println(monkeyList.get(i).getName());
                }
            }
            }

        }
}
