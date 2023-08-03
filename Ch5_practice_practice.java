public class Ch5_practice_practice {
    public static void main(String[] args) {

        int n = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n", n, i, n * i);
        }
        System.out.println("Table of 7");
        int num=6;
        for(int j=1; j<=10; j++){
            System.out.println(num + " X " + j  + " = " + num*j);
        }
        System.out.println("Table of 6 Reverse Order");
        int num1=10;
        for(int j=10; j>=1; j--) {
            System.out.println(num1 + " X " + j + " = " + num1 * j);
        }

    }

}


