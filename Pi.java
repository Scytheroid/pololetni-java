import java.util.concurrent.TimeUnit;

public class Pi {
    final static int POLOMER = 1000;

    public static void main(String[] args)
            throws InterruptedException {

        int uvnitr = 0;
        int vne = 0;
        double pi;
        java.util.Random rand = new java.util.Random();

        while(true) {
            int x = rand.nextInt(2 * POLOMER +1);
            int y = rand.nextInt(2 * POLOMER +1);
            if (jeKruh(x, y))
                uvnitr += 1;
            else
                vne += 1;
            pi = (double) uvnitr / vne;
            System.out.printf("%.6f\r", pi);
            Thread.sleep(50);
        }

    }

    private static boolean jeKruh(int y, int x) { // Zjistuje, zda je prvek uvnitr KRUHU
        return POLOMER*POLOMER >= (x - POLOMER)*(x - POLOMER) + (y - POLOMER)*(y - POLOMER);
    }

}
