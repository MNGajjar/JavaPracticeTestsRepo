package june07.encapsulation;

public class LoginDemo {

    String userName;
    String password;

    public LoginDemo() {
    }

    public LoginDemo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void loginUser(String userName,String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equals(this.password)){
            System.out.println("Login Successful.!");
        }else {
            System.out.println("Invalid Credentials.!");
        }
    }
}
