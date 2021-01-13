public class RectangularTriangle {
    public static void main(String[] args) {


        int f = 1; // liczba gwiazdek w pierwszym i kolejnych wierszach
        int w = 0; // zmienna do wielokrotnego wywoływania pętli wewnętrznej
        int n = 9; // liczba gwiazdek w ostatnim wierszu
        int z = 0; // zmienna do wielokrotnego powtarzania pętli zewnętrznej


        while(z < ((n+1)/2)) {
            w = 0;
            while (w < f) {
                System.out.print("*");
                w++;
            }
            f = f + 2;
            System.out.println();
            z++;
        }
    }
}
