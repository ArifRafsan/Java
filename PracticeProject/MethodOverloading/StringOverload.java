package MethodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rafsan
 */
public class StringOverload {
    String add(String a,String b){
        return (a+b);
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String x, y;
        System.out.println("Please enter two values: ");
        x = br.readLine();
        y = br.readLine();
        
        StringOverload so = new StringOverload();
        System.out.println("Result of your two values:"+so.add(x, y));
    }
}
