import java.util.*;

public class Example2 {
    // the home screen

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("user? ");
        String userName = scan.nextLine();
        if (userName.equals("s")) {
            rpg_Fight();
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



    public static void rpg_Fight() {

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


        for (; ; ) {
            String ch2 = scan.nextLine();
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
                mv.add("homing arrows");
                System.out.println("your new moves as a archer are");
                System.out.println("longbow");
                System.out.println("rapid shots");
                System.out.println("explosive shot");
                System.out.println("homing arrows");
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
                mv.add("getting real");
                System.out.println("your new moves as a tank are");
                System.out.println("fall");
                System.out.println("laugh");
                System.out.println("punch");
                System.out.println("getting real");
                c = "tank";
                hp = 170;
                break;
            } else {
                System.out.println("sorry that is not a class please choose a class");
                continue;
            }
        }
        System.out.println(" ");
        System.out.println("you find your self in a dark alley");
        System.out.println("you stumble out of the alley and meet a knight");
        System.out.println("he asks you to duel");
        System.out.println("do you accecpt");
        System.out.println("Y/n");
        String ch1 = scan.nextLine();
        if (ch1.equals("yes") || ch1.equals("y")) {
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
                    }
                    else if (c.equals("bandit")) {
                        System.out.println(mv);
                    }
                    else if (c.equals("bandit")) {
                        System.out.println(mv);
                    }
                    else if (c.equals("archer")) {
                        System.out.println(mv);
                    }
                    else if (c.equals("bersker")) {
                        System.out.println(mv);
                    }
                    else if (c.equals("tank")) {
                        System.out.println(mv);
                    }
                } else if (move.equals("start fight")) {
                    turncalc(hp, hp1, c);
                    break;
                }
            }
        }
    }
    public static void turncalc(double hp, double hp1, String c) {
        int i = 1;

        while (true) {


            for (; ; ) {
                if ((i % 2) == 1 && (i > -1)) {
                    i++;
                    magedmg(hp, hp1, c);
                    break;
                } else if ((i % 2) == 0 && (i > -1)) {
                    i++;
                    edmg(hp, hp1);
                    break;
                }
            }
        }
    }
    // the math for all of the fighting
    public static void magedmg(double hp, double hp1, String c) {
        Scanner scan = new Scanner(System.in);
        System.out.println("you can also use numbers to use your move");
        System.out.println("what is your move");
        String move = scan.nextLine();
        double md = 10;
        int buff = 0;
        double edmg = 20;
        boolean shield = false;
        int miss = 0;
        int axes = 0;
        int buff2 = 0;
        boolean atlas = false;
        int mr_peabody = (int) (Math.random() * 3 + 1);
        if (c.equals("mage")) {
            if (move.equals("auto shields") || move.equals("2")) {
                System.out.println("your using " + move);
                if (shield == true) {
                    System.out.println("you can only use this once please choose another move");
                } else if (shield == false) {
                    hp = hp + 40;
                    System.out.println("you feel stronger + 40 hp");
                    shield = true;
                }
            } else if (move.equals("pure magic") || move.equals("3")) {
                System.out.println("your using " + move);
                md = md + 15;
                hp1 = hp1 - md;
                System.out.print("you did " + md);
                System.out.print(" dmg");
                System.out.println("");
                md = md - 15;
            } else if (move.equals("bless me gods") || move.equals("4")) {
                System.out.println("your using " + move);
                if (buff >= 10) {
                    System.out.println("you can only use this buff 10 times please do another move");
                } else if (buff < 10) {
                    md = md * 1.1;
                    System.out.println("you feel stronger you will deal 1.1x more dmg now");
                    buff++;
                }

            } else if (move.equals("over head spears") || move.equals("1")) {
                System.out.println("your using " + move);
                md = md + 5;
                hp1 = hp1 - md;
                md = md - 5;

            }
        } else if (c.equals("bandit")) {
            if (move.equals("speed blitz") || move.equals("1")) {
                System.out.println("your using " + move);
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
            } else if (move.equals("song") || move.equals("2")) {
                System.out.println("your using " + move);
                if (buff >= 1) {
                    System.out.println("you can only use this buff 3 times please do another move");
                } else if (buff < 1) {
                    System.out.println("you feel stronger you will deal a extra 1.3x dmg but you take 1.5x more dmg now");
                    md = md * 1.3;
                    edmg *= 1.5;
                    System.out.println(edmg);
                    System.out.println("work");

                }
            } else if (move.equals("rock throw") || move.equals("3")) {
                System.out.println("your using " + move);
                System.out.println("you sling a rock into the air it will come down next move and deal 20 dmg but you will take 1.5 more dmg now");
            } else if (move.equals("dodge") || move.equals("4")) {
                System.out.println("you will take no dmg next turn");
            }
        } else if (c.equals("archer")) {
            if (move.equals("longbow") || move.equals("1")) {
                System.out.println("your using " + move);
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
                } else if (buff >= 2) {
                    System.out.println("sorry you have no more longbow arrows left");
                }

            } else if (move.equals("rapid shots") || move.equals("2")) {
                System.out.println("your using " + move);
                md -= 5;
                hp1 = hp1 - md * 5;
                System.out.println("you shot them 5 times dealing " + md * 5 + " dmg");
                md += 5;
            } else if (move.equals("explosive shot") || move.equals("3")) {
                System.out.println("your using " + move);
                md += 15;
                hp1 = hp1 - md;
                int portal_transmission = (int) (Math.random() * 10) + 1;
                if (portal_transmission < 4) {
                    System.out.println("you got caught in the explosion");
                    System.out.print("you got hit for " + md);
                    System.out.print(" dmg");
                    System.out.println("");
                }
                System.out.print("you hit them for " + md);
                System.out.print(" dmg");
                System.out.println("");
                md -= 15;
            } else if (move.equals("homing arrows") || move.equals("4")) {
                System.out.println("your using " + move);
                System.out.print("your arrow pireced though them dealing" + md);
                System.out.print("dmg");
                System.out.println("");
                System.out.println("your arrow will come back in 2 rounds");
                hp1 = hp1 - md;
                System.out.println("rest of move wip");

            }
        } else if (c.equals("bersker")) {
            System.out.println("your using " + move);
            md += 6.6666666666666666666666666;
            if (move.equals("wild strikes") || move.equals("1")) {
                System.out.println("you hit them once");
                System.out.println("you hit them twice");
                System.out.println("you hit them three times");
                System.out.print("you did a total of " + md * 3);
                System.out.print(" dmg");
                System.out.println("");
                md = md * 3;
                md = md - hp1;
                md = md - hp;
                md = md / 3;
                System.out.println("you striked a bit too wild and hit yourself as well for " + md * 2.4);
            } else if (move.equals("axe throw") || move.equals("2")) {
                System.out.println("your using " + move);
                System.out.println("you threw your axe at them");
                if (miss == 1) {
                    mr_peabody = (int) (Math.random() * 2 + 1);

                }
                if (mr_peabody == 1) {
                    System.out.println("your axe missed");
                    System.out.println("your enmeny now has your axe now they do an extra 10 dmg");
                    if (axes >= 3) {
                        if (axes == 1) {
                            edmg += 10;
                            axes++;
                        } else if (axes == 2) {
                            edmg += 30;
                        }
                    }
                } else if (mr_peabody > 2) {
                    System.out.println("your axe hit for 45");
                    md += 25;
                    hp1 = hp1 - md;
                }
            } else if (move.equals("bersker rage") && buff >= 1 || move.equals("3") && buff >= 1) {
                System.out.println("your using " + move);
                System.out.println("your enraged now you will miss more often but deal 15 more dmg");
                miss = 1;
                md += 15;
            } else if (move.equals("bersker rage") && buff <= 1) {
                System.out.println("you can only use this buff one time please do another move");
            } else if (move.equals("heavy blow") || move.equals("4")) {
                if (miss == 1) {
                    System.out.println("your using " + move);
                    md += 25;
                    System.out.print("you dealt " + md);
                    System.out.print("dmg");
                    System.out.println("");
                }
                else{
                    System.out.println("you need to be enraged to use this");
                }
            }

        }
        else if (c.equals("tank")) {

            if (move.equals("stonewall")) {
                System.out.println("your using " + move);
                if (buff2 == 1) {
                    System.out.println("you got 50 hp for the next 4 turns");
                    hp = +50;
                    buff++;
                } else {
                    System.out.println("you can only use this buff 1 time");
                }
            } else if (move.equals("glare")) {
                System.out.println("your using " + move);
                System.out.println("you glared at them scaring them they deal 5 less dmg now");
                edmg -= 5;
            } else if (move.equals("calming music")) {
                System.out.println("your using " + move);
                System.out.println("the music calmed you down");
                atlas = false;
            }

            if (move.equals("fall")) {
                System.out.println("your using " + move);
                System.out.print("you fell on them dealing " + md);
                System.out.print(" dmg");
                System.out.println("");
                hp1 = hp1 - md;
            } else if (move.equals("laugh")) {
                System.out.println("your using " + move);
                if (buff <= 2) {
                    System.out.println("you laugh giving you 10 more hp");
                    buff++;
                    hp += 10;
                } else {
                    System.out.println("you can only use this buff 3 times please do another move");
                }
            } else if (move.equals("punch")) {
                System.out.println("your using " + move);
                System.out.println("you hit them for " + md);
                hp1 = hp1 - md;
            } else if (move.equals("getting real")) {
                System.out.println("your using " + move);
                atlas = true;
            }
            if (atlas == true) {
                System.out.println("you have new moves");
                System.out.println("bash");
                System.out.println("stonewall");
                System.out.println("glare");
                System.out.println("calming music");
                if (move.equals("bash")) {
                    System.out.println("your using " + move);
                    md += 10;
                    System.out.print("you rushed foward and bashed into them dealing " + md);
                    System.out.print("dmg ");
                    System.out.println("");
                    hp1 = hp1 - md;
                    md -= 10;
                }
            }
        }
    }
    public static void edmg(double hp, double hp1) {
        int iwabd = (int) (Math.random() * 6 + 1);
        // this is the chance for a effect
        int bendy = (int) (Math.random() * 10 + 1);
        // chancce for a buff
        double iwagd = (int) (Math.random() * 2.5 + 20);
        // this is the acutal edmg
        if (bendy == 1) {
            iwagd = iwagd / 2.3;
            iwagd = iwagd * 1.5;
        }
        hp = hp - iwagd;
        System.out.print("they hit you for " + iwagd);
        System.out.print("dmg");
        System.out.println("");
        if (iwabd == 1) {
            hp1 = hp1 - iwagd;
        }

    }

}




















