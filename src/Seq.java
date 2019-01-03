public class Seq {

    public static void main(String[] args){
        int start = 1;
        int konec = 0;
        int krok = 1;
        String separator = " ";
        int posun = 0;  // Posun argumentu kvuli pritomnosti flagu

        if (args[0].equals("-s"))
            separator = args[1];
            posun += 2;

        switch (args.length - posun){

            case 1:     konec = Integer.parseInt(args[posun]);
                        break;

            case 2:     start = Integer.parseInt(args[posun]);
                        konec = Integer.parseInt(args[posun + 1]);
                        break;

            case 3:     start = Integer.parseInt(args[posun]);
                        krok = Integer.parseInt(args[posun + 1]);
                        konec = Integer.parseInt(args[posun + 2]);
                        break;
        }

        sekvence(start, konec, krok, separator);

    }


    private static void sekvence (int start, int konec, int krok, String separator){

        System.out.println();

        for (int prvek = start; prvek <= konec; prvek += krok) {
            System.out.print(prvek);
            System.out.print((prvek <= konec - 1) ? separator : "");
        }

        System.out.println();
    }

}
