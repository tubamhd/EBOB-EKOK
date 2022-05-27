import java.util.Scanner;

public class EBOB_EKOK {
    static void EBOB(){
        int ebob = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("1st Number:  ");
        int no1 = input.nextInt();
        System.out.println("2nd Number:  ");
        int no2 = input.nextInt();

        for(int i = 1; i < no1; i++)
        {
            if(no1 % i == 0 && no2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB:  " + ebob);

    }

    static void EKOK(){
        int ekok = 0;
        int max;
        Scanner input = new Scanner(System.in);
        System.out.println("1st Number:  ");
        int no1 = input.nextInt();
        System.out.println("2nd Number:  ");
        int no2 = input.nextInt();

        //Main Formula of EKOK
        max = no1 * no2;

        for(int i = max; i > 0; i--)
        {
            if(i % no1 == 0 && i % no2 == 0) {
                ekok = i;
            }
        }
        System.out.println("EKOK:  " + ekok);
    }

    static void menu(){
        System.out.println("Welcome!");
        System.out.println("Please Choose Operation => \n"
                + "1 - EBOB\n"
                + "2 - EKOK");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
        System.out.print("=>   ");
        int select = input.nextInt();
        switch (select){
            case 1:
                EBOB();
            case 2:
                EKOK();
            case 0:
                System.out.println("Error! Wrong Operation! Try Again...");
                menu();
        }

    }
}
