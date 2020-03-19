package com.company;
import java.util.Scanner;

// 3. Sa se creeze o clasa java care seteaza printr-un contor 2 tipuri
// de date si le returneaza folosind metodele getter.

public class Main {

    public static void main(String[] args) {
        Contor name = new Contor();
        Contor age = new Contor();

        System.out.println("Introdu numele tau:");
        Scanner scanner_name = new Scanner(System.in);
        String input_name = scanner_name.nextLine();
        name.setName(input_name);

        System.out.println("Introdu varsta ta:");
        Scanner scanner_age = new Scanner(System.in);
        int input_age = scanner_age.nextInt();
        age.setAge(input_age);

        System.out.print("Numele tau este " + name.getName() + " si ai " + age.getAge() + " ani.");
    }
}
