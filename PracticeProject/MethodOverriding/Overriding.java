package MethodOverriding;

/**
 *
 * @author Rafsan
 */
class First {

    int x, y;

    First(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}

class Second extends First {

    int z;

    Second(int a, int b, int c) {
        super(a, b);
        z = c;
    }
    void display(){
        super.display();
        System.err.println("z:"+z);
    }

}

public class Overriding {
    public static void main(String[] args) {
        Second sc = new Second(100, 200, 300);
        sc.display();
    }
}
