public class Ch5_practice_1 {
    public static void main(String[] args) {
      //  System.out.println("****\n***\n**\n*");
        int n= 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
