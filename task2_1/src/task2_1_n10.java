import java.util.Scanner;

public class task2_1_n10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }

        // Display the structure
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[] ");
            }
            System.out.println();
        }
    }
}
