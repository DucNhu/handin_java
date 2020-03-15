public class liThuyetB2_14_03_20 {
    public static void main(String[] args) {
//        Printest
        printest();
//        Val
        val();
//        Circle
        circle();
//        Running
        runningNumber();
//        Arith
        ArithmeticTest();
//        Five
        fiveintegerSum();
    }
    public static void fiveintegerSum() {
        int nmbr1 = 11;
        int nmbr2 = 22;
        int nmbr3 = 33;
        int nmbr4 = 44;
        int nmbr5 = 55;
        int sum;
        sum = nmbr1 + nmbr2 + nmbr3 + nmbr4 + nmbr5;
        System.out.print(" The sum is " + sum + "\n");

    }
    public static void circle() {
        // Tinh area, cir hinh tron
        double radius, area, cir;
        final double pi = 3.14;
        radius = 1.2;
        area = radius * radius * pi;
        cir = 2.0 * radius * pi;
        System.out.println("the radius is " + area + "\n the area is " + area + "\n The circumference is " + cir);
        System.out.println(cir);
    }
    public static void ArithmeticTest() {
        int numer1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number2 + numer1;
        difference = numer1 - number2;
        product = numer1 * number2;
        quotient = numer1 / number2;
        remainder = numer1 % number2;

        System.out.println("The sum, diffe, product, quotient and remainder of ");
        System.out.println(numer1 + "and " + number2 + " are " + sum + ", " + difference + ", " + product + ", " + quotient + ", and " + remainder);
        ++numer1;
        --number2;
        System.out.println("number1 after increment is " + numer1);
        System.out.println("number2 after increment is " + number2);
        quotient = numer1 / number2;
        System.out.println("The new quotient of " + numer1 + " and" + number2 + " is" + quotient);

    }
    public static void runningNumber() {
        int lowerbound = 1;
        int upper = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number <= upper) {
            sum = sum + number;
            ++number;
        }
        System.out.println(("The sum from " + lowerbound + " to" + upper + " is " + sum));

    }
    public static void printest() {
        //        hinh a
        System.out.println("* * * * *\n * * * * *\n* * * * *\n * * * * *\n* * * * *\n");
//      hinh b
        for(int i=0; i<5;i++){
            System.out.println("");
            for(int y=0;y<5;y++){
                if(y==0 || y==4 || i==0 || i==4){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
        }
//      hinh c
        System.out.println("\n* * * * * *\n *       *\n  *     *\n   *   *\n     *\n");
//      hinh D
        System.out.println("    *\n * *  * *\n   * *\n  *  *\n *    *\n");
//        sheep

    }
    public static void val() {

//        Khai bao & sdung bien
        int number;
        number = 99;
        number = 88;
        number = number + 1;
        int su = 0;
        su = su + number;
        int num1 = 5, num2 = 6;
        double radiu = 1.5;
        String msg;
        msg = "Hello";
    }
}
