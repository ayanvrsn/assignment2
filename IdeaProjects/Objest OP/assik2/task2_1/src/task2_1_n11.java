public class task2_1_n11 {
    public static int[][][][] multiArray = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}}};

    public static void main(String[] args) {
        for (int[][][] array3D : multiArray) {
            for (int[][] array2D : array3D) {
                for (int[] array1D : array2D) {
                    for (int value : array1D) {
                        System.out.print(value + " ");
                    }
                }
            }
        }
    }
}
