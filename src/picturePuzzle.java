import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class picturePuzzle extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, picture, stB;
    JLabel label1, label2, label3;
    Icon main1 = new ImageIcon("pic/rMain.jpg");
    Icon main2 = new ImageIcon("pic/jMain.jpg");
    Icon main3 = new ImageIcon("pic/eMain.jpg");
    Icon main4 = new ImageIcon("pic/bMain.jpg");

    Icon pc01 = new ImageIcon("pic/r-row-1-col-1.jpg");
    Icon pc02 = new ImageIcon("pic/r-row-1-col-2.jpg");
    Icon pc03 = new ImageIcon("pic/r-row-1-col-3.jpg");
    Icon pc04 = new ImageIcon("pic/r-row-2-col-1.jpg");
    Icon pc05 = new ImageIcon("pic/r-row-2-col-2.jpg");
    Icon pc06 = new ImageIcon("pic/r-row-2-col-3.jpg");
    Icon pc07 = new ImageIcon("pic/r-row-3-col-1.jpg");
    Icon pc08 = new ImageIcon("pic/r-row-3-col-2.jpg");
    Icon pc09 = new ImageIcon("pic/r-row-3-col-3.jpg");

    Icon pc11 = new ImageIcon("pic/j-row-1-col-1.jpg");
    Icon pc12 = new ImageIcon("pic/j-row-1-col-2.jpg");
    Icon pc13 = new ImageIcon("pic/j-row-1-col-3.jpg");
    Icon pc14 = new ImageIcon("pic/j-row-2-col-1.jpg");
    Icon pc15 = new ImageIcon("pic/j-row-2-col-2.jpg");
    Icon pc16 = new ImageIcon("pic/j-row-2-col-3.jpg");
    Icon pc17 = new ImageIcon("pic/j-row-3-col-1.jpg");
    Icon pc18 = new ImageIcon("pic/j-row-3-col-2.jpg");
    Icon pc19 = new ImageIcon("pic/j-row-3-col-3.jpg");

    Icon pc21 = new ImageIcon("pic/e-row-1-col-1.jpg");
    Icon pc22 = new ImageIcon("pic/e-row-1-col-2.jpg");
    Icon pc23 = new ImageIcon("pic/e-row-1-col-3.jpg");
    Icon pc24 = new ImageIcon("pic/e-row-2-col-1.jpg");
    Icon pc25 = new ImageIcon("pic/e-row-2-col-2.jpg");
    Icon pc26 = new ImageIcon("pic/e-row-2-col-3.jpg");
    Icon pc27 = new ImageIcon("pic/e-row-3-col-1.jpg");
    Icon pc28 = new ImageIcon("pic/e-row-3-col-2.jpg");
    Icon pc29 = new ImageIcon("pic/e-row-3-col-3.jpg");

    Icon pc31 = new ImageIcon("pic/b-row-1-col-1.jpg");
    Icon pc32 = new ImageIcon("pic/b-row-1-col-2.jpg");
    Icon pc33 = new ImageIcon("pic/b-row-1-col-3.jpg");
    Icon pc34 = new ImageIcon("pic/b-row-2-col-1.jpg");
    Icon pc35 = new ImageIcon("pic/b-row-2-col-2.jpg");
    Icon pc36 = new ImageIcon("pic/b-row-2-col-3.jpg");
    Icon pc37 = new ImageIcon("pic/b-row-3-col-1.jpg");
    Icon pc38 = new ImageIcon("pic/b-row-3-col-2.jpg");
    Icon pc39 = new ImageIcon("pic/b-row-3-col-3.jpg");

    Icon start1 = pc05;
    Icon start2 = pc12;
    Icon start3 = pc25;
    Icon start4 = pc32;

    ArrayList<Icon> picture1 = new ArrayList<>();
    ArrayList<Icon> picture2 = new ArrayList<>();
    ArrayList<Icon> picture3 = new ArrayList<>();
    ArrayList<Icon> picture4 = new ArrayList<>();
    ArrayList<JButton> buttons = new ArrayList<>();


    picturePuzzle() {
        super("Picture Puzzle Game");

        picture1.add(pc01);picture1.add(pc02);picture1.add(pc03);
        picture1.add(pc04);picture1.add(pc05);picture1.add(pc06);
        picture1.add(pc07);picture1.add(pc08);picture1.add(pc09);

        picture2.add(pc11);picture2.add(pc12);picture2.add(pc13);
        picture2.add(pc14);picture2.add(pc15);picture2.add(pc16);
        picture2.add(pc17);picture2.add(pc18);picture2.add(pc19);

        picture3.add(pc21);picture3.add(pc22);picture3.add(pc23);
        picture3.add(pc24);picture3.add(pc25);picture3.add(pc26);
        picture3.add(pc27);picture3.add(pc28);picture3.add(pc29);

        picture4.add(pc31);picture4.add(pc32);picture4.add(pc33);
        picture4.add(pc34);picture4.add(pc35);picture4.add(pc36);
        picture4.add(pc37);picture4.add(pc38);picture4.add(pc39);

        b1 = new JButton();b2 = new JButton();b3 = new JButton();
        b4 = new JButton();b5 = new JButton();b6 = new JButton();
        b7 = new JButton();b8 = new JButton();b9 = new JButton();
        picture = new JButton(main1);
        picture.setBounds(380, 100, 200, 200);
        stB = new JButton(start1);
        stB.setBounds(380, 5, 75, 75);

        buttons.add(b1);buttons.add(b2);buttons.add(b3);
        buttons.add(b4);buttons.add(b5);buttons.add(b6);
        buttons.add(b7);buttons.add(b8);buttons.add(b9);
        shuffle(picture1);

        label1 = new JLabel("Sample:");
        label1.setBounds(330, 200, 70, 20);
        label2 = new JLabel("NOTE: this icon can swap with neighbour icon, press to shuffle!");
        label2.setBounds(5, 25, 500, 20);
        label3 = new JLabel("Click to next puzzle.");
        label3.setBounds(420, 310, 200, 20);
        label3.setForeground(Color.red);

        initGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stB) {
            if (stB.getIcon().equals(start1)) shuffle(picture1);
            else if (stB.getIcon().equals(start2)) shuffle(picture2);
            else if (stB.getIcon().equals(start3)) shuffle(picture3);
            else if (stB.getIcon().equals(start4)) shuffle(picture4);
        }

        if (e.getSource() == picture) {
            Icon temp = picture.getIcon();
            if (temp == main4) {
                picture.setIcon(main1);
                shuffle(picture1);
                stB.setIcon(start1);
            } else if (temp == main1) {
                picture.setIcon(main2);
                shuffle(picture2);
                stB.setIcon(start2);
            } else if (temp == main2) {
                picture.setIcon(main3);
                shuffle(picture3);
                stB.setIcon(start3);
            } else if (temp == main3) {
                picture.setIcon(main4);
                shuffle(picture4);
                stB.setIcon(start4);
            }
        }
    }

    public void initGUI() {
        Image icon = Toolkit.getDefaultToolkit().getImage("pic/icon.png");
        JPanel p = new JPanel();
        p.setBounds(10, 80, 300, 300);
        p.setLayout(new GridLayout(3, 3));

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        add(picture);
        add(stB);
        add(label1);
        add(label2);
        add(label3);
        b1.addActionListener(this::gameLogic);
        b2.addActionListener(this::gameLogic);
        b3.addActionListener(this::gameLogic);
        b4.addActionListener(this::gameLogic);
        b5.addActionListener(this::gameLogic);
        b6.addActionListener(this::gameLogic);
        b7.addActionListener(this::gameLogic);
        b8.addActionListener(this::gameLogic);
        b9.addActionListener(this::gameLogic);
        picture.addActionListener(this);
        stB.addActionListener(this);

        add(p);
        setLayout(null);
        setSize(600, 500);
        setIconImage(icon);
        setForeground(Color.darkGray);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void shuffle(ArrayList<Icon> icons) {
        Collections.shuffle(icons);
        for (int i = 0; i < icons.size(); i++) {
            buttons.get(i).setIcon(icons.get(i));
        }
    }

    public void gameLogic(ActionEvent e) {
        if(e.getSource() == b1){
            Icon temp = b1.getIcon();
            if(b2.getIcon().equals(stB.getIcon())){
                b2.setIcon(temp);
                b1.setIcon(stB.getIcon());
            }else if(b4.getIcon().equals(stB.getIcon())){
                b4.setIcon(temp);
                b1.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b2){
            Icon temp = b2.getIcon();
            if(b1.getIcon().equals(stB.getIcon())){
                b1.setIcon(temp);
                b2.setIcon(stB.getIcon());
            }else if(b3.getIcon().equals(stB.getIcon())){
                b3.setIcon(temp);
                b2.setIcon(stB.getIcon());
            }else if(b5.getIcon().equals(stB.getIcon())){
                b5.setIcon(temp);
                b2.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b3){
            Icon temp = b3.getIcon();
            if(b2.getIcon().equals(stB.getIcon())){
                b2.setIcon(temp);
                b3.setIcon(stB.getIcon());
            }else if(b6.getIcon().equals(stB.getIcon())){
                b6.setIcon(temp);
                b3.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b4){
            Icon temp = b4.getIcon();
            if(b1.getIcon().equals(stB.getIcon())){
                b1.setIcon(temp);
                b4.setIcon(stB.getIcon());
            }else if(b5.getIcon().equals(stB.getIcon())){
                b5.setIcon(temp);
                b4.setIcon(stB.getIcon());
            }else if(b7.getIcon().equals(stB.getIcon())){
                b7.setIcon(temp);
                b4.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b5){
            Icon temp = b5.getIcon();
            if(b2.getIcon().equals(stB.getIcon())){
                b2.setIcon(temp);
                b5.setIcon(stB.getIcon());
            }else if(b4.getIcon().equals(stB.getIcon())){
                b4.setIcon(temp);
                b5.setIcon(stB.getIcon());
            }else if(b6.getIcon().equals(stB.getIcon())){
                b6.setIcon(temp);
                b5.setIcon(stB.getIcon());
            }else if(b8.getIcon().equals(stB.getIcon())){
                b8.setIcon(temp);
                b5.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b6){
            Icon temp = b6.getIcon();
            if(b3.getIcon().equals(stB.getIcon())){
                b3.setIcon(temp);
                b6.setIcon(stB.getIcon());
            }else if(b5.getIcon().equals(stB.getIcon())){
                b5.setIcon(temp);
                b6.setIcon(stB.getIcon());
            }else if(b9.getIcon().equals(stB.getIcon())){
                b9.setIcon(temp);
                b6.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b7){
            Icon temp = b7.getIcon();
            if(b4.getIcon().equals(stB.getIcon())){
                b4.setIcon(temp);
                b7.setIcon(stB.getIcon());
            }else if(b8.getIcon().equals(stB.getIcon())){
                b8.setIcon(temp);
                b7.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b8){
            Icon temp = b8.getIcon();
            if(b7.getIcon().equals(stB.getIcon())){
                b7.setIcon(temp);
                b8.setIcon(stB.getIcon());
            }else if(b5.getIcon().equals(stB.getIcon())){
                b5.setIcon(temp);
                b8.setIcon(stB.getIcon());
            }else if(b9.getIcon().equals(stB.getIcon())){
                b9.setIcon(temp);
                b8.setIcon(stB.getIcon());
            }
        }
        if(e.getSource() == b9){
            Icon temp = b9.getIcon();
            if(b8.getIcon().equals(stB.getIcon())){
                b8.setIcon(temp);
                b9.setIcon(stB.getIcon());
            }else if(b6.getIcon().equals(stB.getIcon())){
                b6.setIcon(temp);
                b9.setIcon(stB.getIcon());
            }
        }
    }


    public static void main(String[] args) {
        new picturePuzzle();
    }
}
