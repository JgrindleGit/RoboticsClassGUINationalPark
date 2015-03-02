import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainGUI {
    public ParkServices vis;
    public Graphics g;
    public JFrame f;
    public JButton b;
    public JButton bAdd;
    public JTextField t;
    public JTextField v;
    public JButton fB;
    public JButton frB;
    public JButton n;
    public BeachReward z;
    //BeachReward z = new BeachReward();
    public void mainGUI() {
        z = new BeachReward();
        vis = new ParkServices();
        f = new JFrame("National Park Card");
        fB = new JButton("Amount of Visits Forest: " + vis.getForestVisits());
        t = new JTextField("Money on you: " + vis.getMoney());
        n = new JButton("Amount of Visits National: " + vis.getNationalVisits());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("Amount of Visits Beach: " + vis.getVisits());
        v = new JTextField("Amount of Visits: " + vis.getVisits());
        frB = new JButton("Free Visit" );
        bAdd = new JButton("Add Ten Dollars to Accouunt");

        frB.setBounds(0,300,245,30);
        b.setBounds(0, 30, 195, 25);// setting button position
        bAdd.setBounds(0, 100, 80, 30);
        t.setBounds(0, 150, 195, 30);
        fB.setBounds(0, 60, 195, 30);
        n.setBounds(0, 90, 195, 30);
        v.setBounds(0, 120, 195, 30);

        frB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                z.reward();

                frB.setText("Free Visit" );
            }
        });
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vis.setNationalVisits();
                n.setText("Amount of Visits National: " + vis.getNationalVisits());
                t.setText("Money on you: " + vis.getMoney());
                v.setText("Amount of Visits: " + vis.getVisits());
            }
        });
        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vis.addMoney(10);
                t.setText("Money on you: " + vis.getMoney());
            }
        });
        fB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vis.setForestVisits();
                v.setText("Amount of Visits: " + vis.getVisits());
                fB.setText("Amount of Forest Visits: " + vis.getForestVisits());
                t.setText("Money on you: " + vis.getMoney());
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vis.setBeachVisits();
                b.setText("Amount of Beach Visits: " + vis.getBeachVisits());
                v.setText("Amount of Visits: " + vis.getVisits());
                t.setText("Money on you: " + vis.getMoney());
            }
        });
        f.add(n);
        f.add(v);
        f.add(fB);
        f.add(t);
        f.add(b);//adding button into frame
        f.add(bAdd);
        f.getContentPane().add(n);
        f.getContentPane().add(v);
        f.getContentPane().add(fB);
        f.getContentPane().add(t);
        f.getContentPane().add(b);
        f.getContentPane().add(bAdd);

        f.pack();
        f.update(g);
        f.setSize(600, 600);//frame size 300 width and 300 height
        f.setLayout(null);//no layout manager
        //z = new BeachReward();
        f.setVisible(true);
    }

}