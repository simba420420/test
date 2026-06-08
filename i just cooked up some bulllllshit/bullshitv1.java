import java.awt.*;
import java.util.*;
import javax.swing.*;

public class bullshitv1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean dev_True = false;
        System.out.println("user? ");
        String userName = scan.nextLine();
        if (userName.equals("levi")) {
            System.out.println("dev active");
            dev_True = true;
            System.out.println("what action would you like to do?");
        }
        else if (userName.equals("s")) {
            rpg_Fight(dev_True);
        }
        else {
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

    }
    public static void rpg_Fight(boolean dev_true) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> mv = new ArrayList<String>();
    System.out.println("this is a rpg");
    System.out.println("there are 5 classes");
    System.out.println("1: mage");
    System.out.println("2: bandit");
    System.out.println("3: archer");
    System.out.println("4: bersker");
    System.out.println("5: tank");
    System.out.println("type the name of what you want to be");
    String ch = scan.nextLine();
    if (ch.equals("mage")) {
        mv.add("over head spears");
        mv.add("auto shields");
        mv.add("pure magic");
        mv.add("bless me gods");
        System.out.println("your new moves as a mage is");
        System.out.println("over head spears:");
        System.out.println("auto shields:");
        System.out.println("pure magic:");
        System.out.println("bless me gods:");
    //else if (ch.equals("bandit")) {
        mv.add("speed blitz");
        mv.add("-");
    //    }

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
