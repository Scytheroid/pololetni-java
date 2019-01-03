import java.util.*;

public class CetnostCisel {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> occurrence = new ArrayList<>();

        // Input processing
        while (sc.hasNextInt()) {
            int nextNum = sc.nextInt();
            int found = -1;
            for (int i = 0; i < numbers.size(); i++) {
                // If number is already in the list
                if (nextNum == numbers.get(i)){
                    occurrence.set(i, occurrence.get(i) + 1);
                    found = 1;
                    break;
                }
            }
            // If the number was absent
            if (found == -1) {
                numbers.add(nextNum);
                occurrence.add(1);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));
            System.out.printf("%d", occurrence.get(i));
            System.out.printf("\n");
        }

    }


}
