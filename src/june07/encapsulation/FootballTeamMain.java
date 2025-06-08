package june07.encapsulation;

public class FootballTeamMain {
    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam("Ronaldo","Ronaldo1@yahoo.com","ronaldo111",430000.34);
        footballTeam.loginPlayer("ronaldo101","ronaldo111");

        footballTeam.setPlayerPassword("ronaldo101");
        System.out.println(footballTeam.getPlayerUserName());
        System.out.println(footballTeam.getPlayerEmail());
    }
}
