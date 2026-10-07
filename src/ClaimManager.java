
    import java.util.Scanner;

    public class ClaimManager{
        private DAO dao;
        public ClaimManager(){}

        public void claim(){
            Scanner sc = new Scanner(System.in);
            System.out.println("---Welcome to claim manager---");
            System.out.println("Enter proof of ownership:");
            String proof = sc.nextLine();
            System.out.println("Enter your user ID:");
            int userId = sc.nextInt();
            System.out.println("Enter your item name:");
            sc.nextLine();
            String itemName=sc.nextLine();
            System.out.println("Enter location at the item was lost:");
            String location = sc.nextLine();
            Claim claim = new Claim(proof, userId,itemName, location, "Pending" );
            dao.addClaim(claim);


        }

    }

