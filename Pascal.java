import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
        final int max_n = Integer.parseInt(args[0]);
        int[] past = new int[max_n + 1];
        int[] present = new int[max_n + 1];
        for (int n = 0; n < max_n; n++) {
            System.out.printf("%s", odsazeni(max_n - n));
            for (int i = 0; i < (n + 1); i++) {
                try {
                    present[i] = past[i - 1] + past[i];
                } catch (IndexOutOfBoundsException error) {
                    present[i] = 1;
                }
            }

            for (int i = 0; i < (n + 1); i++) {
                System.out.printf(" %2d ", present[i]);
            }

            System.out.println();

            past = Arrays.copyOf(present, max_n + 1 );
        }
    }

    private static String odsazeni(int mezery){
        final String mezera = "  ";         // Dve mezery
        String vystup = "";
        for (int i = 0; i < mezery; i++) {
            vystup += mezera;
        }
        return (vystup);
    }

}