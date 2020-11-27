package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
       /* int cupsMadeWatter = 0;
        int cupsMadeMilk = 0;
        int cupsMadeCoffee = 0;
        int cupsMade = 0; */

       /* System.out.println("Write how many ml of water the coffee machine has: ");
        int waterHas = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkHas = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beanHas = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOrdered = scan.nextInt();*/

        /*if (waterHas >= water && milkHas >= milk && beanHas >= coffeeBeans) {
            cupsMadeWatter = waterHas / water;
            cupsMadeMilk = milkHas / milk;
            cupsMadeCoffee = beanHas / coffeeBeans;
        }
        // find out how many cups can be made from this amount:
        cupsMade = Math.min(Math.min(cupsMadeWatter, cupsMadeMilk), cupsMadeCoffee);

        if (cupsOrdered > cupsMade) {
           System.out.println("No, I can make only " + cupsMade + " cup(s) of coffee");
           } else if (cupsOrdered == cupsMade) {
                System.out.println("Yes, I can make that amount of coffee");
           } else if (cupsOrdered < cupsMade) {
                int cupsMore = cupsMade - cupsOrdered;
                System.out.println("Yes, I can make that amount of coffee (and even " + cupsMore + " more than that)");
           }*/

        System.out.println("The coffee machine has:\n"
        + water + " of water\n"
        + milk + " of milk\n"
        + coffeeBeans + " of coffee beans\n"
        + disposableCups + " of disposable cups\n"
        + money + " of money");

        System.out.println("\nWrite action (buy, fill, take): ");
        String action = scan.next();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
            }
        }

        public static void buy() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            Scanner scan = new Scanner(System.in);
            int chosenPurchase = scan.nextInt();
            if (chosenPurchase == 1) {
                makeEspresso();
            } else if (chosenPurchase == 2) {
                makeLatte();
            } else if (chosenPurchase == 3) {
                makeCappuccino();
            }
        }

        public static void fill() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Write how many ml of water do you want to add: ");
            int waterAdd = scan.nextInt();
            System.out.println("Write how many ml of milk do you want to add: ");
            int milkAdd = scan.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add: ");
            int coffeeAdd = scan.nextInt();
            System.out.println("Write how many disposable cups do you want to add: ");
            int cupsAdd = scan.nextInt();

            int waterLeft = 400 + waterAdd;
            int milkLeft = 540 + milkAdd;
            int coffeeBeansLeft = 120 + coffeeAdd;
            int disposableCupsLeft = 9 + cupsAdd;
            int moneyLeft = 550;

            System.out.println("The coffee machine has: \n"
                    + waterLeft + " of water\n"
                    + milkLeft + " of milk\n"
                    + coffeeBeansLeft + " of coffee beans\n"
                    + disposableCupsLeft + " of disposable cups\n"
                    + moneyLeft + " of money");

        }

    public static void take() {
        CoffeeMachine water = new CoffeeMachine();
        CoffeeMachine milk = new CoffeeMachine();
        CoffeeMachine coffeeBeans = new CoffeeMachine();
        CoffeeMachine disposableCups = new CoffeeMachine();
        CoffeeMachine money = new CoffeeMachine();

        System.out.println("I gave you " + "$" + 550);
        int moneyLeft = 550 - 550;
        System.out.println("The coffee machine has: \n"
                + 400 + " of water\n"
                + 540 + " of milk\n"
                + 120 + " of coffee beans\n"
                + 9 + " of disposable cups\n"
                + moneyLeft + " of money");
    }


        public static void makeEspresso() {
        int waterLeft = 400 - 250;
        int coffeeBeansLeft = 120 - 16;
        int disposableCupsLeft = 9 - 1;
        int moneyLeft = 550 + 4;

            System.out.println("The coffee machine has: \n"
                    + waterLeft + " of water\n540 of milk\n"
                    + coffeeBeansLeft + " of coffee beans\n"
                    + disposableCupsLeft + " of disposable cups\n"
                    + moneyLeft + " of money");
        }

        public static void makeLatte() {
        int waterLeft = 400 - 350;
        int milkLeft = 540 - 75;
        int coffeeBeansLeft = 120 - 20;
        int disposableCupsLeft = 9 - 1;
        int moneyLeft = 550 + 7;

            System.out.println("The coffee machine has: \n"
                    + waterLeft + " of water\n"
                    + milkLeft + " of milk\n"
                    + coffeeBeansLeft + " of coffee beans\n"
                    + disposableCupsLeft + " of disposable cups\n"
                    + moneyLeft + " of money");
        }

        public static void makeCappuccino() {
            int waterLeft = 400 - 200;
            int milkLeft = 540 - 100;
            int coffeeBeansLeft = 120 - 12;
            int disposableCupsLeft = 9 - 1;
            int moneyLeft = 550 + 6;

            System.out.println("The coffee machine has: \n"
                    + waterLeft + " of water\n"
                    + milkLeft + " of milk\n"
                    + coffeeBeansLeft + " of coffee beans\n"
                    + disposableCupsLeft + " of disposable cups\n"
                    + moneyLeft + " of money");
        }
    }






