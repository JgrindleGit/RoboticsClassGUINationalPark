package CoffeeCardStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainGUI {
    // adding all classes and variables needed.

    public Graphics g;
    public JFrame f;
    public JButton b;
    public JButton bAdd;
    public JTextField t;
    public JTextField v;
    public JButton fB;
    public JButton frB;
    public JButton n;

    //IGNORE UNDER THIS COMMENT
    //BeachReward z = new BeachReward();

    MainGUI() {
        //Instantating the classes

        f = new JFrame("National Park Card");
        fB = new JButton("Amount of Visits Forest: " + Variables.park.getForestVisits());
        t = new JTextField("Money on you: " + Variables.park.getMoney());
        n = new JButton("Amount of Visits National: " + Variables.park.getNationalVisits());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("Amount of Visits Beach: " + Variables.park.getVisits());
        v = new JTextField("Amount of Visits: " + Variables.park.getVisits());
        frB = new JButton("Free Visit: " + Variables.beach.getIsRewar());
        bAdd = new JButton("Add Ten Dollars to Accouunt");
        //setting the boundaries of the button and text fields for the GUI
        frB.setBounds(0,200,245,30);
        b.setBounds(0, 30, 195, 25);
        bAdd.setBounds(0, 100, 80, 30);
        t.setBounds(0, 150, 195, 30);
        fB.setBounds(0, 60, 195, 30);
        n.setBounds(0, 90, 195, 30);
        v.setBounds(0, 120, 195, 30);
        //adding button listeners to do commands when the buttons are pressed
        frB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //DOESN'T WORK
                //Free visit Button
                Variables.beach.reward();
                frB.setText("Free Visit: " + Variables.beach.getIsRewar());
            }
        });
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //National Park Button when called adds 1 visit
                Variables.park.setNationalVisits();
                n.setText("Amount of Visits National: " + Variables.park.getNationalVisits());
                t.setText("Money on you: " + Variables.park.getMoney());
                v.setText("Amount of Visits: " + Variables.park.getVisits());
            }
        });
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Money add Button When callled adds 10 Dollars
                Variables.park.addMoney(10);
                t.setText("Money on you: " + Variables.park.getMoney());
            }
        });
        fB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Forest Button when called adds 1 visit
                Variables.park.setForestVisits();
                v.setText("Amount of Visits: " + Variables.park.getVisits());
                fB.setText("Amount of Forest Visits: " + Variables.park.getForestVisits());
                t.setText("Money on you: " + Variables.park.getMoney());
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Beach Button when called adds 1 visit
                Variables.park.setBeachVisits();
                b.setText("Amount of Beach Visits: " + Variables.park.getBeachVisits());
                v.setText("Amount of Visits: " + Variables.park.getVisits());
                Variables.beach.setIsReward();
                t.setText("Money on you: " + Variables.park.getMoney());
                frB.setText("Free visit: " + Variables.beach.getIsRewar());

            }
        });
        //Adding the components to the GUI
        f.add(n);
        f.add(v);
        f.add(fB);
        f.add(frB);
        f.add(t);
        f.add(b);//adding button into frame
        f.add(bAdd);
        f.getContentPane().add(frB);
        f.getContentPane().add(n);
        f.getContentPane().add(v);
        f.getContentPane().add(fB);
        f.getContentPane().add(t);
        f.getContentPane().add(b);
        f.getContentPane().add(bAdd);

        //Set GUI size and visibility
        f.pack();
        f.update(g);
        f.setSize(600, 600);//frame size 300 width and 300 height
        f.setLayout(null);//no layout manager
        //z = new BeachReward();
        f.setVisible(true);
    }
    public static void main(String [] args){
        //when built and compiled this makes it so you can
        //start the GUI w/o BlueJ
        MainGUI i = new MainGUI();

    }

}