
package FinalKeyword;

/**
 *
 * @author ArifR
 */
class First{
    int x;
    public First(int x){
        this.x = x;
    }
    
    protected void finalize() throws Throwable{
        System.out.println("Welcome to finalize in Java Programming "+ x);
    }
}

public class FinalizeKeyword {
    public static void main(String[] args) {
        First f1 = new First(100);
        First f2 = new First(200);
        
        f1 = f2;
        
        System.gc();
        System.out.println("Hello World");
    }
}
