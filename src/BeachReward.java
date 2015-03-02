import javax.swing.*;

/**
 * Created by John on 3/2/2015.
 */
public class BeachReward {
    public ParkServices park;


    private boolean isReward;
    public BeachReward() {
        park = new ParkServices();
        isReward = false;
    }
    public void setIsReward() {
        if(park.getBeachVisits() >= 5){
            isReward = true;
        }else{
            isReward = false;
        }
    }
    public void reward(){
        setIsReward();
        if(isReward == true){
            park.setBeach();
        }
    }
}