public class Seq {

    public static void main(String[] args){
        int start = 1;
        int konec = start;
        int krok = 1;
        String separator = " ";
        int posun = 0;  // Posun argumentu kvuli pritomnosti flagu

        if (args[0].equals("-s")){
            separator = args[1];
            posun += 2;
        }

        switch (args.length - posun){
            // Vstup se zadanym koncem sekvence
            case 1:     konec = Integer.parseInt(args[posun]);
                        break;
            // Vstup se zadanym zacatkem a koncem sekvence
            case 2:     start = Integer.parseInt(args[posun]);
                        konec = Integer.parseInt(args[posun + 1]);
                        break;
            // Vstup se zadanym zacatkem, intervalem mezi prvky a koncem sekvence
            case 3:     start = Integer.parseInt(args[posun]);
                        krok = Integer.parseInt(args[posun + 1]);
                        konec = Integer.parseInt(args[posun + 2]);
                        break;
        }

        if (start < konec){
            sekvencePlus(start, konec, krok, separator);
        }
        if (start > konec){
            sekvenceMinus(start, konec, krok, separator);
        }

    }

    // Vypocet a vypis sekvence
    private static void sekvencePlus (int start, int konec, int krok, String separator){

        for (int prvek = start; prvek <= konec; prvek += krok) {
            System.out.print(prvek);
            System.out.print((prvek <= konec - 1) ? separator : "");
        }

        System.out.println();
    }

    private static void sekvenceMinus (int start, int konec, int krok, String separator){

        for (int prvek = start; prvek >= konec; prvek += krok) {
            System.out.print(prvek);
            System.out.print((prvek >= konec - 1) ? separator : "");
        }

        System.out.println();
    }

}
