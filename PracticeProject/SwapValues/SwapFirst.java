package SwapValues;

/**
 *
 * @author Rafsan
 */
class SwapFirst {

    int num1, num2, value1, value2;

    SwapFirst(int value1, int value2) {
        num1 = value1;
        num2 = value2;
    }

}

class SwapSecond {
    void swap(SwapFirst temp){
        int output = temp.num1;
        temp.num1 = temp.num2;
        temp.num2 = output;
    }
}

class CallRef {

    public static void main(String[] args) {
        SwapFirst sf = new SwapFirst(10, 15);
        System.out.println("Before Swapping :"+sf.num1+ "\t"+sf.num2);
        SwapSecond ss = new SwapSecond();
        ss.swap(sf);
        System.out.println("After Swapping :"+sf.num1+ "\t"+sf.num2);
    }
}
