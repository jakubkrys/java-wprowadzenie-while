public class NumbersTable {
    public static void main(String[] args) {

        int[][] numbers = {{1,2,3,},{4,5},{6}};

        int i = 0;
        while (i < numbers.length) {
            int j = 0;
            while (j < numbers[i].length) {
                System.out.print(numbers[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;

        }


    }
}
