public class Ch5_loop_dowhile_break {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            if (i == 2) {
                System.out.println("end loop");
                break;
            }
            i++;
        }
        while (i<5);

    }
}
