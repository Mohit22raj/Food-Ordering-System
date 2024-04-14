
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class TestFoodOrder {
    public static void main(String[] args) {
        FoodOrder fo = new FoodOrder();

        fo.displayMenu();

        fo.order();
        // compile and test
    }

}

class FoodOrder {

    // declare our variables for prices of food items
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldrink = 80;
    int icedtea = 80;
    int ch;
    int quantity;
    String address;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    // create a method for displaying our food menu

    public void displayMenu() {
        System.out.println("**************** Tasty Foods ****************");
        System.out.println("=====================================================");
        System.out.println("           1.French Fries          100/-");
        System.out.println("           2.Burger                120/-");
        System.out.println("           3.Pastry                100/-");
        System.out.println("           4.Cold Drinks           80/- ");
        System.out.println("           5.Cold Coffee           100/-");
        System.out.println("           6.Pizza                 200/-");
        System.out.println("           7.Iced Tea              80/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }

    // create a method to order a food item
    // I'm using Switch case for this
    // Also introduced try catch block

    // A method to generate bill
    public void generateBill() {
        if (total > 0) {
            System.out.println("Enter Address ");
            address = sc.next();
            System.out.println();

            System.out.println("      Your Order will be Delivered on below Address");
            System.out.println("      Address : " + address);
        }
        System.out.println();

        System.out.println("***************** Thank you for ordering ******************");
        System.out.println("****************Your Bill is : " + total + "*****************");

    }

    public void order() {
        while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:// French Fries
                    System.out.println("You have Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * frenchFries;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:// Burger
                    System.out.println("You have Selected Burger");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * burger;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:// Pastry
                    System.out.println("You have Selected Pastry");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * pastry;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:// Cold Drinks
                    System.out.println("You have Selected Cold Drinks");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * coldrink;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:// Cold Coffee
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * coldCoffee;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:// Pizza
                    System.out.println("You have Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * pizza;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:// Iced Tea
                    System.out.println("You have Selected Iced Tea");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    try {
                        quantity = sc.nextInt();
                        if (quantity <= 0) {
                            throw new IllegalArgumentException(
                                    "Invalid quantity entered. Quantity should be greater than 0.");
                        }
                        total = total + quantity * icedtea;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 8:// Exit
                    generateBill();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option Selected");
            }
            System.out.println("Do you want to order anything else? (yes/no)");
            again = sc.next();
            if (again.equals("no")) {
                generateBill();
                break;
            }
        }
    }
}