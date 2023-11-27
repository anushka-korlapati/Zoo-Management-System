package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Predefined discounts
        Discount discount1 = new Discount("<", 18, "Minor", 10);
        Discount discount2 = new Discount(">", 60,"Senior", 20);

        List<Discount> discounts = new ArrayList<>();
        discounts.add(discount1);
        discounts.add(discount2);

        //Predefined special-deals
        SpecialDeals deal1 = new SpecialDeals(2, 15);
        SpecialDeals deal2 = new SpecialDeals(3, 30);

        List<SpecialDeals> specialDeals = new ArrayList<>();
        specialDeals.add(deal1);
        specialDeals.add(deal2);

        List<Visitor> visitors = new ArrayList<>();
        List<String> feedbacks = new ArrayList<>();

        List<Attraction> attractions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Zoo zoo = new Zoo();
        Animal lion = new Mammal("Lion", "Roar", " Lions are predatory animals and eat only after hunting.");
        Animal frog = new Amphibian("Frog", "Ribbit", "Frogs are amphibians, which means they're able to live on land and in water. ");
        Animal snake = new Reptile("Snake", "Hiss", "A slithering reptile");

        zoo.animals.add(lion);
        zoo.animals.add(frog);
        zoo.animals.add(snake);


        while (true) {

            System.out.println("Welcome to ZOOtopia!\n1. Enter as admin\n2. Enter as a visitor\n3. View Special Deals\n4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                Admin admin = new Admin();
                admin.inputAdminDetails(scanner);

                if (admin.isAdminCredentialsCorrect()) {
                    while (true) {
                        System.out.println("Admin Menu:");
                        System.out.println("1. Manage Attractions");
                        System.out.println("2. Manage Animals");
                        System.out.println("3. Schedule Events");
                        System.out.println("4. Set Discounts");
                        System.out.println("5. Set Special Deal");
                        System.out.println("6. View Visitor Stats");
                        System.out.println("7. View Feedback");
                        System.out.println("8. Exit");

                        System.out.print("Enter your choice: ");
                        int admin_menu = scanner.nextInt();
                        scanner.nextLine();

                        if (admin_menu == 1) {
                            while (true) {
                                System.out.println("Manage Attractions:");
                                System.out.println("1. Add Attraction");
                                System.out.println("2. View Attractions");
                                System.out.println("3. Modify Attraction");
                                System.out.println("4. Remove Attraction");
                                System.out.println("5. Exit");

                                System.out.print("Enter your choice: ");
                                int att_choice = scanner.nextInt();
                                scanner.nextLine();

                                if (att_choice == 1) {

                                    System.out.println("Add Attraction:");
                                    Attraction attraction = new Attraction();
                                    attraction.inputAttractionDetails(scanner);
                                    attractions.add(attraction);

                                } else if (att_choice == 2) {

                                    System.out.println("View Attractions:");
                                    for (Attraction attraction : attractions) {
                                        attraction.viewAttractionDetails();
                                    }

                                } else if (att_choice == 3) {

                                    System.out.println("Modify Attraction:");
                                    for (Attraction attraction : attractions) {
                                        System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                    }

                                    System.out.print("Enter the UID of the attraction you want to modify: ");
                                    int modifyChoice = scanner.nextInt();
                                    scanner.nextLine();

                                    Attraction selectedAttraction = null;
                                    for (Attraction attraction : attractions) {
                                        if (attraction.getUnique_id() == modifyChoice) {
                                            selectedAttraction = attraction;
                                            break;
                                        }
                                    }
                                    if (selectedAttraction != null) {
                                        selectedAttraction.inputAttractionDetails(scanner);
                                    } else {
                                        System.out.println("Invalid choice. No attraction found with the given unique ID.");
                                    }
                                } else if (att_choice == 4) {

                                    System.out.println("Remove Attraction:");

                                    for (Attraction attraction : attractions) {
                                        System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                    }

                                    System.out.print("Enter the unique ID of the attraction you want to remove: ");
                                    int removeChoice = scanner.nextInt();
                                    scanner.nextLine();

                                    Attraction attractionToRemove = null;
                                    for (Attraction attraction : attractions) {
                                        if (attraction.getUnique_id() == removeChoice) {
                                            attractionToRemove = attraction;
                                            break;
                                        }
                                    }

                                    if (attractionToRemove != null) {
                                        attractions.remove(attractionToRemove);
                                        System.out.println("Attraction '" + attractionToRemove.getName() + "' with ID " + removeChoice + " has been removed.");
                                    } else {
                                        System.out.println("No attraction found with the given unique ID.");
                                    }
                                } else if (att_choice == 5) {
                                    System.out.println("Exit");
                                    break;
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                            }
                        } else if(admin_menu==2){
                            while(true){

                                System.out.println("Manage Animals:");
                                System.out.println("1. Add Animals");
                                System.out.println("2. Update Animal");
                                System.out.println("3. Remove Animals");
                                System.out.println("4. Exit");

                                System.out.print("Enter your choice: ");
                                int animal_choice = scanner.nextInt();
                                scanner.nextLine();

                                if(animal_choice==1){
                                    System.out.println("Add animals: ");

                                    System.out.println("Select type of Animal:");
                                    System.out.println("1. Mammal");
                                    System.out.println("2. Amphibian");
                                    System.out.println("3. Reptile");

                                    System.out.print("Enter the type of animal: ");
                                    int animalType = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Enter the name of the animal: ");
                                    String name = scanner.nextLine();
                                    System.out.print("Enter the sound of the animal: ");
                                    String sound = scanner.nextLine();
                                    System.out.print("Enter the description of the animal: ");
                                    String description = scanner.nextLine();

                                    Animal newAnimal = null;

                                    switch (animalType) {
                                        case 1:
                                            newAnimal = new Mammal(name, sound, description);
                                            break;
                                        case 2:
                                            newAnimal = new Amphibian(name, sound, description);
                                            break;
                                        case 3:
                                            newAnimal = new Reptile(name, sound, description);
                                            break;
                                        default:
                                            System.out.println("Invalid animal type.");
                                    }

                                    zoo.addAnimal(newAnimal);

                                    System.out.print("Do you want to add this animal to any specific Attraction? (yes/no): ");
                                    String animalChoice = scanner.nextLine();

                                    if (animalChoice.equalsIgnoreCase("yes")) {
                                        System.out.println("Select an Attraction to add the animal:");
                                        for (Attraction attraction : attractions) {
                                            System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                        }

                                        System.out.print("Enter the UID of the attraction you want to add the animal to: ");
                                        int attChoice = scanner.nextInt();
                                        scanner.nextLine();

                                        Attraction selectedAttraction = null;
                                        for (Attraction attraction : attractions) {
                                            if (attraction.getUnique_id() == attChoice) {
                                                selectedAttraction = attraction;
                                                break;
                                            }
                                        }
                                        if (selectedAttraction != null) {
                                            selectedAttraction.addAnimal(newAnimal);
                                            System.out.println("Animal added to the attraction: " + selectedAttraction.getName());
                                        } else {
                                            System.out.println("Invalid attraction choice.");
                                        }
                                    }

                                } else if(animal_choice==2){

                                    System.out.println("Update animal details: ");

                                    System.out.print("Enter the name of the animal you want to update: ");
                                    String animalName = scanner.nextLine();

                                    Animal selectedAnimal = null;

                                    for (Animal animal : zoo.getAnimals()) {
                                        if (animal.getName().equalsIgnoreCase(animalName)) {
                                            selectedAnimal = animal;
                                            break;
                                        }
                                    }

                                    if (selectedAnimal != null) {
                                        zoo.modifyDetails(selectedAnimal);
                                    } else {
                                        System.out.println("Animal not found in the zoo.");
                                    }

                                } else if(animal_choice==3){

                                    System.out.println("3");
                                    System.out.println("Animals: ");

                                    for (Animal animal : zoo.getAnimals()) {
                                        animal.viewAnimalDetails();
                                        System.out.println();
                                    }

                                    System.out.println("Enter name of animal you want to Remove :");
                                    String animalName = scanner.nextLine();

                                    Animal animalToRemove = null;
                                    for (Animal animal : zoo.getAnimals()) {
                                        if (animal.getName().equalsIgnoreCase(animalName)) {
                                            animalToRemove = animal;
                                            break;
                                        }
                                    }

                                    if (animalToRemove != null) {
                                        zoo.removeAnimal(animalToRemove);
                                    } else {
                                        System.out.println("Animal not found in the zoo.");
                                    }

                                } else if(animal_choice==4){
                                    System.out.println("Exit");
                                    break;
                                } else{
                                    System.out.println("Invalid input");
                                }
                            }

                        } else if (admin_menu == 3) {
                            System.out.println("1. Edit open/close");
                            System.out.println("2. Edit price of entry");
                            System.out.println("3. No. of ticketed visitors");
                            System.out.println("4. Exit");

                            System.out.print("Enter your choice: ");
                            int event_choice = scanner.nextInt();
                            scanner.nextLine();

                            if (event_choice == 1) {
                                // Changing availability
                                System.out.println("Select the attraction to change availability:");

                                for (Attraction attraction : attractions) {
                                    System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                }

                                System.out.print("Enter the unique ID of the attraction: ");
                                int attractionChoice = scanner.nextInt();
                                scanner.nextLine();

                                Attraction selectedAttraction = null;
                                for (Attraction attraction : attractions) {
                                    if (attraction.getUnique_id() == attractionChoice) {
                                        selectedAttraction = attraction;
                                        break;
                                    }
                                }

                                if (selectedAttraction != null) {
                                    // Check if the attraction has at least 2 animals of each type
                                    boolean hasRequiredAnimals =
                                            selectedAttraction.countAnimalsOfType(Mammal.class) >= 2 &&
                                                    selectedAttraction.countAnimalsOfType(Amphibian.class) >= 2 &&
                                                    selectedAttraction.countAnimalsOfType(Reptile.class) >= 2;

                                    if (hasRequiredAnimals) {
                                        selectedAttraction.setOpen_close(!selectedAttraction.isOpen_close());
                                        System.out.println("Availability of attraction '" + selectedAttraction.getName() + "' has been updated.");
                                    } else {
                                        System.out.println("Attraction must have at least 2 animals of each type to open.");
                                    }
                                } else {
                                    System.out.println("Invalid choice. No attraction found with the given unique ID.");
                                }

                            } else if (event_choice == 2) {
                                //change ticket price
                                System.out.println("Select the attraction to edit ticket price:");

                                for (Attraction attraction : attractions) {
                                    System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                }

                                System.out.print("Enter the unique ID of the attraction: ");
                                int attractionChoice = scanner.nextInt();
                                scanner.nextLine();

                                Attraction selectedAttraction = null;
                                for (Attraction attraction : attractions) {
                                    if (attraction.getUnique_id() == attractionChoice) {
                                        selectedAttraction = attraction;
                                        break;
                                    }
                                }

                                if (selectedAttraction != null) {
                                    System.out.print("Enter new ticket price: ");
                                    int newTicketPrice = scanner.nextInt();
                                    selectedAttraction.setTicket_price(newTicketPrice);
                                    System.out.println("Ticket price of attraction '" + selectedAttraction.getName() + "' has been updated.");
                                } else {
                                    System.out.println("Invalid choice. No attraction found with the given unique ID.");
                                }
                            } else if (event_choice == 3) {

                                //incomplete - ticketed visitors
                                System.out.println("Attractions:");
                                for (Attraction att : attractions) {
                                    System.out.println("ID: " + att.getUnique_id() + " - " + att.getName());
                                }

                                System.out.print("Enter the ID of the attraction to view tickets: ");
                                int attractionId = scanner.nextInt();
                                int ticketsSold = 0;

                                for (Attraction att : attractions) {
                                    if (att.getUnique_id() == attractionId) {
                                        ticketsSold += att.getNoOfTickets();
                                        break;
                                    }
                                }

                                System.out.println("No of tickets :"+ ticketsSold);
                            } else if (event_choice == 4) {
                                System.out.println("Exit");
                                break;
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        } else if (admin_menu == 4) {

                            while (true) {
                                System.out.println("1. View Discounts\n2. Add Discounts\n3. Remove Discounts\n4. Exit");
                                System.out.println("Enter your choice: ");
                                int discount_choice = scanner.nextInt();
                                if (discount_choice == 1) {
                                    System.out.println("View Discounts:");
                                    for (Discount discount : discounts) {
                                        discount.displayDiscount();
                                    }
                                } else if (discount_choice == 2) {

                                    System.out.println("Add Discounts");
                                    System.out.println();
                                    System.out.print("Enter age: ");
                                    int age = scanner.nextInt();

                                    System.out.println("Enter lesser than or greater than age: (</>)");
                                    String lessGreat = scanner.nextLine();

                                    System.out.print("Enter category: ");
                                    String category = scanner.nextLine();

                                    System.out.print("Enter discount rate: ");
                                    int disc_rate = scanner.nextInt();

                                    Discount newDiscount = new Discount(lessGreat, age, category, disc_rate);
                                    discounts.add(newDiscount);

                                    System.out.println("Discount added successfully.");

                                } else if (discount_choice == 3) {

                                    System.out.println("Remove Discounts: ");
                                    System.out.print("Enter the s.no of the discount you want to remove: ");
                                    int discToRemove = scanner.nextInt();

                                    Discount discountToRemove = null;
                                    for (Discount discount : discounts) {
                                        if (discount.getSerialNumber() == discToRemove) {
                                            discountToRemove = discount;
                                            break;
                                        }
                                    }

                                    if (discountToRemove != null) {
                                        discounts.remove(discountToRemove);
                                        System.out.println("Discount has been removed.");
                                    } else {
                                        System.out.println("Discount not found.");
                                    }

                                } else if (discount_choice == 4) {
                                    System.out.println("Exit");
                                    break;
                                } else {
                                    System.out.println("Invalid choice");
                                }
                            }
                        } else if (admin_menu == 5) {
                            while (true) {
                                System.out.println("1. View Deals");
                                System.out.println("2.Add Deals");
                                System.out.println("3.Remove Deals");
                                System.out.println("4.Exit");
                                System.out.println("Enter your choice: ");
                                int dealChoice = scanner.nextInt();
                                if (dealChoice == 1) {

                                    System.out.println("Special Deals:");
                                    for (SpecialDeals deal : specialDeals) {
                                        deal.displaySpecialDeals();
                                    }
                                } else if (dealChoice == 2) {

                                    System.out.print("Enter the number of attractions for the special deal: ");
                                    int numAttractions = scanner.nextInt();
                                    System.out.print("Enter the discount rate for the special deal: ");
                                    int discountRate = scanner.nextInt();

                                    SpecialDeals newDeal = new SpecialDeals(numAttractions, discountRate);
                                    specialDeals.add(newDeal);
                                    System.out.println("Special deal added successfully.");

                                } else if (dealChoice == 3) {
                                    //remove deals

                                    System.out.print("Enter the serial number of the special deal you want to remove: ");
                                    int dealSerialNumber = scanner.nextInt();

                                    SpecialDeals dealToRemove = null;
                                    for (SpecialDeals deal : specialDeals) {
                                        if (deal.getSerialNumber() == dealSerialNumber) {
                                            dealToRemove = deal;
                                            break;
                                        }
                                    }

                                    if (dealToRemove != null) {
                                        specialDeals.remove(dealToRemove);
                                        System.out.println("Special deal has been removed.");
                                    } else {
                                        System.out.println("No special deal found.");
                                    }
                                } else if (dealChoice == 4) {
                                    System.out.println("Exit");
                                    break;
                                } else {
                                    System.out.println("Invalid input");
                                }
                            }
                        } else if (admin_menu == 6) {

                            System.out.println("Visitor Statistics: ");
                            int totalVisitors = 0;
                            int totalRevenue = 0;
                            int maxTickets = 0;
                            String attractionWithMaxTickets = null;

                            for (Attraction att : attractions) {
                                if (att.getNoOfTickets()!=0) {
                                    totalVisitors+= att.getNoOfTickets();
                                    totalRevenue = att.getNoOfTickets()*att.getTicket_price();
                                }
                            }

                            for (Attraction attraction : attractions) {
                                if (attraction.getNoOfTickets() > maxTickets) {
                                    maxTickets = attraction.getNoOfTickets();
                                    attractionWithMaxTickets = attraction.getName();
                                }
                            }

                            System.out.println("Total visitors :"+ totalVisitors);
                            System.out.println("Total revenue :"+totalRevenue);
                            System.out.println("Most popular attraction: "+attractionWithMaxTickets);

                        } else if (admin_menu == 7) {
                            System.out.println("Feedback: ");
                            for (String feedback : feedbacks) {
                                System.out.println(feedback + "\n");
                            }
                        } else if (admin_menu == 8) {
                            break;
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                } else {
                    System.out.println("Admin login credentials are incorrect.");
                }
            } else if (choice == 2) {

                List<Discount> validDiscounts = new ArrayList<>();

                boolean visitorLoggedIn = false;
                Visitor loggedInVisitor = null;

                while (!visitorLoggedIn) {

                    System.out.println("Visitor: ");
                    System.out.println("1. Login");
                    System.out.println("2. Register");
                    System.out.println("3. Exit");

                    System.out.print("Enter your choice: ");
                    int visitorChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (visitorChoice == 1) {
                        System.out.println("Enter your email: ");
                        String email = scanner.next();
                        System.out.println("Enter your password: ");
                        String password = scanner.next();

                        for (Visitor visitor : visitors) {
                            if (visitor.getEmail().equals(email) && visitor.getPassword().equals(password)) {
                                visitorLoggedIn = true;
                                loggedInVisitor = visitor;
                                System.out.println("Logged in as: " + visitor.getName());
                                break;
                            }
                        }

                        for (Discount discount : discounts) {
                            if (discount.getLessGreat().equals("<") && loggedInVisitor.getAge() < discount.getAge()) {
                                validDiscounts.add(discount);
                            } else if (discount.getLessGreat().equals(">") && loggedInVisitor.getAge() > discount.getAge()) {
                                validDiscounts.add(discount);
                            }
                        }

                        if (!visitorLoggedIn) {
                            System.out.println("Invalid email or password. Please try again.");
                        }

                    } else if(visitorChoice==2){
                        System.out.println("Register");
                        Visitor newVisitor = new Visitor();
                        newVisitor.inputDetails();
                        visitors.add(newVisitor);
                        System.out.println("You have been registered.");
                    } else if(visitorChoice==3){
                        System.out.println("Exit");
                        break;
                    } else{
                        System.out.println("Invalid choice");
                    }

                    while (visitorLoggedIn) {
                        System.out.println("Visitor Menu: ");
                        System.out.println("1. Explore the zoo");
                        System.out.println("2. Buy Membership");
                        System.out.println("3. Buy Tickets");
                        System.out.println("4. View Discounts");
                        System.out.println("5. View Special Deals");
                        System.out.println("6. Visit Animals");
                        System.out.println("7. Visit Attractions");
                        System.out.println("8. Leave Feedback");
                        System.out.println("9. Log Out");

                        System.out.print("Enter your choice: ");
                        int visMenuChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (visMenuChoice == 1) {
                            while(true){
                                System.out.println("Explore the Zoo:\n" +
                                        "1. View Attractions\n" +
                                        "2. View Animals\n" +
                                        "3. Exit\n\n");
                                System.out.println("Enter your choice: ");
                                int exploreChoice = scanner.nextInt();
                                if(exploreChoice==1) {

                                    System.out.println("Attractions:");
                                    for (Attraction attraction : attractions) {
                                        System.out.println(attraction.getUnique_id() + ". " + attraction.getName());
                                    }

                                    System.out.print("Enter the serial number of the attraction to view its description: ");
                                    int attDescChoice = scanner.nextInt();

                                    Attraction selectedAttraction = null;
                                    for (Attraction attraction : attractions) {
                                        if (attraction.getUnique_id() == attDescChoice) {
                                            selectedAttraction = attraction;
                                            break;
                                        }
                                    }

                                    if (selectedAttraction != null) {
                                        System.out.println("Attraction Description: " + selectedAttraction.getAttractionDescription());
                                    } else {
                                        System.out.println("Invalid choice. No attraction found with the given serial number.");
                                    }

                                }else if(exploreChoice==2){
                                    System.out.println("View Animals: ");
                                    for (Animal animal : zoo.getAnimals()) {
                                        System.out.println(animal.getName());
                                    }
                                }else if(exploreChoice==3){
                                    System.out.println("Exit");
                                    break;
                                }else{
                                    System.out.println("Invalid choice");
                                }
                            }
                        } else if (visMenuChoice == 2) {
                            System.out.println("Buy Membership");
                            System.out.println("1. Basic Membership(Rs 20)");
                            System.out.println("2. Premium Membership(Rs 50)");
                            System.out.print("Enter your choice: ");
                            int membershipChoice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Discounts you are applicable for:");
                            for (Discount discount : validDiscounts) {
                                System.out.println(discount.getDiscountCode() + " - " + discount.getDiscountRate() + "%");
                            }

                            System.out.println("Enter discount codes : (space - separated) ");
                            String discountCodesInput = scanner.nextLine();
                            String[] discountCodes = discountCodesInput.split(" ");

                            int totalRate = 0;

                            for (String code : discountCodes) {
                                for (Discount discount : validDiscounts) {
                                    if (code.trim().equalsIgnoreCase(discount.getDiscountCode())) {
                                        totalRate += discount.getDiscountRate();
                                        break;
                                    }
                                }
                            }

                            double discountedPriceBasic = 20 - (20.0 * totalRate/100);
                            double discountedPricePremium = 50 - (50 * totalRate/100);

                            if (membershipChoice == 1) {
                                // Calculate the discounted price
                                if (loggedInVisitor.getBalance() < discountedPriceBasic) {
                                    System.out.println("Insufficient balance to buy a Basic Membership with discounts.");
                                } else {
                                    loggedInVisitor.setMemLevel("Basic");
                                    int newBalance = (int) (loggedInVisitor.getBalance() - discountedPriceBasic);
                                    loggedInVisitor.setBalance(newBalance);
                                    System.out.println("You have successfully bought a Basic Membership. Your new balance is "+newBalance);
                                }
                            } else if (membershipChoice == 2) {
                                if (loggedInVisitor.getBalance() < discountedPricePremium) {
                                    System.out.println("Insufficient balance to buy a Premium Membership.");
                                } else {
                                    loggedInVisitor.setMemLevel("Premium");
                                    int newBalance = (int) (loggedInVisitor.getBalance() - discountedPricePremium);
                                    loggedInVisitor.setBalance(newBalance);
                                    System.out.println("You have successfully bought a Premium Membership. You new balance is "+ newBalance);
                                }
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        } else if (visMenuChoice == 3) {
                            //buy tickets

                            if (loggedInVisitor.getMemLevel().equals("Premium")) {

                                System.out.println("You are a premium member; you don't need to buy tickets.");

                            } else if (loggedInVisitor.getMemLevel().equals("Basic")) {

                                System.out.println("Available deals :");
                                for (SpecialDeals specialDeal : specialDeals) {
                                    specialDeal.displaySpecialDeals();
                                }

                                System.out.println("Available attractions: ");
                                for (Attraction attraction : attractions) {
                                    if (attraction.isOpen_close()) {
                                        System.out.println(attraction.getUnique_id() + " " + attraction.getName());
                                    }
                                }

                                System.out.print("Enter the attraction UIDs you want to buy tickets to (space-separated): ");
                                String ticketChoiceInput = scanner.nextLine();
                                String[] ticketChoices = ticketChoiceInput.split(",");
                                int totalTicketPrice = 0;
                                boolean validAttraction = true;
                                int attractionCount = 0;

                                for (String ticketchoice : ticketChoices) {
                                    int ticketChoice = Integer.parseInt(ticketchoice);
                                    boolean attractionFound = false;

                                    for (Attraction att : attractions) {
                                        if (ticketChoice == att.getUnique_id()) {
                                            attractionFound = true;
                                            att.setNoOfTickets(att.getNoOfTickets() + 1);
                                            totalTicketPrice += att.getTicket_price();
                                            attractionCount++;
                                            break;
                                        }
                                    }

                                    if (!attractionFound) {
                                        System.out.println("Invalid attraction choice: " + ticketChoice);
                                        validAttraction = false;
                                        break;
                                    }
                                }

                                SpecialDeals maxSpecialDeal = null;
                                for (SpecialDeals specialDeal : specialDeals) {
                                    if (attractionCount >= specialDeal.getNoOfAttractions()) {
                                        if (maxSpecialDeal == null || specialDeal.getDiscountRate() > maxSpecialDeal.getDiscountRate()) {
                                            maxSpecialDeal = specialDeal;
                                        }
                                    }
                                }

                                int dealRate = 0;

                                if (maxSpecialDeal != null) {
                                    System.out.println("You qualify for the " + maxSpecialDeal.getDiscountRate() + " special deal.");
                                    dealRate += maxSpecialDeal.getDiscountRate();
                                }

                                System.out.println("Discounts applicable :");
                                for (Discount discount : validDiscounts) {
                                    System.out.println(discount.getDiscountCode() + " - " + discount.getDiscountRate() + "%");
                                }

                                System.out.println("Enter discount codes : (space - separated) ");
                                String discountCodesInput = scanner.nextLine();
                                String[] discountCodes = discountCodesInput.split(" ");

                                int totalRate = 0;

                                for (String code : discountCodes) {
                                    for (Discount discount : validDiscounts) {
                                        if (code.trim().equalsIgnoreCase(discount.getDiscountCode())) {
                                            totalRate += discount.getDiscountRate();
                                            break;
                                        }
                                    }
                                }

                                totalRate+= dealRate;

                                System.out.println("Total price : ");
                                System.out.println(totalTicketPrice-(totalTicketPrice*totalRate/100));
                                int newBalance = loggedInVisitor.getBalance() - (totalTicketPrice-(totalTicketPrice*totalRate/100));
                                System.out.println("Your new balance is "+ newBalance);
                                loggedInVisitor.setBalance(newBalance);
                                loggedInVisitor.setNoOfAttractions(attractionCount);


                                if (!validAttraction) {
                                    System.out.println("Invalid attraction choice.");
                                }
                            } else {
                                System.out.println("Please buy a membership first.");
                            }
                        } else if (visMenuChoice == 4) {
                            System.out.println("Discounts:");
                            for (Discount discount : discounts) {
                                discount.displayDiscount();
                            }
                        } else if (visMenuChoice == 5) {
                            System.out.println("Special Deals:");
                            for (SpecialDeals specialDeal : specialDeals) {
                                specialDeal.displaySpecialDeals();
                            }
                        } else if(visMenuChoice==6) {

                            System.out.println("View Animals: ");
                            for (Animal animal : zoo.getAnimals()) {
                                System.out.println(animal.getName());
                            }

                            while(true) {
                                System.out.println("Do you want to \n 1. Feed Animal \n 2. Read about animal ");
                                System.out.println("Enter you choice :");
                                int animalChoice = scanner.nextInt();
                                scanner.nextLine();

                                if (animalChoice == 1) {
                                    System.out.println("Enter name of animal you want to feed :");
                                    String animal = scanner.nextLine();

                                    for (Animal animal_1 : zoo.getAnimals()) {
                                        if(animal.equalsIgnoreCase(animal_1.getName())){
                                            System.out.println(animal_1.getSound());
                                        }

                                    }
                                    break;

                                } else if (animalChoice == 2) {
                                    if (animalChoice == 1) {
                                        System.out.println("Enter name of animal you want to read about :");
                                        String animal = scanner.nextLine();

                                        for (Animal animal_1 : zoo.getAnimals()) {
                                            if(animal.equalsIgnoreCase(animal_1.getName())){
                                                System.out.println(animal_1.getDescription());
                                            }

                                        }
                                        break;
                                    } else {
                                        System.out.println("Invalid choice");
                                    }
                                }
                            }
                        } else if(visMenuChoice==7){

                            System.out.println("Select an attraction to visit: ");
                            for (Attraction attraction : attractions) {
                                if (attraction.isOpen_close()) {
                                    System.out.println(attraction.getUnique_id() + " " + attraction.getName());
                                }
                            }

                            while(true){
                                System.out.println("Enter your choice :");
                                if(loggedInVisitor.getNoOfAttractions()==0 && loggedInVisitor.getMemLevel()=="Basic"){
                                    System.out.println("Please purchase tickets");
                                }else if(loggedInVisitor.getNoOfAttractions()==0 && loggedInVisitor.getMemLevel()=="Premium"){
                                    System.out.println("Enter your choice: ");
                                    int attChoice = scanner.nextInt();
                                    scanner.nextLine();
                                    for (Attraction attraction : attractions) {
                                        if (attraction.isOpen_close()) {
                                            if(attraction.getUnique_id()==attChoice){
                                                System.out.println("Thank you for visiting"+attraction.getName()+". Hope you enjoyed your visit.");
                                                break;
                                            }
                                        }
                                    }
                                }else if(loggedInVisitor.getNoOfAttractions()>0 && loggedInVisitor.getMemLevel()=="Basic"){
                                    System.out.println("Enter your choice: ");
                                    int attChoice = scanner.nextInt();
                                    scanner.nextLine();
                                    for (Attraction attraction : attractions) {
                                        if (attraction.isOpen_close()) {
                                            if(attraction.getUnique_id()==attChoice){
                                                System.out.println("You have used 1 ticket");
                                                System.out.println("You now have "+(loggedInVisitor.getNoOfAttractions()-1)+"tickets left");
                                                System.out.println("Thank you for visiting"+attraction.getName()+". Hope you enjoyed your visit.");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }



                        } else if (visMenuChoice == 8) {
                            System.out.print("Enter your feedback: ");
                            String feedback = scanner.nextLine();
                            loggedInVisitor.setFeedback(feedback);
                            feedbacks.add(feedback);
                            System.out.println("Thank you for your feedback!");
                        } else if (visMenuChoice == 9) {
                            System.out.println("Log Out");
                            visitorLoggedIn = false;
                        } else {
                            System.out.println("Invalid input");
                        }
                    }

                }
            } else if (choice == 3) {

                System.out.println("Special Deals:");
                for (SpecialDeals deal : specialDeals) {
                    deal.displaySpecialDeals();
                }
            } else if(choice== 4){

                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

