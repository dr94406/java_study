package src;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point5 {
    int x=10;
    int y=20;

    Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point5 {
    int z = 30;
    Point3D2() {
        this(100,200,300); // Poind3D(int x, int y, int z)를 호출한다.
    }

    Point3D2(int x, int y, int z) {
    super(x, y);        // Point(int x, int y)를 호출한다.
    this.z = z;
    }
}
