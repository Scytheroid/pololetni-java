import java.util.*;

public class CetnostCisel {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in).useDelimiter("\\s");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> occurrence = new ArrayList<>();

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
            if (!found) {
                numbers.add(nextNum);
                occurrence.add(1);
            }
        }

        sc.close();

        // Sorting by size
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (occurrence.get(i) < occurrence.get(i + 1)){

                    sorted = false;

                    int tempNum = numbers.get(i);
                    int tempOcc = occurrence.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, tempNum);
                    occurrence.set(i, occurrence.get(i + 1));
                    occurrence.set(i + 1, tempOcc);
                }
            }
        }



        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));
        }

    }

}
