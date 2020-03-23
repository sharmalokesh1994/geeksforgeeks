package lok.ac.in.dataStructure.old_concepts.IndianOlyTeam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lokesh Sharma on 25-05-2019.
 */
public class Team<T>{

    List<T> player = new ArrayList<T>();

    public void addPlayer(T t){
        player.add(t);
    }

    public List<T> getPlayer(){
        return player;
    }

}
