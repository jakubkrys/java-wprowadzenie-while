public class RectangularTriangle {
    public static void main(String[] args) {

        int n = 6;

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (j <= i) {
                    System.out.print("*");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}