package june07.encapsulation;

public class LoginMain {
    public static void main(String[] args) {
        LoginDemo loginDemo = new LoginDemo();
        loginDemo.userName = "user123";
        loginDemo.password = "pass123";
        loginDemo.loginUser(loginDemo.userName, loginDemo.password);
        loginDemo.loginUser("user","pass123");
        loginDemo.loginUser("user123","pass");
        loginDemo.userName = "user";
        loginDemo.password = "123";
        loginDemo.loginUser("user","123");
    }
}
