public class Elipsa {
    public static void main(String[] args) {   // Kresli elipsu, zpracovava argumenty
        int sirka = Integer.parseInt(args[0]);
        int vyska = Integer.parseInt(args[1]);
        
        for (int y = 1; y < 2*vyska; y++) {
            for (int x = 1; x < 2*sirka; x++) {
                if (jeElipsa(y, x, vyska, sirka)) {
                    System.out.printf("X");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
    

    public static boolean jeElipsa(int y, int x, int vyska, int sirka) { // Zjistuje, zda je prvek uvnitr elipsy
        double hrana =
        ( 
                    ((y - vyska) / (double)(vyska)) * ((y - vyska) / (double)(vyska))
                  + ((x - sirka) / (double)(sirka)) * ((x - sirka) / (double)(sirka))
        );

        return hrana <= 1;
    }
}