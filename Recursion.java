 public  class Recursion {
     String Source;
     String Helper;
     String Destination;
     public int n;

     Recursion(int n, String source, String helper, String destination) {
         Source = source;
         Helper = helper;
         Destination = destination;
         this.n= n;

         towerOfHanoi(this.n, Source, Helper, Destination);
     }

     public static void towerOfHanoi(int n, String source, String helper, String destination) {

         if (n == 1) {
             System.out.println("Disk is moved from " + source + " to " + destination);
             return;
         }
         towerOfHanoi(n - 1, source, destination, helper);
         System.out.println("Disk is moved from " + source + " to " + destination);
         towerOfHanoi(n - 1, helper, source, destination);

     }

     public static void main(String[] args) {

         int n = 3;
         System.out.println("using Constructor");
         System.out.println();
         Recursion t1 = new Recursion(n, "S", "H", "D");//Using Constructor
         System.out.println("***********************************************************");
         System.out.println();
         System.out.println("function");
         towerOfHanoi(n, "S", "H", "D");//Directly Passing to Function
         Sampel s1 = new Sampel();
         s1.creatTowerOfHanoi();
//        System.out.println("*************************************************************");
//        System.out.println("Using another clas");
//        System.out.println();
//        s1.creatTowerOfHanoi();
     }
          class Sampel {
             public void creatTowerOfHanoi() {
                 System.out.println();

                 System.out.println("Using another class from a class");
                 Recursion r2 = new Recursion(3, "S", "H", "D");
                 n = 10;
                 System.out.println(n);

             }

         }

}





 //why Cant we create Two public class seperate?
 //difference between public void <funName>  & void <funName>
 //why we should make Sample class static to resolve this error ['Recursion.this' cannot be referenced from a static context]
//