import java.util.Scanner;
 
public class Matrix {
public static void main(String[] args) {
 
Scanner input = new Scanner(System.in);
char again;
 
do {
int[][] Matrix = new int[3][3];
int[] rowS = new int[3];
int[] colS = new int[3];
 
 
 
for (int row = 0; row < 3; row++) {
for (int col = 0; col < 3; col++) {
 
System.out.print("Input Number :");
Matrix[row][col] = input.nextInt();
 
rowS[row] += Matrix[row][col];
colS[col] += Matrix[row][col];
 
}
 
}
System.out.println("\nMatrix:");
{
System.out.println("Row Sum:");
 
 
for (int row = 0; row < 3; row++) {
System.out.print(rowS[row] + "\t");
}}
System.out.println("\n-------------------");
 
 
for (int row = 0; row < 3; row++) {
for (int col = 0; col < 3; col++) {
System.out.print(Matrix[row][col] + "\t");
}
System.out.println(" ");
}
 
System.out.println("---------------------");
System.out.println("Column Sum:");
 
for (int col = 0; col < 3; col++) {
System.out.print(colS[col] + "\t");
}
 
System.out.println("\n\nTry again? (Y/N): ");
again = input.next().charAt(0);
 
} while (again == 'Y' || again == 'y');
 
System.out.println("Program Has Been Terminated");
input.close();
}
}