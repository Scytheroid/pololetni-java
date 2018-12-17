public class pascaluvTrojuhelnik {
	public static void main(String[] args) {
		//System.out.printf("%d\n", kombinace(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		
		// System vystupu
        int max_n = Integer.parseInt(args[0]);
		for (int n = 0; n < max_n; n++) {
			for (int odsazeni = max_n; odsazeni > n; odsazeni--) {
				System.out.printf("  ");			// Dve mezery
			}
			for (int k = 0; k <= n; k++) {
				System.out.printf("%d ", kombinace(n, k));
			}
			System.out.printf("\n");
		}

	}

    public static int kombinace(int n, int k) {
        int result = 0;
        result = (faktorial(n) / (faktorial(k) * faktorial(n - k)));
		return (result);
    }
    
    public static int faktorial(int num) {
        if (num == 0) {
            return 1;
        }
        else {
            return (num * faktorial(num - 1));
        }

	}
}
