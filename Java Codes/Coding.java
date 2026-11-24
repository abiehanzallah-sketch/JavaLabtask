
import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
/// this is where array and scanner and their named variable
        Scanner input = new Scanner(System.in);

        int[][][] section = new int[2][3][3];
         
/// this is the subject and it is the col
        String[] subjects = {"Java", "Database", "Networking"};


/// this is the set it is the 2 or the section of the room
        for (int set = 0; set < section.length; set++) {

            System.out.println("\nSection " + (set + 1));
            System.out.println("---------------------");


/// the for loop for row or the students
            for (int row = 0; row < section[set].length; row++) {
                System.out.println("");
                System.out.println("\nStudent " + (row + 1));
              
                int total = 0;
                

/// the for loop for col or the subjects
                for (int col = 0; col < section[set][row].length; col++) {

                    System.out.print(subjects[col] + " score: ");
/// the input of the program or a code that makes you able to put a number you want
                    section[set][row][col] = input.nextInt();

                    total += section[set][row][col];
                }
                
/// average per students
                double average = (double) total / 3;
                
                System.out.printf("Average: %.2f", average);
                System.out.println("");
            }
        }

        input.close();
    }
}


//Fixed the decimal point of average to 2 decimal only