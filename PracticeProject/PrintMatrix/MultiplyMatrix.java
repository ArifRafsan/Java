
package PrintMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ArifR
 */
public class MultiplyMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1[][] = new int [4][4];
        int num2[][] = new int [4][4];
        int num3[][] = new int [4][4];
        
        int x,y,z;
        System.out.println("Please enter first matrix");
        for(x=0;x<4;x++){
            for(y=0;y<4;y++){
                 num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for(x=0;x<num1.length;x++){
            for(y=0;y<4;y++){
                 System.out.println(" "+num1[x][y]);
            }
            System.out.println();
        }
        
        System.out.println("Please enter second matrix");
        for(x=0;x<4;x++){
            for(y=0;y<4;y++){
                 num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for(x=0;x<num2.length;x++){
            for(y=0;y<4;y++){
                 System.out.println(" "+num2[x][y]);
            }
            System.out.println();
        }
        
        System.out.println("The result of your multiplication is: ");
        
        for(x=0;x<4;x++){
            for(y=0;y<4;y++){
                 num3[x][y]=0;
                 for(z=0;z<4;z++){
                     num3[x][y] = num3[x][y] + (num1[x][z] * num2[z][y]);
                 }
            }
        }
        for(x=0;x<4;x++){
            for(y=0;y<4;y++){
                 System.out.println(" "+num3[x][y]);
            }
            System.out.println();
        }
    }
}
