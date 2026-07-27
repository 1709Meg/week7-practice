import java.util.Scanner;

public class ParseInts {
    // ****************************************************************
    // ParseInts.java
    //
    // Reads a line of text and prints the integers in the line.
    //

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanLine;
        String line;
        int val, sum = 0;

        line = scan.nextLine();
        scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}