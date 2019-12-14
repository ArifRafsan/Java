
package StaticVariable;

/**
 *
 * @author ArifR
 */
public class Employee {
    int Reg_No;
    String name;
    static String company = "DSI";

    Employee(int a, String b) {
        Reg_No = a;
        name = b;
    }
    
    void display(){
        System.out.println("Your details are: " + Reg_No + " "+ name + " "+ company);
    }
    
    public static void main(String[] args) {
        Employee em = new Employee(101, "Arif");
        em.display();
    }
}
