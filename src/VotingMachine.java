/**
 * Created by Михаил on 27.11.2016.
 */
public class VotingMachine {

    private int democratCount;
    private int republicCount;

    public VotingMachine() {
        democratCount = 0;
        republicCount = 0;
    }

    public void clearMachine() {
        democratCount = 0;
        republicCount = 0;
    }

    public void voteDemocrat() {
        democratCount++;
    }

    public void voteRepublican() {
        republicCount++;
    }

    public int getDemVotes() {
        return democratCount;
    }

    public int getRepVotes() {
        return republicCount;
    }
}
