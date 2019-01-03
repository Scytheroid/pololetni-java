import java.util.*;

public class CetnostCisel {
    public static void main(String args[]) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Map<Integer,Integer> occurrence = new HashMap<Integer, Integer>();

        while (sc.hasNextInt()) {
            occurrence.compute(sc.nextInt());
        }

        System.out.println(occurrence);

        /*
        // A thing that makes stream from map, it sorts it and makes it a map again with deltas
        Map<Integer,Integer> sorted = cisla
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.printf("Sorted: " + sorted);
        */
    }


}
