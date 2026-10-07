import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int choice = 0;
        DAO dao = new DAO();
        Scanner sc = new Scanner(System.in);
        ItemManager im = new ItemManager(dao, sc);
        ClaimManager cm = new ClaimManager();
        do{
            System.out.println("-----Welcome to Lost & Found Platform------");
            System.out.println("1. User registration");
            System.out.println("2. Report missing item");
            System.out.println("3. Report found item");
            System.out.println("4. Claim a lost item");
            System.out.println("5. Admin Panel");
            System.out.println("6. Exit from the program");
            System.out.println("Enter your choice : 1-6");

            choice=sc.nextInt();

            switch (choice){
                case 1 :{
                    System.out.println("----Welcome to user registration----");
                    System.out.println("Enter your name:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter your phone number:");
                    String phNo = sc.nextLine();
                    System.out.println("Enter your email:");
                    String email = sc.nextLine();
                    User user = new User(name, phNo, email, "Student");
                    dao.addUser(user);
                    break;


                }
                case 2 :{
                    im.reportMissing();
                    break;

                }
                case 3:{
                    im.reportFound();
                    break;

                }
                case 4:{
                    cm.claim();
                    break;

                }
                case 5 : {
                    String pass = "gaurav@123";
                    System.out.println("Enter your password:");
                    String passsword = sc.nextLine();
                    if(pass.equals(passsword)){

                    }else{
                        System.out.println("Unauthorized access");
                        break;
                    }
                }
                case 6:{
                    System.out.println("Exiting......");
                    System.exit(0);
                }
            }
        }while(choice!=6);




    }
}