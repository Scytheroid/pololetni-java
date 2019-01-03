import java.util.*;

public class CetnostCisel {
    public static void main(String[] args) {

        String s = "2 3 3 2 6 5";
        java.util.Scanner vstup = new java.util.Scanner(s).useDelimiter("\\s");
        List<Integer> cisla = new ArrayList<>();
        List<Integer> cetnosti = new ArrayList<>();


        // Postupne cti jednotliva cisla na vstupu
        cteniVstupu:
        while (vstup.hasNextInt()) {
            int dalsiCislo = vstup.nextInt();
            // Pokud jiz cislo nekde v listu je, zvys jeho cetnost o 1
            for (int i = 0; i < cisla.size(); i++) {
                if (dalsiCislo == cisla.get(i)) {
                    cetnosti.set(i, cetnosti.get(i) + 1);
                    // Pokud jiz cislo v listu bylo a zvysili jsme jeho cetnost,
                    // muzeme zbytek while cyklu preskocit a pokracovat s dalsim cislem na vstupu
                    continue cteniVstupu;
                }
            }

            // Pokud zatim cislo v listu nebylo,
            // pridej ho na konec listu a nastav jeho cetnost na 1
            cisla.add(dalsiCislo);
            cetnosti.add(1);
        }

        for (int i = 0; i < cisla.size(); i++) {
            System.out.printf("%d ", cisla.get(i));
            System.out.printf("%d", cetnosti.get(i));
            System.out.printf("\n");
        }
    }

        /*
        // Input processing
        while (sc.hasNextInt()) {
            int nextNum = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < numbers.size(); i++) {
                // If number is already in the list
                if (nextNum == numbers.get(i)){
                    occurrence.set(i, occurrence.get(i) + 1);
                    found = true;
                    break;
                }
            }
            // If the number was absent
            if (found) {
                numbers.add(nextNum);
                occurrence.add(1);
            }
        }

        sc.close();
*/
/*

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));
            System.out.printf("%d", occurrence.get(i));
            System.out.printf("\n");
        }

    }

*/
}
