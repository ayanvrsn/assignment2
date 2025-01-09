import java.util.Scanner;

public class task2_1_n16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new char[height][];

        // Construct the pyramid
        for (int i = 0; i < height; i++) {
            array[i] = new char[2 * height - 1];
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        // Print the pyramid
        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
