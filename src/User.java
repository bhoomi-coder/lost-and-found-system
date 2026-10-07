public class User {
    private int userID;
    private String userName;
    private String phNo;
    private String email;
    private String role;

    public User(int userId, String userName, String phNo, String email, String role) {
        this.userID=userId;
        this.userName=userName;
        this.email=email;
        this.phNo=phNo;
        this.role=role;
    }
    public User(String userName, String phNo,
                String email, String role){
        this.userName=userName;
        this.phNo=phNo;
        this.email=email;
        this.role=role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
