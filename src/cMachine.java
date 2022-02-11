
public class cMachine {
	int water = 0;
    int milk = 0;
    int beans = 0;
    int money = 0;
    int cups = 0;
    String str = "";

    cMachine() {
        water = 400;
        milk = 540;
        beans = 120;
        cups = 9;
        money = 550;
    }

    public void printCoffee(/*int money, int water,int milk, int beans,int cups&*/) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$"+ money + " of money");
    }

    public void getStr(){
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
    }

    public void choice() {
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            getStr();
            switch (str) {
                case "buy" :
                    System.out.println("What do you want to buy?" +
                            " 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
                    getStr();
                    switch (str) {
                        case "1":
                            if(water < 250 || beans < 16 || cups < 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                water -= 250;
                                beans -= 16;
                                cups--;
                                money += 4;
                            }
                            break;
                        case "2":
                            if(water < 350 || beans < 20 || cups < 1 || milk < 75) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups--;
                                money += 7;
                            }
                            break;
                        case "3":
                            if(water < 200 || beans < 12 || cups < 1 || milk < 100) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups--;
                                money += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "take" :
                    money = 0;
                    break;
                case "fill" :
                    System.out.println("Write how many ml of water you want to add:");
                    getStr();
                    water += Integer.parseInt(str);
                    System.out.println("Write how many ml of milk you want to add:");
                    getStr();
                    milk += Integer.parseInt(str);
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    getStr();
                    beans += Integer.parseInt(str);
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    getStr();
                    cups += Integer.parseInt(str);
                    break;
                case "remaining":
                    printCoffee();
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }
}
