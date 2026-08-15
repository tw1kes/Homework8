//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println( i + " год является високосным");
        }

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int increase = 29000;
        int capital = 0;
        for (int i = 1; i <= 12; i ++) {
            capital = capital + increase;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital + " рублей");
        }

        int increase1 = 29000;
        int capital1 = 0;
        for (int i = 1; i <= 12; i ++) {
            capital1 = capital1 + capital1/100;
            capital1 = capital1 + increase1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital1 + " рублей");
        }

        int two = 2;
        int total = 0;
        for (int i = 2; i <=20; i = i + 2) {
            total = total + 1;
            System.out.println(two + "*" + total + "=" + i);
        }




    }
}