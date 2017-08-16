import java.util.Scanner;
/*
 * Brendan Howell
 * CSC-151
 * This project tracks the total sales over multiple products
 * for different salesmen through the use of a 
 * multi-dimensional array.
 * 
 */
public class TotalSales {

	public static void main(String[] args) {
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int employee;
		int product;
		
		// declare array
		double[][] productSales = new double[4][5];
	
		//Get sales data for array
		do 
		{
			System.out.println("Please enter sales person number (1-4) or -1 to exit: ");
			employee = input.nextInt();
			
			if (employee != -1){
			System.out.println("Enter a Product Number: ");
			product = input.nextInt();
			System.out.println("Enter a dollar value: ");
			productSales[employee - 1][product - 1] = input.nextDouble();
			}
			
		} while (employee != -1); // end while
		
		System.out.println("Sales Person\t Product 1\t Product 2\t "
				+ "Product 3\t Product 4\t Product 5\t Sales Person Totals");
		
		for (int row = 0; row < productSales.length; row++){
			System.out.print("Employee " + (row+1) + " \t");
			double total = 0;
			
			for (int col = 0; col < productSales[row].length; col++){
				total += productSales[row][col];
				System.out.printf("%.2f \t\t", productSales[row][col]);
			} // end for loop
			System.out.print(total);
			System.out.println();
			
		}  // end for
		
		System.out.println("______________________________________________________"
				+ "_________________________________________________");
		System.out.print("Product Totals \t");
		
		//total columns
		for (int col = 0; col < productSales[0].length; col++){
			double total = 0;
			for (int row = 0; row < productSales.length; row++)
				total += productSales[row][col];
			System.out.print(total + "\t\t");
		}

	}  //  End Main

}  //  End Class