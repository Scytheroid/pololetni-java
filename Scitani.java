class Scitani {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        for (int priklad = 0; priklad < 10; priklad++) {
            int soucet = rand.nextInt(21);
            int scitanec = rand.nextInt(soucet + 1);
            System.out.printf("%d + %d = %d\n", soucet - scitanec, scitanec, soucet);
        }
    }
}