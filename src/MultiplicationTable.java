public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 12;
        int[][] multi = new int[n][n];

        // wypełnienie
        int i = 0;
        while (i < multi.length) {
            int j = 0;
            while (j < multi[i].length) {
                multi[i][j] = (i+1)*(j+1);
                j++;
            }
            i++;
            System.out.println();
        }

        // wyświetlenie tablicy
        i = 0;
        while (i < multi.length) {
            int j = 0;
            while (j < multi[i].length) {
                System.out.print(multi[i][j]+"\t\t");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
