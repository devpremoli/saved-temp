public class NoGenericClassExample {
    private int intValue;
    private String stringValue;
    private double doubleValue;

    public NoGenericClassExample(int intValue, String stringValue, double doubleValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.doubleValue = doubleValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public static void main(String[] args) {
        NoGenericClassExample example = new NoGenericClassExample(10, "Hello", 3.14);
        System.out.println("Int value: " + example.getIntValue());
        System.out.println("String value: " + example.getStringValue());
        System.out.println("Double value: " + example.getDoubleValue());
    }
}