import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] Numbers = {{8, 2, 5}, {5, 5, 3}, {7, 7, 2}, {8, 9, 10}, {7, 4, 3}, {7, 8, 9}};
        String[] rooms = {"Bathroom", "Kitchen", "Garden"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        System.out.print("\t"); // aligns the rooms with the numerical columns
        for (String room : rooms) {
            System.out.print(room + "\t");
        }
        System.out.println(); // Moves to next line after printing room headers


        for (int i = 0; i < Numbers.length; i++) {
            System.out.print(months[i] + "\t");

            for (int j = 0; j < Numbers[i].length; j++) {
                System.out.print(Numbers[i][j] + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}