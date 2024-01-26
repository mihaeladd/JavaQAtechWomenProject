import java.util.Scanner;

public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        Double d = scan.nextDouble();
//        String s = scan.nextLine();
//
//
//        // Write your code here.
//        scan.close();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }

    //    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            int xLength = String.valueOf(x).length();
//            if (s1.length() <= 15 || xLength < 3){
//                int nrOfWhitespace = 15 - s1.length();
//                int nrOfZeros = 3 - xLength;
//                System.out.println(s1 + " ".repeat(nrOfWhitespace) + "0".repeat(nrOfZeros) + x );
//            }
//        }
//        System.out.println("================================");
//
//    }
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int currentNumber = 0;
            int firstNumber = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                if (j == 0){
                    firstNumber = (int) ( a + ((Math.pow(2,j)) * b));
                    currentNumber = firstNumber;
                } else
                currentNumber += (int) ( ((Math.pow(2,j)) * b));
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
        in.close();

    }
}
