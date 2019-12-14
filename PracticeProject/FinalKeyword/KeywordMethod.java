
package FinalKeyword;

/**
 *
 * @author Rafsan
 */
public class KeywordMethod {
    final void display(){
        System.out.println("This is final method");
    }
}

class Main extends KeywordMethod{
    public static void main(String[] args) {
        Main m = new Main();
        m.display();
    }
}
