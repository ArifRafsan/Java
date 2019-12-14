
package Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ArifR
 */
public class Employee {
    int Reg_No, Rt1, Rt2, Rt3;
    String name;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void GetInput() throws Exception{
        System.out.println("Please enter employee details: Reg_No, name,Skills levels of java, Python, PHP");
        Reg_No = Integer.parseInt(br.readLine());
        name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }
    
    void display(){
        System.out.println("Your Reg_No is "+ Reg_No);
        System.out.println("Your name is "+ name);
        System.out.println("Your java skills is "+ Rt1);
        System.out.println("Your Pyhton skills is "+ Rt2);
        System.out.println("Your PHP is "+ Rt3);
    }
    
}
class Output extends Employee{
    int total;
    float average;
    
    void evaluate() throws Exception{
        GetInput();
        total = Rt1+ Rt2 + Rt3;
        average = (float) total/3;
    }
    
    void screenshow(){
        System.out.println("Overall rating is :"+ total);
        System.out.println("Your percentage is :"+ average);
    }
}

class Company{
    public static void main(String[] args) throws Exception {
        Output o = new Output();
        o.evaluate();
        o.screenshow();
    }
}