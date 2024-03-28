import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class FoodiesFaveFoodCenter {
    public static void main(String[] args) {

        // initialize Sum Of Burger count equal to 50
        int SumOfBurgers = 50;
        final int MaxBurgers;
        MaxBurgers = 50;


        //Create arrays for build the program
        String[] Cashier1 = new String[2];
        String[] Cashier2 = new String[3];
        String[] Cashier3 = new String[5];
        String[] Cashier4 = new String[10];


        while (true) {

            // Displaying the main menu options
            System.out.println("100 or VFQ: View all Queues");
            System.out.println("101 or VEQ: View all Empty Queues");
            System.out.println("102 or ACQ: Add customer to a Queue");
            System.out.println("103 or RCQ: Remove a customer from a Queue. (From a specific location)");
            System.out.println("104 or PCQ: Remove a served customer");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order (Do not use library sort routine)");
            System.out.println("106 or SPD: Store Program Data into file");
            System.out.println("107 or LPD: Load Program Data from file");
            System.out.println("108 or STK: View Remaining burgers Stock");
            System.out.println("109 or AFS: Add burgers to Stock");
            System.out.println("999 or EXT: Exit the Program");


            // Ask user to insert option and get inputs properly
            Scanner input = new Scanner(System.in);
            System.out.println("Insert your option: ");
            String foodie = input.next();



            // Function to  all queues
            if (foodie.equals("100") || foodie.equals("VFQ")) {
                System.out.println("*****************");
                System.out.println("* Cashiers *");
                System.out.println("*****************");

                System.out.println(" ");
                System.out.println("All Queues: ");

                for (int i = 0; i < 5; i++) {
                    if (i < Cashier1.length) {
                        if (Cashier1[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print("0");
                        }
                    } else {
                        System.out.print(" ");
                    }

                    if (i < Cashier2.length) {
                        if (Cashier2[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print("0");
                        }
                    } else {
                        System.out.print(" ");
                    }

                    if (i < Cashier3.length) {
                        if (Cashier3[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print("0");
                        }
                    } else {
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                }




                // Function to display  all empty queues
            } else if (foodie.equals("101") || foodie.equals("VEQ")) {
                System.out.println("*****************");
                System.out.println("  * Cashiers *   ");
                System.out.println("*****************");

                System.out.println(" ");
                System.out.println("Empty Queues: ");

                for (int i = 0; i < 5; i++) {
                    if (i < Cashier1.length) {
                        if (Cashier1[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }

                    if (i < Cashier2.length) {
                        if (Cashier2[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }

                    if (i < Cashier3.length) {
                        if (Cashier3[i] == null) {
                            System.out.print("x");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                }


            }

            // Function to add customers into a queue
            else if (foodie.equals("102") || foodie.equals("ACQ")) {
                System.out.println("Insert customer name: ");
                String customerName = input.next();

                System.out.println("Insert queue number do you want to add customer:\n " +
                        "(Insert 1 to 1st queue, Insert 2 to 2nd queue, Insert 3 to 3rd queue) ");
                int cashNum = input.nextInt();

                // Insert a queue number and add customers into special queues.
                if (cashNum == 1) {
                    if (Cashier1[0] == null) {
                        Cashier1[0] = customerName;
                        System.out.println("Customer added queue 1 successfully.");
                        System.out.println(" ");
                    } else if (Cashier1[1] == null) {
                        Cashier1[1] = customerName;
                        System.out.println("Customer added queue 1 successfully.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Queue 1 is full.\n Go another queue and add customers.");
                        System.out.println(" ");
                    }

                } else if (cashNum ==2) {
                    if (Cashier2[0] == null) {
                        Cashier2[0] = customerName;
                        System.out.println("Customer added queue 2 successfully.");
                        System.out.println(" ");
                    } else if (Cashier2[1] == null) {
                        Cashier2[1] = customerName;
                        System.out.println("Customer added queue 2 successfully.");
                        System.out.println(" ");
                    } else if (Cashier2[2] == null) {
                        Cashier2[2] = customerName;
                        System.out.println("Customer added queue 2 successfully.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Queue 2 is full.\n Go another queue and add customers.");
                        System.out.println(" ");
                    }

                } else if (cashNum == 3) {
                    if (Cashier3[0] == null) {
                        Cashier3[0] = customerName;
                        System.out.println("Customer added queue 3 successfully.");
                        System.out.println(" ");
                    } else if (Cashier3[1] == null) {
                        Cashier3[1] = customerName;
                        System.out.println("Customer added queue 3 successfully.");
                        System.out.println(" ");
                    } else if (Cashier3[2] == null) {
                        Cashier3[2] = customerName;
                        System.out.println("Customer added queue 3 successfully.");
                        System.out.println(" ");
                    } else if (Cashier3[3] == null) {
                        Cashier3[3] = customerName;
                        System.out.println("Customer added queue 3 successfully.");
                        System.out.println(" ");
                    } else if (Cashier3[4] == null) {
                        Cashier3[4] = customerName;
                        System.out.println("Customer added queue 3 successfully.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Queue 3 is full.\n Go another queue and add customers.");
                        System.out.println(" ");
                    }

                } else {
                    System.out.println("Invalid queue number. Insert a valid queue number");
                    System.out.println(" ");
                }





                // Implement code block to remove a customer from a Queue (From specific location)
            } else if (foodie.equals("103") || foodie.equals("RCQ")) {
                System.out.println(" customer1 customer2 customer3 ");
                System.out.println(" customer4 customer5 customer6 ");
                System.out.println("           customer7 customer8 ");
                System.out.println("                     customer9 ");
                System.out.println("                     customer10");

                // Ask user to enter who is the customer want to remove
                System.out.println("Insert what is the customer number you want to remove? ");
                System.out.println("Enter like this.\n EX:\n 'customer1'");

                String customerNum = input.next();

                if (customerNum.equals("customer1")) {
                    Cashier1[0] = null;
                } else if (customerNum.equals("customer2")) {
                    Cashier2[0] = null;
                } else if (customerNum.equals("customer3")) {
                    Cashier3[0] = null;
                } else if (customerNum.equals("customer4")) {
                    Cashier1[1] = null;
                } else if (customerNum.equals("customer5")) {
                    Cashier2[1] = null;
                } else if (customerNum.equals("customer6")) {
                    Cashier3[1] = null;
                } else if (customerNum.equals("customer7")) {
                    Cashier2[2] = null;
                } else if (customerNum.equals("customer8")) {
                    Cashier3[2] = null;
                } else if (customerNum.equals("customer9")) {
                    Cashier3[3] = null;
                } else if (customerNum.equals("customer10")) {
                    Cashier3[4] = null;
                }

                System.out.println(customerNum + " has been removed from the queue.");
                System.out.println(" ");




                // Implement code block to remove a served customer
            } else if (foodie.equals("104") || foodie.equals("PCQ")) {
                System.out.println("Insert the Cashier number you want to remove a served customer? ");
                System.out.println("(Enter Cashier1 to 1, Cashier2 to 2 & Cashier3 to 3)");

                int customerRow = input.nextInt();
                if (customerRow == 1) {
                    Cashier1[0] = null;
                    SumOfBurgers = (SumOfBurgers - 5);
                }
                if (customerRow == 2) {
                    Cashier2[0] = null;
                    SumOfBurgers = (SumOfBurgers - 5);
                }
                if (customerRow == 3) {
                    Cashier3[0] = null;
                    SumOfBurgers = (SumOfBurgers - 5);
                }




                // Implement code to view Customers Sorted in alphabetical order
            } else if (foodie.equals("105") || foodie.equals("VSC")) {
                System.arraycopy(Cashier1,0,Cashier4,0,Cashier1.length);
                System.arraycopy(Cashier2,0,Cashier4,Cashier1.length,Cashier2.length);
                System.arraycopy(Cashier3,0,Cashier4,Cashier1.length+Cashier2.length,Cashier3.length);

                for(int i = 0; i < Cashier4.length-1; i++){
                    for(int count = i+1;  count < Cashier4.length;  count++) {
                        if(Cashier4[i] != null && Cashier4[count] != null) {
                            if(0 < Cashier4[i].compareToIgnoreCase(Cashier4[count])) {
                                String alphabetic = Cashier4[i];
                                Cashier4[i] = Cashier4[count];
                                Cashier4[count] = alphabetic;
                            }
                        }
                    }
                }
                System.out.println("Customers were sorted in alphabetical order: ");

                for(String cust:Cashier4){
                    if(cust != null){
                        System.out.println(cust);
                    }
                }
                System.out.println(" ");




                // Implement code for store Program Data into file.
            } else if (foodie.equals("106") || foodie.equals("SPD")) {

                //Use exception handling to resolve errors that occur while creating a file.
                try {
                    // Create a file named as "foodiefile.txt"

                    FileWriter foodie_file = new FileWriter("foodiefile.txt");

                    // Write data into file named as "foodiefile.txt

                    foodie_file.write("Cashier1: ");
                    for (int i = 0; i < Cashier1.length; i++) {
                        if (Cashier1[i] != null) {
                            foodie_file.write(Cashier1[i]);
                            foodie_file.write(",");
                        } else {
                            foodie_file.write(" ");
                        }
                        System.out.print(",");
                    }
                    foodie_file.write("\nCashier2: ");
                    for (int i = 0; i < Cashier2.length; i++) {
                        if (Cashier2[i] != null) {
                            foodie_file.write(Cashier2[i]);
                            foodie_file.write(",");
                        } else {
                            foodie_file.write(" ");
                        }
                        System.out.print(",");
                    }
                    foodie_file.write("\nCashier3: ");
                    for (int i = 0; i < Cashier3.length; i++) {
                        if (Cashier3[i] != null) {
                            foodie_file.write(Cashier3[i]);
                            foodie_file.write(",");
                        } else {
                            foodie_file.write(" ");
                        }
                    } foodie_file.close();
                } catch (Exception e){
                    System.out.print(e);}

                System.out.println("Program data sorted into the file.");
                System.out.println(" ");



                // Implement code for load Program Data from file.
            } else if (foodie.equals("107") || foodie.equals("LPD")) {

                System.out.println("Program data load from the file: ");

                //Use exception handling to resolve errors that occur while load program data from file.
                try {

                    // Read data from file.
                    FileReader foodie_file = new FileReader("foodiefile.txt");
                    int i;
                    while ((i = foodie_file.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (Exception e) {
                    System.out.print(e);
                }




                // Function to view remaining burger stock.
            } else if (foodie.equals("108") || foodie.equals("STK")) {
                System.out.println("Amount of burgers still remaining in the stock is: " + SumOfBurgers);
                System.out.println(" ");

                // Function to add burgers into the stock.
            } else if (foodie.equals("109") || foodie.equals("AFS")) {
                int MaxBurgerCount = (50 - SumOfBurgers);

                // Check if burger stock is equal to 50 and print a massage
                if (SumOfBurgers == 50) {
                    System.out.println("WARNING:\n You can not add more burgers because burger stock has 50 burgers.");
                    System.out.println(" ");

                    continue;

                    // Check if burger stock is less than 10 and print a warning massage.
                } else if (SumOfBurgers < 10) {
                    System.out.println("WARNING:\n Quickly add the burgers for the burger stock because burger stock is less than 10");
                } else {
                    System.out.println("You can add maximum burger count is: "+MaxBurgerCount+" Burgers.");
                    System.out.println("Insert the amount of burgers you want to add: ");
                }
                int burger_count = input.nextInt();
                SumOfBurgers = SumOfBurgers + burger_count;

                // Check the amount of new burgers being added and check that the total is within the limit.
                if (SumOfBurgers > MaxBurgers) {
                    System.out.println("You can not add "+burger_count+" Burgers. Because the maximum limit that the burger stock can maintain is 50 Burgers.");
                    System.out.println(" ");
                    SumOfBurgers = SumOfBurgers - burger_count;
                }
                else  {

                    // Display new burger stock.
                    System.out.println(burger_count+" burgers successfully added to the stock.");
                    System.out.println("New burger sock is updated to: " + SumOfBurgers + " Burgers");
                    System.out.println(" ");
                }




                // Function to exit the program.
            } else if (foodie.equals("999") || foodie.equals("EXT")) {
                System.out.println(" Have a nice day.");
                System.out.println("*** Foodies Fave Food center ***");
                break;

            } else {
                System.out.println("You insert an invalid option.\nRefer the main menu and insert valid option number.");
                System.out.println(" ");
            }


        }


    }


}





