
package PrintMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ArifR
 */
public class AddMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1[][] = new int [2][2];
        int num2[][] = new int [2][2];
        int num3[][] = new int [2][2];
        int x,y,z;
        
        System.out.println("Plese enter 1st integer values for matrix addition: ");
        
        for(x=0; x<2; x++){
            for(y=0; y<2; y++){
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for(x=0; x<num1.length; x++){
            for(y=0;y<2;y++){
                System.out.print(" "+num1[x][y]);
            }
            System.out.println();
        }
        
        System.out.println("Plese enter 2nd integer values for matrix addition: ");
        
        for(x=0; x<2; x++){
            for(y=0; y<2; y++){
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for(x=0; x<num2.length; x++){
            for(y=0;y<2;y++){
                System.out.print(" "+num2[x][y]);
            }
            System.out.println();
        }
        
        for(x=0;x<2;x++){
            for(y=0;y<2;y++){
                num3[x][y] = num1[x][y] + num2[x][y];
            }
        }
        System.out.println("Ths sum of the matrix is: ");
        for(x=0; x<2;x++){
            for(y=0;y<2;y++){
                System.out.print(" "+num3[x][y]);
            }
            System.out.println();
        }
    }
}
