package CoffeeCardStuff;

/**
 * Created by John on 3/2/2015.
 */
public class BeachReward {

    //public ParkServices park;
    private boolean isReward = false;

    //when called this sets variables to default values
    public BeachReward() {
        //park = new ParkServices();
        //isReward = false;
    }

    //when calleed this is supposed set isReward to true if beach visits is greater the 5
    public void setIsReward() {
        if (Variables.park.getBeachVisits() > 5) {
            isReward = true;
        } else if(Variables.park.getBeachVisits() < 5){
            isReward = false;
        }
    }

    //if isReward is equal to true then button works for adding visit
    public void reward() {
        setIsReward();
        if (isReward == true) {
            Variables.park.setBeach();
        }
    }

    public boolean getIsRewar() {
        return isReward;
    }
}