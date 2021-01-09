public class TikTak {
    public static void main(String[] args) {

        int a = 427;
        int b = 529;
        int[] table = new int[b - a + 1];

        // Przypisanie wartości
        int i = 0;
        while (i < table.length) {
            table[i] = (a + i);
            i++;
        }

        // Wyświetlenie
        i = 0;
        while (i < table.length) {
            if (table[i] % 3 == 0 && table[i] % 5 == 0) {
                System.out.println(table[i]+" TikTak "+"|");
            } else {
                if (table[i] % 5 == 0){
                    System.out.println(table[i]+" Tak "+"|");
                } else {
                    if (table[i] % 3 == 0){
                        System.out.println(table[i]+ " Tik "+"|");
                    } else {
                        System.out.print("");
                    }
                }
            }
            i++;
        }
    }
}
