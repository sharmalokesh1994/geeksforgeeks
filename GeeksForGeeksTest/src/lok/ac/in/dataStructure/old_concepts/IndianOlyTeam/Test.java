package lok.ac.in.dataStructure.old_concepts.IndianOlyTeam;

/**
 * Created by Lokesh Sharma on 25-05-2019.
 */
public class Test {

    public static void main(String[] args) {
        Team<FootballPlayer> footballTeam = new Team<>();
        Team<CricketPlayer> crTeam = new Team<>();


        footballTeam.addPlayer(new FootballPlayer("Shyam"));
        crTeam.addPlayer(new CricketPlayer("Ram"));



    }
}
