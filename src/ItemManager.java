import com.mysql.cj.xdevapi.JsonParser;

import java.util.Scanner;

    public class ItemManager {
        private DAO dao;
        private Scanner sc;
        public ItemManager(){}
        public ItemManager(DAO dao, Scanner sc){
            this.dao=dao;
            this.sc=sc;
        }
        public void reportMissing(){

            System.out.println("---Report Missing Item---");
            System.out.println("Enter Item Name: ");
            sc.nextLine();
            String itemName = sc.nextLine();
            System.out.println("Enter Item Description or Proof of OwnerShip: ");
            String description = sc.nextLine();
            System.out.println("Enter Item Color :");
            String color = sc.nextLine();
            System.out.println("Enter Item Category :");
            String  category = sc.nextLine();
            System.out.println("Enter your user ID :");
            int userId = sc.nextInt();
            System.out.println("Enter Location of Item :");
            sc.nextLine();
            String location = sc.nextLine();
            LostItem lostItem = new LostItem( itemName, description, color, category, userId, location);
            dao.addItem(lostItem);
        }
        public void reportFound(){
            System.out.println("---Report Found Item---");
            System.out.println("Enter Item Name: ");
            sc.nextLine();
            String itemName = sc.nextLine();
            System.out.println("Enter Item Description or Proof of OwnerShip: ");
            String description = sc.nextLine();
            System.out.println("Enter Item Color :");
            String color = sc.nextLine();
            System.out.println("Enter Item Category :");
            String  category = sc.nextLine();
            System.out.println("Enter your user ID :");
            int userId = sc.nextInt();
            System.out.println("Enter Location of Item :");
            sc.nextLine();
            String location = sc.nextLine();
            FoundItem foundItem = new FoundItem( itemName, description, color,
                    category, userId, location);

            dao.addItem(foundItem);
        }




    }

