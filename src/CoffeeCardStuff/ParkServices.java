package CoffeeCardStuff;

/**
 * Created by John on 2/24/2015.
 */
public class ParkServices {

   // public MainGUI main;
    private int beachVisits;
    public int nationalVisits = 0;
    private double nationalPrice;
    private double forestPrice;
    public int forestVisits = 0;
    public int visits = 0;
    public double Money;
    private double beachPrice;
    //sets variable to default
    public ParkServices(){
        beachPrice = 10;
        forestPrice = 5;
        nationalPrice = 30;
        Money = 40;

    }
    //For all methods except setBeach. these methods  check if Money is greater than price
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
        }
    }
    //set Beach is used for Reward system
    public void setBeach(){
        visits += 1;
        beachVisits =+1;
    }

    public void addMoney(double addedMoney){
        Money += addedMoney;
    }
    // getter methods for all variables
    public double getMoney() {return  Money;}
    public int getNationalVisits(){return nationalVisits;}
    public int getBeachVisits(){return beachVisits;}
    public int getForestVisits(){return forestVisits;}

    public int getVisits(){
        return visits;
    }
}
