import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===========Menu==========:");
            System.out.println("1.======= Add User =========");
            System.out.println("2.======= display users=====");
            System.out.println("3.======= delete user=======");
            System.out.println("4.======= search for a user=");
            System.out.println("5.======= update user=======");
            System.out.println("0.======= Quit==============");
            System.out.print("enter your choice please : ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    GetiondeFonction.add();
                    break;
                case 2:
                    GetiondeFonction.display();
                    break;
                case 3:
                    GetiondeFonction.delete();
                    break;
                case 4:
                    GetiondeFonction.search();
                    break;
                case 5:
                    GetiondeFonction.update();
                    break;
                case 0:
                    System.out.println("thanks for your visit by (^-^)!!!!");
                    break;
                default:
                    System.out.println("invalid choice ");

            }
        }while (choice !=0 );

    }
}