import javax.swing.*;

/**
 * Created by John on 3/2/2015.
 */
public class BeachReward {
    private ParkServices park;
    private MainGUI main;
    public boolean isReward;
    public BeachReward(){
        isReward = false;
        while(true) {
            if (park.getBeachVisits() > 10) {
                isReward = true;
            }
            if (isReward == true) {
                JButton free = new JButton();
                free.setBounds(0, 300, 245, 30);
                main.add(free);
                free.setVisible(true);


            }
        }
    }


}
