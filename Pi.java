import java.util.concurrent.TimeUnit;

public class Pi {
    final static int POLOMER = 10000;

    public static void main(String[] args)
            throws InterruptedException {

        int uvnitr = 0;
        int celkem = 0;
        double pi;
        java.util.Random rand = new java.util.Random();

        while(true) {
            int x = rand.nextInt(2 * POLOMER +1);
            int y = rand.nextInt(2 * POLOMER +1);

            celkem += 1;
            if (jeKruh(x, y))
                uvnitr += 1;
            pi = 4 * ((double) uvnitr / celkem);
            if (uvnitr % 10000 == 0)
                System.out.printf("%.6f\r", pi);
        }

    }

    private static boolean jeKruh(int x, int y) { // Zjistuje, zda je prvek uvnitr KRUHU
        return POLOMER*POLOMER >= (x - POLOMER)*(x - POLOMER) + (y - POLOMER)*(y - POLOMER);
    }

}
