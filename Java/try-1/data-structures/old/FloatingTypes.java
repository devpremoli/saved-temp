class FloatingTypes {
    static float fA = 10.3f;
    static double dA = 10; // equivalent to 10.675d or 10.675D
    static double dB = 0.1 + 0.2;

    public static void main(String[] args) {
        System.out.println(fA);
        System.out.println(dA);
        System.out.println(dB);
    }
}