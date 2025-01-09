public class task2_1_n17 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'g', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}
    };

    public static void main(String[] args) {
        printArray();

        for (int i = 1; i < chars.length - 1; i++) {
            for (int j = 1; j < chars[i].length - 1; j++) {
                chars[i][j] = '-';
            }
        }

        printArray();
    }

    private static void printArray() {
        for (char[] row : chars) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
