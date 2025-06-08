package june07.encapsulation;

public class FootballTeam {

    private String playerEmail;
    private String playerPassword;
    private String playerUserName;
    private double playerSalary;

    public String getPlayerUserName() {
        return playerUserName;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public FootballTeam(String playerUserName, String playerEmail, String playerPassword, double playerSalary) {
        this.playerUserName = playerUserName;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.playerSalary = playerSalary;
    }

    public void loginPlayer(String playerUserName,String playerPassword){
        if(playerUserName.equalsIgnoreCase(this.playerUserName) && playerPassword.equals(this.playerPassword)){
            System.out.println("Login Successful.!");
        }else{
            System.out.println("Check your credentials.!");
        }
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "playerUserName='" + playerUserName + '\'' +
                ", playerEmail='" + playerEmail + '\'' +
                '}';
    }
}
