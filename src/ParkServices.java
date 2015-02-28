import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by John on 2/24/2015.
 */
public class ParkServices {

    public MainGUI main;
    public int beachVisits = 0;
    public int nationalVisits = 0;
    private double nationalPrice;
    private double forestPrice;
    public int forestVisits = 0;
    public int visits = 0;
    public double Money;
    private double beachPrice;
    public ParkServices(){
        beachPrice = 10;
        forestPrice = 5;
        nationalPrice = 30;
        Money = 40;

    }
    public void setForestVisits(){
        if(Money>= forestPrice){
            visits+=1;
            forestVisits +=1;
            Money = Money - forestPrice;
        }
    }
    public void setNationalVisits(){
        if(Money>= nationalPrice){
            visits+=1;
            nationalVisits +=1;
            Money = Money - nationalPrice;
        }
    }
    public void setBeachVisits(){

        if(Money >= beachPrice ){
            visits+=1;
            beachVisits +=1;
            Money = Money - beachPrice;
        }else{

        }
    }
    public void addMoney(double addedMoney){
        Money += addedMoney;
    }
    public double getMoney() {return  Money;}
    public int getNationalVisits(){return nationalVisits;}
    public int getBeachVisits(){return beachVisits;}
    public int getForestVisits(){return forestVisits;}

    public int getVisits(){
        return visits;
    }
}
