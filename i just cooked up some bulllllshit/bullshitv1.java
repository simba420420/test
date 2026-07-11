import java.util.*;

public class bullshitv1 {
    // the home screen

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int turd = 1;

        System.out.println("user? ");
        String userName = scan.nextLine();
        if (userName.equals("s")) {
            rpg_Fight(turd);
        } else {
            System.out.print("hello " + userName);
            System.out.println(" what action would you like to do?");
        }
        //System.out.println("actions:");
        //System.out.println("rpg fight");
        //String action = scan.nextLine();
        //if (action.equals("rpg fight")) {
        //rpg_Fight(dev_True);
        //not needed right now will be back later
        //i will use this in the final version it just takes to long to get to what im working

        //}
        //this is the main game
    }
public static void turncalc(int turd) {
    int i = 1;

    for (;;) {
        if ((i % 2) == 1 && (i > -1)) {
            i++;
            turd = 1;
            break;
        }
        else if ((i % 2) == 0 && (i > -1)) {
            i++;
            turd = 0;
            break;
        }
    }
}

    public static void rpg_Fight(int turd) {

        Scanner scan = new Scanner(System.in);
        double hp = 90;
        double hp1 = 120;
        String c = "2";
        ArrayList<String> mv = new ArrayList<String>();
        System.out.println("this is a rpg");
        System.out.println("there are 5 classes");
        System.out.println("1: mage");
        System.out.println("2: bandit");
        System.out.println("3: archer");
        System.out.println("4: bersker");
        System.out.println("5: tank");
        System.out.println("type the name of what you want to be");
        String ch2 = scan.nextLine();

        for (; ; ) {
            if (ch2.equals("mage")) {
                mv.add("over head spears");
                mv.add("auto shields");
                mv.add("pure magic");
                mv.add("bless me gods");
                System.out.println("your new moves as a mage are");
                System.out.println("over head spears:");
                System.out.println("auto shields:");
                System.out.println("pure magic:");
                System.out.println("bless me gods:");
                c = "mage";
                break;
            } else if (ch2.equals("bandit")) {
                mv.add("speed blitz");
                mv.add("song");
                mv.add("rock throw");
                mv.add("dodge");
                System.out.println("your new moves as a bandit are");
                System.out.println("speed blitz");
                System.out.println("song");
                System.out.println("rock throw");
                System.out.println("dodge");
                c = "bandit";
                break;
            } else if (ch2.equals("archer")) {
                mv.add("longbow");
                mv.add("rapid shots");
                mv.add("explosive shot");
                mv.add("long shot");
                System.out.println("your new moves as a archer are");
                System.out.println("longbow");
                System.out.println("rapid shots");
                System.out.println("explosive shot");
                System.out.println("long shot");
                c = "archer";
                break;
            } else if (ch2.equals("bersker")) {
                mv.add("wild strikes");
                mv.add("axe throw");
                mv.add("bersker rage");
                mv.add("heavy blow");
                System.out.println("your new moves as a bersker are");
                System.out.println("wild strikes");
                System.out.println("axe throw");
                System.out.println("bersker rage");
                System.out.println("heavy blow");
                c = "bersker";
                break;
            } else if (ch2.equals("tank")) {
                mv.add("fall");
                mv.add("laugh");
                mv.add("punch");
                mv.add("kick");
                System.out.println("your new moves as a tank are");
                System.out.println("fall");
                System.out.println("laugh");
                System.out.println("punch");
                System.out.println("kick");
                c = "tank";
                hp = 170;
                break;
            } else {
                System.out.println("sorry that is not a class please choose a class");
            }
        }
        System.out.println(" ");
        System.out.println("you find your self in a dark alley");
        System.out.println("you stumble out of the alley and meet a knight");
        System.out.println("he asks you to duel");
        System.out.println("do you accecpt");
        String ch1 = scan.nextLine();
        if (ch1.equals("yes")) {
            System.out.print("the knight has " + hp1);
            System.out.print("hp");
            System.out.println("");
            System.out.println("you have " + hp);
            System.out.println("what would you like to do");
            System.out.println("info:");
            System.out.println("start fight: ");
            System.out.println("(its recommend to check your moves as you cannot go back after this)");

            for (; ; ) {
                String move = scan.nextLine();
                if (move.equals("info")) {
                    if (c.equals("mage")) {
                        System.out.println(mv);
                        System.out.println("mid");
                    }
                } else if (move.equals("start fight")) {

                    magedmg(hp, hp1, c, turd);
                    break;
                }

            }


        }
    }

    // the math for all of the fighting
    public static void magedmg(double hp, double hp1, String c, int turn) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your move");
        String move = scan.nextLine();
        double md = 10;
        int buff = 0;
        double edmg = 20;
        boolean shield = false;
        if (c.equals("mage")) {
            if (move.equals("auto shields") || move.equals("2")) {

                if (shield == true) {
                    System.out.println("you can only use this once please choose another move");
                } else if (shield == false) {
                    hp = hp + 40;
                    System.out.println("you feel stronger + 40 hp");
                    shield = true;
                }
            } else if (move.equals("pure magic") || move.equals("3")) {
                md = md + 15;
                hp1 = hp1 - md;
                System.out.print("you did " + md);
                System.out.print(" dmg");
                System.out.println("");
                md = md - 15;
            } else if (move.equals("bless me gods") || move.equals("4")) {
                if (buff >= 10) {
                    System.out.println("you can only use this buff 10 times please do another move");
                } else if (buff < 10) {
                    md = md * 1.1;
                    System.out.println("you feel stronger you will deal 1.1x more dmg now");
                    buff++;
                }

            } else if (move.equals("over head spears") || move.equals("1")) {
                md = md + 5;
                hp1 = hp1 - md;
                md = md - 5;

            }
        } else if (c.equals("bandit")) {
            if (move.equals("speed blitz")) {
                md = md - 5;
                hp1 = hp1 - md;
                System.out.println("you hit them once");
                hp1 = hp1 - md;
                System.out.println("you hit them twice");
                hp1 = hp1 - md;
                System.out.println("you hit them three times");
                System.out.print("you hit them for a total of " + md * 3);
                System.out.print(" dmg");
                System.out.println("");
            } else if (move.equals("song")) {
                if (buff >= 1) {
                    System.out.println("you can only use this buff 3 times please do another move");
                } else if (buff < 1) {
                    System.out.println("you feel stronger you will deal a extra 1.3x dmg but you take 1.5x more dmg now");
                    md = md * 1.3;
                    edmg *= 1.5;
                    System.out.println(edmg);
                    System.out.println("work");

                }
            } else if (move.equals("rock throw")) {
                System.out.println("you sling a rock into the air it will come down next move and deal 20 dmg but you will take 1.5 more dmg now");
            } else if (move.equals("dodge")) {
                System.out.println("you will take no dmg next turn");
            }
        }
            /*
            System.out.println("long shot");
            */

        else if (c.equals("archer")) {
            if (move.equals("longbow")) {
                if (buff <= 2) {
                    int shot = 1;
                    System.out.println("you shot your longbow only " + shot + " arrows left");
                    md += 25;
                    hp1 = hp1 - md;
                    System.out.println("you dealt " + md);
                    System.out.print("dmg");
                    md -= 25;
                    shot = shot - buff;
                    shot++;
                }
                else if (buff >= 2) {
                    System.out.println("sorry you have no more longbow arrows left");
                }

            }
            else if (move.equals("rapid shots")) {
                md -= 5;
                hp1 = hp1 - md * 5;
                System.out.println("you shot them 5 times dealing " + md * 5 + " dmg");
                md += 5;
            }
            else if (move.equals("explosive shot")) {

            }
        }
    }
}






















// hello this is the dump all the old code i might use in the future
//  Scanner scan = new Scanner(System.in);
//        if (dev_true == true) {
//            System.out.println("since you are a dev you will have maxxed stats");
//        }
//        else {
//            System.out.println("you will have 300 stat points each stat takes 100 to max");
//            System.out.println("type the name of the stat and then after how many points you want to put in");
//        }
//        int sp1 = 300;
//        int speedStat = 0;
//        int health = 0;
//        int mp = 0;
//        int magic = 0;
//        System.out.println("stats:");
//        System.out.println("speed");
//        System.out.println("strength");
//        System.out.println("health");
//        System.out.println("magic power");
//        System.out.println("magic defense");
//        System.out.println("what stat would you like to do first? :");
//        String userInp = scan.nextLine();
//so i wanted to use this at first but instead i will use it at some point in the future
//
/*import java.awt.*;
        import java.awt.event.ActionListener;
import java.util.*;
        import javax.swing.*;
public class GUI{
    public GUI(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        JPasswordField tip = new JPasswordField();
        JLabel label = new JLabel("you like it when i like you like that dont you");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);
        panel.add(tip);



        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("huh");
        frame.pack();
        frame.setVisible(true);


        if (tip.equals(true)) {
            System.out.println("huh2");
        }
    }
    public static void main(String[] args ){

    }


*/
// lil gui stuff wrong file type might use it later