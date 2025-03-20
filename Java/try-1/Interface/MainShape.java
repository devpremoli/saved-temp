interface Relatable {
    int getArea();
    boolean isLargerThan(Relatable other);

}
class RectanglePlus implements Relatable {
    int length;
    int breadth;
    public RectanglePlus(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea() {
        return length * breadth;
    }
    public boolean isLargerThan(Relatable other) {
        return this.getArea() > other.getArea();
    }
}
class CirclePlus implements Relatable {
    int radius;
    public CirclePlus(int radius) {
        this.radius = radius;
    }
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
    public boolean isLargerThan(Relatable other) {
        return this.getArea() > other.getArea();
    }

}
public class MainShape {
    public static void main(String[] args) {
        RectanglePlus rect = new RectanglePlus(2, 3);
        CirclePlus circ = new CirclePlus(3);
        System.out.println(rect.getArea());
        System.out.println(circ.getArea());
        System.out.println(rect.isLargerThan(circ));
        System.out.println(circ.isLargerThan(rect));

        Relatable rectang = new RectanglePlus(2, 3);
        Relatable circl = new CirclePlus(3);
        System.out.println(rectang.getArea());
        System.out.println(circl.getArea());
        System.out.println(rectang.isLargerThan(circl));
        System.out.println(circl.isLargerThan(rectang));   
    }
}
