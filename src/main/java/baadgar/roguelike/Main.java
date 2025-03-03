package baadgar.roguelike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}