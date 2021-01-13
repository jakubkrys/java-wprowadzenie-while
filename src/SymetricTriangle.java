public class SymetricTriangle {
    public static void main(String[] args) {

        int f = 1; // liczba gwiazdek w pierwszym i kolejnych wierszach
        int w = 0; // zmienna do wielokrotnego wywoływania pętli wewnętrznej "*"
        int x = 0;
        int n = 25; // liczba gwiazdek w ostatnim wierszu
        int z = 0; // zmienna do wielokrotnego powtarzania pętli zewnętrznej
        int s = ((n - 1) / 2);
        int d = 0; // zmienna do wielokrotnego wywoływania pętli wewnętrznej " "

        while (z < s) {
            while (d < s) {
                w = w;
                while (w < s) {
                    System.out.print(" ");
                    w++;
                }
                d++;
                w = d;
                x = 0;
                while (x < f) {
                    System.out.print("*");
                    x++;
                }
                f = f + 2;
                System.out.println();
                z++;
            }
        }
    }
}
