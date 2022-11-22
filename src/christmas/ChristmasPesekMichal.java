package christmas;

import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
//TimeUnit.SECONDS.sleep(1);

public class ChristmasPesekMichal  {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Jak chcete vysokou svicku? minimalni vyska je 6.");
        int vyska = myObj.nextInt();
        while (vyska < 6) {
            System.out.println("Zadejte vyssi cislo nez-li 5");
            vyska = myObj.nextInt();
        }
        System.out.println("Chcete aby svicka horela? 1 je ano, 0 je ne.");
        int ohen = myObj.nextInt();
        System.out.println("Chcete aby u svicky stal snehulak? 1 je ano, 0 je ne.");
        int snehulak = myObj.nextInt();
        System.out.println("Chcete aby u svicky stalo mestecko? 1 je ano, 0 je ne.");
        int mestecko = myObj.nextInt();
        int sirka = 9;
        int knotv = 1;

        // while (vyska+1 != 0) {
        if (ohen == 1) {
            System.out.print("    *\n   ***\n  *****\n  *****\n   ***\n"); // Toto printuje oheň
        }
        for (int j = 1; j != 1 + knotv; j++) {
            for (int i = 1; i != 1 + sirka; i++) {
                if (i == 4) {
                    System.out.print("|");
                } else {
                    if (i == 5) {
                        System.out.print("|");
                    } else {
                        if (i == 6) {
                            System.out.println("|");
                        } else {
                            if (i < 4) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }

        }

        for (int i = 0; i != vyska; vyska--) {
            for (int j = 0; j != sirka; j++) {
                if (j == sirka - 1) {
                    if (snehulak == 1 && mestecko == 1) {
                        if (vyska == 6) {
                            System.out.print("* ");
                            System.out.println("     __                 \\            o          _|_          \\");
                            break;
                        } else {
                            if (vyska == 5) {
                                System.out.print("* ");
                                System.out.println("   _|==|_               ))          }^{        /___\\         ))");
                                break;
                            } else {
                                if (vyska == 4) {
                                    System.out.print("* ");
                                    System.out.println("    ('')___/          .-#-----.     /|\\     .---'-'---.    .-#-----.");
                                    break;
                                } else {
                                    if (vyska == 3) {
                                        System.out.print("* ");
                                        System.out.println(">--(`^^')        ___ /_________\\   //|\\\\   /___________\\  /_________\\  ");
                                        break;
                                    } else {
                                        if (vyska == 2) {
                                            System.out.print("* ");
                                            System.out.println("  (`^'^'`)      /___\\ |[] _ []|    //|\\\\    | A /^\\ A |    |[] _ []| _.O,_");
                                            break;
                                        } else {
                                            if (vyska == 1) {
                                                System.out.print("* ");
                                                System.out.println("  `======'  ....|\"#\"|.|  |*|  |...///|\\\\\\...|   |\"|   |....|  |*|  |..(^)....");
                                                break;
                                            } else {
                                                System.out.println("*");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (snehulak == 1) {
                            if (vyska == 6) {
                                System.out.print("* ");
                                System.out.println("     __");
                                break;
                            } else {
                                if (vyska == 5) {
                                    System.out.print("* ");
                                    System.out.println("   _|==|_");
                                    break;
                                } else {
                                    if (vyska == 4) {
                                        System.out.print("* ");
                                        System.out.println("    ('')___/");
                                        break;
                                    } else {
                                        if (vyska == 3) {
                                            System.out.print("* ");
                                            System.out.println(">--(`^^')");
                                            break;
                                        } else {
                                            if (vyska == 2) {
                                                System.out.print("* ");
                                                System.out.println("  (`^'^'`)");
                                                break;
                                            } else {
                                                if (vyska == 1) {
                                                    System.out.print("* ");
                                                    System.out.println("  `======'");
                                                    break;
                                                } else {
                                                    System.out.println("*");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (mestecko == 1) {
                                if (vyska == 6) {
                                    System.out.print("* ");
                                    System.out.println("            \\            o          _|_          \\");
                                    break;
                                } else {
                                    if (vyska == 5) {
                                        System.out.print("* ");
                                        System.out.println("            ))          }^{        /___\\         ))");
                                        break;
                                    } else {
                                        if (vyska == 4) {
                                            System.out.print("* ");
                                            System.out.println("          .-#-----.     /|\\     .---'-'---.    .-#-----.");
                                            break;
                                        } else {
                                            if (vyska == 3) {
                                                System.out.print("* ");
                                                System.out.println("     ___ /_________\\   //|\\\\   /___________\\  /_________\\  ");
                                                break;
                                            } else {
                                                if (vyska == 2) {
                                                    System.out.print("* ");
                                                    System.out.println("    /___\\ |[] _ []|    //|\\\\    | A /^\\ A |    |[] _ []| _.O,_");
                                                    break;
                                                } else {
                                                    if (vyska == 1) {
                                                        System.out.print("* ");
                                                        System.out.println("....|\"#\"|.|  |*|  |...///|\\\\\\...|   |\"|   |....|  |*|  |..(^)....");
                                                        break;
                                                    } else {
                                                        System.out.println("*");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("*");
                            }
                        }
                    }
                } else {
                    System.out.print("*");
                }
            }
        }
        // }
    }
}

/*
 * nezapomenout dát na konec
 * else {
 * System.out.println("*");
 * }
 */