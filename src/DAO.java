import javax.swing.text.html.HTMLDocument;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

    public class DAO {
        private String url ="jdbc:mysql://localhost:3306/l_f";
        private String userName ="root";
        private String password ="Bhoomika@123";

//    public DriverManager getConnection(){
//        return DriverManager.getConnection(url, userName, password);
//    }

        public void addUser(User user) {

            try{
                Connection conn = DriverManager.getConnection(url, userName, password);
                String query = "INSERT INTO user(userName, phNo, email, role) VALUES(?, ? ,?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, user.getUserName() );
                ps.setString(2, user.getPhNo());
                ps.setString(3, user.getEmail());
                ps.setString(4, user.getRole());
                ps.executeUpdate();
                System.out.println("User registered successfully!");
            }
            catch ( Exception e){
                System.out.println("User registration failed...");
                e.printStackTrace();
            }



        }

        public void addItem(Item item) {
            try{
                Connection conn = DriverManager.getConnection(url, userName, password);
                String query = "INSERT INTO item(itemName, description, color, category, " +
                        "userId, location) VALUES(?, ? ,?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, item.getItemName());
                ps.setString(2, item.getDes());
                ps.setString(3, item.getColor());
                ps.setString(4, item.getCategory());
                ps.setInt(5, item.getUserId());
                ps.setString(6, item.getLocation());
                ps.executeUpdate();




            }catch (Exception e){
                System.out.println("Item reporting failed....");
                e.printStackTrace();
            }
        }

        public void addClaim(Claim claim) {
            try{

                Connection conn = DriverManager.getConnection(url, userName, password);
                String query = "INSERT INTO claim(proof, userId, itemName, location, " +
                        "status) VALUES(?, ? ,?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, claim.getProof());
                ps.setInt(2, claim.getClaimedBy());
                ps.setString(3, claim.getItemName());
                ps.setString(4, claim.getLocation());
                ps.setString(5, claim.getStatus());
                ps.executeUpdate();
                System.out.println("Claim added successfully");



            }catch (Exception e){
                System.out.println("Failed to add claim.....");
                e.printStackTrace();
            }
        }


    }
