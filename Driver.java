public class Driver{
    public static String name(int a){
	if (a == 4){
	    return "Lieutenant";
	}
	else if (a == 3){
	    return "Captain";
	}
	else if (a == 2){
	    return "Major";
	}
	else if (a == 1){
	    return "General";
	}
	else{
	    System.out.println("Please enter a valid selection");
	    System.out.print("Your selection: ");
	    return name(Keyboard.readInt());
	}
    }
    public static void main(String[] args){
	HelpDesk halp = new HelpDesk();
	System.out.println("Welcome to the Help Desk!");
	boolean go = true;
	int rank = 0;
	String name = "";
	int num = 0;
	String problem = "";
	int selection = 0;
	while (go){
	    System.out.println("\n\n======================================");
	    System.out.println("What would you like to do?");
	    System.out.println("1. Add a new entry");
	    System.out.println("2. Solve the next issue (Queue Size: " + halp.size() + ")");
	    
	    if (halp.size() == 0){
		System.out.println("3. Exit");
	    }
	    
	    System.out.print("Your selection: ");
	    selection = Keyboard.readInt();
	    
	    if (selection == 1){
		name = "";
		System.out.println("\n\nWhat is your rank?");
		System.out.println("1. General\t 2. Major");
		System.out.println("3. Captain\t 4. Lieutenant");
		System.out.print("Your selection: ");
	        num = Keyboard.readInt();
		name += name(num) + " ";
		rank = num - 1;

		System.out.println("\n\nWhat is your name?");
		System.out.print("Name: ");
		name += Keyboard.readString();

		System.out.println("\n\nHi " + name + "!");
		System.out.println("How can we help?");
		System.out.print("Problem: ");
		problem = Keyboard.readString();

		System.out.println("\n\nGot it. Please wait for your issue to be processed.");

		halp.addP(rank, problem, name);
		
	    }

	    else if (selection == 2){
		System.out.println("\nHere's the Ticket");
		halp.solve();
		System.out.println("\nSuccessfully added to the database of solutions (Solutions: " + halp.sizeData() + ")");
		
	    }
	    else{
		if (halp.size() == 0 && selection == 3){
		    go = false;
		}
		else{
		    System.out.println("Please choose a valid selection");
		}
	    }
	}
    }
}
