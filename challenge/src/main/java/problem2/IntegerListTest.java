package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.print("Enter the value to remove : ");
                int newVal = scan.nextInt();
                list.removeFirst(newVal);
                list.print();
                break;
            case 4 :
                System.out.print("Enter the value to remove : ");
                newVal = scan.nextInt();
                list.removeAll(newVal);
                list.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3:RemoveFirst appearence");
        System.out.println("4:Removing all appearences");
        System.out.print("\nEnter your choice: ");
    }
}
