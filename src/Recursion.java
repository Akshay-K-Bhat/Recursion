public class Recursion {
    public static class SumOfN_Numbers {
        public static void printSum(int i, int num, int sum) {

            if (num == i) {
                sum += i;
                System.out.println(sum);
            } else {
                sum += i;
                printSum(i + 1, num, sum);

            }
        }
    }

    public static class PrintNumbers {
        public static void printNumbers(int initial, int num) {

            if (initial == num) {
                System.out.println(num);

            } else {
                System.out.print(initial + " ");
                printNumbers(initial + 1, num);
            }

        }

    }

    public static class Factorial {
        static int finalfact;

        public static int factorial(int num) {
            if (num == 0||num==1) {
                finalfact = 1;

            } else {
                finalfact = num * factorial(num - 1);

            }

            return finalfact;
        }
    }

    static class Fibinocci{
        int num;
        int a;
        int b;
        Fibinocci(int num) {
            this.num = num;
            this.a =0;
            this.b=1;
            System.out.println("0");
            System.out.println(1);
            fibinocci(a,b,num-2);
        }

        public static void fibinocci(int a,int b,int num){
            if(num==1){
                return;
            }
            int c =a+b;
            System.out.println(c);
            fibinocci(b,c,num-1);


        }
    }

    static class CalculatePower{
        CalculatePower(int x,int n){
            int result = calculatePower(x,n);
            System.out.println(result);
        }
         public int calculatePower(int x,int n){
            if (x==0){
                return 0;
            }
            if(n==0){
                return 1;
            }
            int xnm1 = calculatePower(x,n-1);
            int xpown=x*xnm1;
            return xpown;
        }
    }
static class CalculatePowerWithLowTimeComplexity {
    CalculatePowerWithLowTimeComplexity(int x, int n) {
        int result = calculatePower(x, n);
        System.out.println(result);
    }

    public int calculatePower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2);
        } else {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2) * x;
        }
        }
    }


        public static void main(String[] args) {
        SumOfN_Numbers sum1 = new SumOfN_Numbers();
        sum1.printSum(1,10,0);
        PrintNumbers printNum1 = new PrintNumbers();
        printNum1.printNumbers(10,20);
        Factorial fact1 = new Factorial();
        fact1.factorial(5);
        System.out.println(fact1.finalfact);
          new Fibinocci(8);
           CalculatePower c1 =new CalculatePower(2,15);
           CalculatePowerWithLowTimeComplexity c2 =new CalculatePowerWithLowTimeComplexity(2,15);


        }
    }

