import java.io.*;
import java.util.*;

class FoodieFaveConsole {
    private FoodQueue[] queues;
    private static   ArrayList<String>abs=new ArrayList<>();
    private int queue1=0;           //Initialize income of queue 1
    private int queue2=0;           //Initialize income of queue 2
    private int queue3=0;           //Initialize income of queue 3

public static int burgernum=50;    //Initialize burger count

    public FoodieFaveConsole() throws IOException {
        // Make array lists
        queues = new FoodQueue[3];
        FoodQueue Cashier1 = new FoodQueue(2);
        FoodQueue Cashier2 = new FoodQueue(3);
        FoodQueue Cashier3 = new FoodQueue(5);
        FoodQueue Cashier4 = new FoodQueue(10);


            //Get inputs
            Scanner scanner = new Scanner(System.in);

            while (true) {
                displayMenu();
                System.out.print("Insert your option : ");
                String option = scanner.next();

                // Consume newline
                scanner.nextLine();

                // Switch Case options
                switch (option) {
                    case "100", "VFQ":
                        viewAllQueues(Cashier1,Cashier2,Cashier3);
                        break;
                    case "101", "VEQ":
                        viewAllEmptyQueues(Cashier1, Cashier2, Cashier3);
                        break;
                    case "102", "ACQ":
                        addCustomerToQueue(scanner, Cashier1,Cashier2,Cashier3,Cashier4);
                        break;
                    case "103", "RCQ":
                        removeCustomerFromQueue(scanner,Cashier1,Cashier2,Cashier3);
                        break;
                    case "104", "PCQ":
                        removeServedCustomer(scanner,Cashier1,Cashier2,Cashier3);
                        break;
                    case "105", "VCS":
                        viewCustomersSortedAlphabetically(Cashier1,Cashier2,Cashier3);
                        break;
                    case "106", "SPD":
                        storeProgramDataToFile(Cashier1,Cashier2,Cashier3);
                        System.out.println("Program data store into the file successfully.");
                        break;
                    case "107", "LPD":
                        loadProgramDataFromFile(Cashier1,Cashier2,Cashier3);
                        System.out.println("Load the program dat from file successfully.");
                        break;
                    case "108", "STK":
                        viewRemainingBurgersStock();
                        break;
                    case "109", "AFS":
                        addBurgersToStock(scanner);
                        break;
                    case "110", "IFQ":
                        System.out.println("Income of Queue 1 : " + queue1*650 + " rupee");
                        System.out.println("Income of Queue 2 : " + queue2*650 + " rupee");
                        System.out.println("Income of Queue 3 : " + queue3*650 + " rupee");
                        break;
                    case "999", "EXT":
                        System.out.println("Exiting the program...");
                        System.out.println("Have a nice day...\n\t ****Foodies Fav Food Center***");
                        return;
                    default:
                        System.out.println("Insert an invalid option. \nRefer the 'MENU OPTIONS' and insert valid options.");
                        break;
                }
            }
        }

        // Code Block to display Main Menu
        public void displayMenu () {

            System.out.println("\t" + "\t" + "***MENU OPTIONS***");
            System.out.println("\t" + "100 or VFQ: View all Queues");
            System.out.println("\t" + "101 or VEQ: View all Empty Queues");
            System.out.println("\t" + "102 or ACQ: Add customer to a Queue");
            System.out.println("\t" + "103 or RCQ: Remove a customer from a Queue");
            System.out.println("\t" + "104 or PCQ: Remove a served customer");
            System.out.println("\t" + "105 or VCS: View Customers Sorted in alphabetical order");
            System.out.println("\t" + "106 or SPD: Store Program Data into file");
            System.out.println("\t" + "107 or LPD: Load Program Data from file");
            System.out.println("\t" + "108 or STK: View Remaining burgers Stock");
            System.out.println("\t" + "109 or AFS: Add burgers to Stock");
            System.out.println("\t" + "110 or IFQ: Print Income Of Each Queues");
            System.out.println("\t" + "999 or EXT: Exit the Program");
            System.out.println(" ");
        }


// Code block to add customers to three queues
public void addCustomerToQueue(Scanner scanner, FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3, FoodQueue Cashier4) {
        System.out.print("Enter customer's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter customer's last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter number of burgers required: ");
        int burgersRequired = scanner.nextInt();

        Customer customer = new Customer(firstName, lastName, burgersRequired);
        if (Cashier1.getQueueLength() == 0) {
            Cashier1.addCustomer(customer);
            System.out.println(firstName + " added to queue 1 successfully.");
        } else if (Cashier2.getQueueLength() == 0) {
            Cashier2.addCustomer(customer);
            System.out.println(firstName + " added to queue 2 successfully.");
        } else if (Cashier3.getQueueLength() == 0) {
            Cashier3.addCustomer(customer);
            System.out.println(firstName + " added to queue 3 successfully.");

        } else if (Cashier1.getQueueLength() < Cashier2.getQueueLength() && Cashier1.getQueueLength() < Cashier3.getQueueLength()) {
            Cashier1.addCustomer(customer);
            System.out.println(firstName + " added to queue 1 successfully.");
        } else if (Cashier2.getQueueLength() < Cashier1.getQueueLength() && Cashier2.getQueueLength() < Cashier3.getQueueLength()) {
            Cashier2.addCustomer(customer);
            System.out.println(firstName + " added to queue 2 successfully.");
        } else if (Cashier3.getQueueLength() < Cashier1.getQueueLength() && Cashier3.getQueueLength() < Cashier2.getQueueLength()) {
            Cashier3.addCustomer(customer);
            System.out.println(firstName + " added to queue 3 successfully.");
        }  else if (Cashier1.getQueueLength() == Cashier2.getQueueLength() && Cashier1.getQueueLength() < 2) {
            Cashier1.addCustomer(customer);
            System.out.println(firstName + " added to queue 1 successfully.");
        } else if (Cashier2.getQueueLength() == Cashier3.getQueueLength() && Cashier2.getQueueLength() < 3) {
            Cashier2.addCustomer(customer);
            System.out.println(firstName + " added to queue 2 successfully.");
        } else {
            Cashier3.addCustomer(customer);
            System.out.println(firstName + " added to queue 3 successfully.");
        }


        // Code implement for create a waiting queue
      if(Cashier1.getQueueLength()==2||Cashier2.getQueueLength()==3||Cashier3.getQueueLength()==5){
          Cashier4.addCustomer(customer);
      }
}

    // Implement the code to remove customers from specific location
    public void removeCustomerFromQueue(Scanner scanner,FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) {
        System.out.println("Enter the queue number (1, 2, or 3):");
        int queueNumber = scanner.nextInt();
        System.out.println("Enter the position (position is starts at 1) of customer in the queue:");
        System.out.println("Queue 1 has two positions.\nQueue 2 has three positions.\nQueue 3 has five positions.");
        int customerIndex = scanner.nextInt();

        if(queueNumber==1 && customerIndex < 3){
            Cashier1.removeCustomer(customerIndex -1);
        } else if (queueNumber == 1 && customerIndex >= 3){
            System.out.println("You insert an invalid position.\nInsert valid position and again remove the same customer.");
            System.out.println(" ");
            return;
        }
        if(queueNumber==2 && customerIndex < 4){
            Cashier2.removeCustomer(customerIndex -1);
        } else if(queueNumber==2 && customerIndex >= 4) {
            System.out.println("You insert an invalid position.\nIInsert valid position and again remove the same customer.");
            System.out.println(" ");
            return;
        }
        if(queueNumber==3 && customerIndex < 6){
            Cashier3.removeCustomer(customerIndex -1);
        } else if(queueNumber==3 && customerIndex >= 6) {
            System.out.println("You insert an invalid position.Insert valid position and again remove the same customer.");
            System.out.println(" ");
        }
    }

    public void removeCustomer(int queueIndex, int customerIndex) {
        queues[queueIndex].removeCustomer(customerIndex);
    }

    // Implement the code block to remove a served customer from a queue
    public void removeServedCustomer(Scanner scanner,FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) {
        System.out.print("Enter queue number: ");
        int queueIndex = scanner.nextInt();
       // scanner.nextLine(); // Consume newline
        if(queueIndex==1){
            burgernum=burgernum-Cashier1.getBurgersInStock(0);
            queue1=queue1+Cashier1.getBurgersInStock(0);
            Cashier1.removeCustomer(0);
            System.out.println("Served customer removed from queue 1 successfully.");

        }
        if(queueIndex==2){
            burgernum=burgernum-Cashier2.getBurgersInStock(0);
            queue2=queue2+Cashier2.getBurgersInStock(0);
            Cashier2.removeCustomer(0);
            System.out.println("Served customer removed from queue 2 successfully.");
        }
        if(queueIndex==3){
            burgernum=burgernum-Cashier3.getBurgersInStock(0);
            queue3=queue3+Cashier3.getBurgersInStock(0);
            Cashier3.removeCustomer(0);
            System.out.println("Served customer removed from queue 3 successfully.");
        }


    }

    public void removeServedCustomer(int queueIndex, FoodQueue Cashier4) {

        if (!queues[queueIndex].isEmpty()) {
            queues[queueIndex].removeCustomer(0);
        }
        if (!Cashier4.isEmpty()) {
            Customer nextCustomer = Cashier4.removeCustomer(0);
            queues[queueIndex].addCustomer(nextCustomer);
            queues[queueIndex].updateBurgersInStock(1);
            System.out.println("Next customer from waiting list added to Queue " + queueIndex);
        }
    }

    // Implement the code to sort customers in alphabetical order.
    public void viewCustomersSortedAlphabetically(FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) {
        System.out.println("Customers in alphabetical order:");
        for (int i=0;i<Cashier1.getQueueLength();i++){
            abs.add(Cashier1.sortCustomersAlphabetically(i));
        }
        for (int i=0;i<Cashier2.getQueueLength();i++){
            abs.add(Cashier2.sortCustomersAlphabetically(i));
        }
        for (int i=0;i<Cashier3.getQueueLength();i++){
            abs.add(Cashier3.sortCustomersAlphabetically(i));
        }

        abs.sort(Comparator.naturalOrder());

        for(int i=0;i<abs.size();i++){
            System.out.println(abs.get(i));
        }




    }

    // Implement the code to store program data into a file.
    public void storeProgramDataToFile(FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) throws IOException {
        File file=new File("tex1.txt");
        FileOutputStream a=new FileOutputStream(file,true);
        ObjectOutputStream obj=new ObjectOutputStream(a);

        for(int i=0;i<Cashier1.getQueueLength();i++){
            Customer new1=Cashier1.getCustomer(i);
            obj.writeObject(new1);
        }
        File file1=new File("tex2.txt");
        FileOutputStream a1=new FileOutputStream(file1,true);
        ObjectOutputStream obj1=new ObjectOutputStream(a1);

        for(int i=0;i<Cashier2.getQueueLength();i++){
            Customer new2=Cashier1.getCustomer(i);
            obj1.writeObject(new2);
        }
        File file2=new File("tex3.txt");
        FileOutputStream a2=new FileOutputStream(file2,true);
        ObjectOutputStream obj2=new ObjectOutputStream(a2);

        for(int i=0;i<Cashier3.getQueueLength();i++){
            Customer new3=Cashier1.getCustomer(i);
            obj2.writeObject(new3);
        }
    }

    // Implement the code to load the program data from file.
    public void loadProgramDataFromFile(FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) throws IOException {
       FileInputStream fin= new FileInputStream("tex1.txt") ;
       ObjectInputStream objin=new ObjectInputStream(fin);

       while (true){
           try{ Customer c=(Customer) objin.readObject();
               Cashier1.addCustomer(c);

           }
           catch (Exception e){
               break;
           }
       }
        FileInputStream fin1= new FileInputStream("tex2.txt") ;
        ObjectInputStream objin1=new ObjectInputStream(fin1);

        while (true){
            try{ Customer c=(Customer) objin1.readObject();
                Cashier2.addCustomer(c);

            }
            catch (Exception e){
                break;
            }
        }
        FileInputStream fin2= new FileInputStream("tex3.txt") ;
        ObjectInputStream objin2=new ObjectInputStream(fin2);

        while (true){
            try{ Customer c=(Customer) objin2.readObject();
                Cashier3.addCustomer(c);

            }
            catch (Exception e){
                break;
            }



        }
    }

    // Implement the code to get input to add burgers to the stock.
    public void addBurgersToStock(Scanner scanner) {
        System.out.print("Enter quantity of burgers to add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        addBurgersToStock(quantity);
    }

    // Implement the code to add burgers to the stock.
    public void addBurgersToStock(int quantity) {
        burgernum = burgernum + quantity;
        System.out.println("Burgers stock updated.\nRemaining burger stock is : " + burgernum + " burgers.");
        System.out.println(" ");
    }

    // Implement the code to view all queues.
    public void viewAllQueues(FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) {
        System.out.println("*****************");
        System.out.println("*****Cashier*****");
        System.out.println("*****************");
        for (int i = 0; i < 5; i++) {
            if (i < 2) {
                if(i<Cashier1.getQueueLength()){
                if(Cashier1.getCustomer(i) !=null){
                System.out.print("O");
            }}
            else {
                System.out.print("X");
            }}
                System.out.print("\t\t");


            if (i < 3) {
                if(i<Cashier2.getQueueLength()){
                if(Cashier2.getCustomer(i) !=null){
                    System.out.print("O");
                }} else {
                    System.out.print("X");
                }}
                System.out.print("\t\t");


            if (i < 5) {
                if(i<Cashier3.getQueueLength()){
                if(Cashier3.getCustomer(i) !=null){
                    System.out.print("O");
                }} else {
                    System.out.print("X");
                }}
                System.out.print("\t\t");

            System.out.println(" ");
        }

    }


    // Implement the code to view all empty queues.
    public void viewAllEmptyQueues(FoodQueue Cashier1, FoodQueue Cashier2, FoodQueue Cashier3) {
        System.out.println("*****************");
        System.out.println("*****Cashier*****");
        System.out.println("*****************");
        for (int i = 0; i < 5; i++) {
            if (i < 2) {
                if(i<Cashier1.getQueueLength()){
                    if(Cashier1.getCustomer(i) !=null){
                        System.out.print(" ");
                    }}
                else {
                    System.out.print("X");
                }}
            System.out.print("\t\t");


            if (i < 3) {
                if(i<Cashier2.getQueueLength()){
                    if(Cashier2.getCustomer(i) !=null){
                        System.out.print(" ");
                    }} else {
                    System.out.print("X");
                }}
            System.out.print("\t\t");


            if (i < 5) {
                if(i<Cashier3.getQueueLength()){
                    if(Cashier3.getCustomer(i) !=null){
                        System.out.print(" ");
                    }} else {
                    System.out.print("X");
                }}
            System.out.print("\t\t");

            System.out.println(" ");
        }
    }

    // Implement the code to view remaining burgers in stock.
    public void viewRemainingBurgersStock() {
        System.out.println( "Remaining Burgers Stock: " + burgernum);

    }

    public static void main(String[] args) throws IOException {
       FoodieFaveConsole foodieFaveConsole = new FoodieFaveConsole();
        foodieFaveConsole.runProgram();
    }

    private void runProgram() {
    }
}
