
import java.util.Scanner;

public class task2_1_n7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                }
            }
        }

        for (String str : strings) {
            System.out.print(str + ", ");
        }
    }
}
