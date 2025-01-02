import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<User> users= new ArrayList<>();




    public static void add() {
        System.out.print("enter name: ");
        String name = input.next();
        System.out.print("enter AGE : ");
        int age = input.nextInt();
        System.out.print("enter N°CNIE : ");
        String CIN = input.next();
        System.out.print("enter EMAIL : ");
        String email = input.next();
        System.out.print("enter  PASSWORD : ");
        String motdepass = input.next();
        System.out.print("enter the role (Admin-worker-Client) : ");
        String rolname = input.next();
        Role role = new Role(rolname);
        users.add(new User(name,age, CIN, email, motdepass, role));

    }

    public static void display() {
        if (users.isEmpty()) {
            System.out.println("no users added yet !!");
        }
        for (int i =0;i<users.size();i++) {
            System.out.println(users.get(i));

        }
    }

    public static void delete() {
        System.out.print("enter the CNIE of the user you want to delete  : ");
        String CIN = input.next();
        boolean delete = false;
        for (int i=0;i<users.size();i++) {
            if (users.get(i).getCIN().equals(CIN)) {
                users.remove(i);
                System.out.println("user deleted successfully");
                delete = true;
                break;
            }
        }
        if (delete == false) {
            System.out.println("no user matches this N°CNIE ");
        }
    }

    public static void search() {
        System.out.print("Enter N°CNIE of the user you want to search for  : ");
        String CIN = input.next();
        boolean search = false;
        for (int i=0;i<users.size();i++) {
            if (users.get(i).getCIN().equals(CIN)) {
                System.out.println(i);
                search = true;
                break;
            }
        }
        if (search == false) {
            System.out.println("no user matches this N°CNIE ");
        }
    }

    public static void update() {
        System.out.print("Enter N°CNIE to update the user  : ");
        String CIN = input.next();
        boolean update = false;
        for (int i=0;i<users.size();i++) {
            if (users.get(i).getCIN().equals(CIN)) {
                int choice;
                do {
                    System.out.println(" ! what do you want to update ?");
                    System.out.println("1. name");
                    System.out.println("2. age");
                    System.out.println("3. email");
                    System.out.println("4. password");
                    System.out.println("5. Role");
                    System.out.println("6. Quit");
                    System.out.print("enter your choice : ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("udate the name : ");
                            users.get(i).setName(input.next());
                            break;
                        case 2:
                            System.out.print("update the Age : ");
                            users.get(i).setAge(input.nextInt());
                            break;
                        case 3:
                            System.out.print("update the Email : ");
                            users.get(i).setEmail(input.next());
                            break;
                        case 4:
                            System.out.print("update the password : ");
                            users.get(i).setPassword(input.next());
                            break;
                        case 5:
                            System.out.print("update the  Role : ");
                            users.get(i).setRole(new Role(input.next()));
                            break;
                        case 6:
                            System.out.println("operation passed successfully thank you !!");
                            break;
                        default:
                            System.out.println("invalid choice");

                    }
                    update = true;
                } while (choice != 6);
            }
        }
        if (update==false){
            System.out.println("no user matches this N°CNIE ");
        }
    }
}