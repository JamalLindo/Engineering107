class Fibonacci {
    static int firstNum = 0;
    static int secondNum = 1;
    static int thirdNum = 0;

    public static void main(String[] args) {
        int count = 10;
        printFib(count);
    }

    public static void printFib(int count){
        if(count > 0){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;

            System.out.println(""+thirdNum);
            printFib(count-1);
        }

    }

}