public class ProductPrices {
    public static void main(String[] args) {

        double[] prices = {2.51,55.19,9.21,88.00};

        double sum = 0;
        int f = 0;
        while (f< prices.length){
            sum += prices [f];
            f++;
        }
        System.out.println(sum);
    }
}
