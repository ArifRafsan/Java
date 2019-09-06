public class Main{
    public static void main(String []args){
        //1.create a byte variable and set it to any valid byte number
        //2.create a short variable and set it to any valid short number
        //3.create a int variable and set it to any valid int number
        //4.create a variable of type long, and make it equal to 
        // 50000 + 10 times the sum of the byte, plus the short plus the int 
        byte  byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (1000+10*(byteValue+shortValue+intValue));
        System.out.printl("longTotal = "+longTotal);
        System.out.printl("shortTotal = "+shortTotal);
    }
}