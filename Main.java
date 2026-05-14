import java.util.Scanner;
public class Main {
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
        else {
            System.out.print("hello " + userName);
            System.out.println(" what action would you like to do?");
            }
        System.out.println("actions:");
        System.out.println("rpg fight");
        String action = scan.nextLine();
        if (action.equals("rpg fight")) {
            rpg_Fight(dev_True);
        }

    }
    public static void rpg_Fight(boolean dev_true) {
        Scanner scan = new Scanner(System.in);
        if (dev_true == true) {
            System.out.println("since you are a dev you will have maxxed stats");
        }
        else {
            System.out.println("you will have 300 stat points each stat takes 100 to max");
            System.out.println("type the name of the stat and then after how many points you want to put in");
        }
        int sp1 = 300;
        int speedStat = 0;
        int health = 0;
        int mp = 0;
        int magic
       System.out.println("stats:");
        System.out.println("speed");
        System.out.println("strength");
        System.out.println("health");
        System.out.println("magic power");
        System.out.println("magic defense");
        System.out.println("what stat would you like to do first? :");
        String userInp = scan.nextLine();


    }
    public static void if_v2(String userInp) {
        if (userInp.equals(userInp))
    }
}