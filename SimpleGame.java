import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to number gausing game >..... ");
        int secret = 7;
        int gameNumber;

        gameNumber = inputofNUmbers(input, secret);
        System.out.println(gameNumber);

    }

    public static int inputofNUmbers(Scanner input, int sec) {
        int i = 0;
        int secret = 7;
        int number = 0;
        System.out.println(" enter a number between 1-10 :");
        System.out.println(" you have 5 tires : ");
        while (i < 5) {
            System.out.println(" enter your try number " + (i + 1) + ":");

            number = input.nextInt();
            if (number == secret) {

                System.out.println(" you won the game : ");
                System.out.println(" welcome to second level : ");
                System.out.println(" now you have three tires :");
                System.out.println(" enter number between 10-20 : ");
                int j = 0;
                int num2 = 0;
                int sec2 = 14;
                while (j < 3) {
                    System.out.println(" enter your  level 2 try " + (j + 1) + ": ");
                    num2 = input.nextInt();
                    if (num2 == sec2) {
                        System.out.println(" you won level 2:");
                        System.out.println(" welcome to level three : ");
                        System.out.println(" now you hava only 2 tries : ");
                        System.out.println(" enter your tries between 20-30 :");
                        int t = 0;
                        int sec3 = 21;
                        int n = 0;
                        while (t < 2) {
                            System.out.println(" enter your try " + (t + 1) + ": ");
                            n = input.nextInt();
                            if (n == sec3) {
                                System.out.println(" you won level 3 :");



                                int levelFOUR=levelFour(input);
                            }
                            else if(n>sec3){
                                System.out.println(" your number is high :");
                            }
                            else if(n<sec3){
                                System.out.println(" your number is low :");
                            }
                            t++;
                        }
                        System.out.println(" you lost level three :");
                        return num2;
                    }
                    else if (num2 > sec2) {
                        System.out.println(" your number is too high : ");
                    } else if (num2 < sec2) {
                        System.out.println(" your number is to low");
                    }

                    j++;
                }
                System.out.println(" you lost level 2 :");
            } else if (number > secret) {
                System.out.println(" your number is too high ");
            } else if (number < secret) {
                System.out.println(" number is too low ");
            }


            i++;
        }
        System.out.println(" you use your all tries : ");

        return number;
    }

    public static void poppattern() {


                for (int i = 0; i < 8; i++) { // 8 rows of spray
                    for (int j = 0; j < 15; j++) {
                        if (Math.random() > 0.7) { // random sprinkle
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

                // Bottom cone (party popper part)
                int height = 7;
                for (int i = 1; i <= height; i++) {
                    for (int s = height - i; s > 0; s--) {
                        System.out.print(" ");
                    }
                    for (int star = 0; star < i; star++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                System.out.println("You won the game 🎉");
            }
            public static int levelFour(Scanner input){
                System.out.println(" you won level 3:");
                System.out.println(" welcome to level four : ");
                System.out.println(" now you hava only 2 tries : ");
                System.out.println(" enter your tries between 30-40 :");
                int t = 0;
                int sec4 = 28;
                int n = 0;
                while (t < 2) {
                    System.out.println(" enter your try " + (t + 1) + ": ");
                    n = input.nextInt();
                    if (n == sec4) {
                        System.out.println(" you won level four :");
                        poppattern();
                        break;
                    }
                    else if(n>sec4){
                        System.out.println(" your number is high :");
                    }
                    else if(n<sec4){
                        System.out.println(" your number is low :");
                    }
                    t++;
                }
                System.out.println(" you lost level four :");




        return sec4;
            }
        }
