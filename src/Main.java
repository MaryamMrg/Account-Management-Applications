import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    static ArrayList<Person> persons = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Role> roles = new ArrayList<>();

   public static void add_user(){

   }
   public static void search_for_user(){

   }
   public static void update_user(){}
   public static void delete_user(){}
   public static void display_all_users(){}

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int choice=0;
         while(choice !=6){
             System.out.println("====Account Management Applications=====");
             System.out.println("================ Menu ==================");
             System.out.println("========= 1.    Add User    ============");
             System.out.println("========= 2. search for User ===========");
             System.out.println("========= 3.  Update User   ============");
             System.out.println("========= 4.    Delete User ============");
             System.out.println("========= 5. Display All Users =========");
             System.out.println("========= 6.      Exit     =============");
             System.out.println("=========== by Maryam el ouadaa ========");
             System.out.println("=========== Enaa beni mellal ===========");
             System.out.println("please enter your choice (^-^) :");
       choice = sc.nextInt();
         if(choice==6){
             System.out.println("thanks for your visit by by (^-^):");
             break;
         }
      switch (choice){
             case 1:
                 add_user();
                 break;
             case 2:
                 search_for_user();
             case 3:
              update_user();
             case 4:
              delete_user();
             case 5:
              display_all_users();

              default:
                  System.out.println("invalid choice");
      }

         }

    }
}