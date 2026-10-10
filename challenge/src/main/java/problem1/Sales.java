package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sales people : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max_index = 0;
        int min_index = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i] > sales[max_index]){
                max_index = i;
            }
            if(sales[i] < sales[min_index]){
                min_index = i;
            }
        }
        double avg = sum / sales.length;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sale : " + avg);

        System.out.println("-- Salesperson " + (max_index + 1) + " had the highest sale with " + sales[max_index] + "$");
        System.out.println("-- Salesperson " + (min_index + 1) + " had the lowest sale with " + sales[min_index] + " $");

        System.out.print("===== Enter a value of sales : ");
        int amount = scan.nextInt();
        int exceded  = 0;
        System.out.println("\nThe sales that  exceded the amount are : ");
        for(int i = 0 ; i < sales.length ; i++){
            if(sales[i] > amount){
                System.out.println("Salesperson " + (i+1) + " " + sales[i]);
                exceded++;
            }
        }
        System.out.println("The number of Salespersons who excede the amount is : " + exceded);
    }
}