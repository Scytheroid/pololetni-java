public class Vlnovka {
    public static void main(String[] args){
        int vyska = Integer.parseInt(args[0]);
        int sirka = 37;
        int start = 0;
        for (int i = 0; i < vyska; i++){
            for(int j = 0; j <= sirka; j++){
                // Vypise '#' na vsech nabeznych a sbeznych diagonalach
                if (((j - i) % (2*vyska - 2) == 0) || ((j + i) % (2*vyska - 2) == 0)){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}