package _7_11_23;

import _7_11_23.Child;

import java.util.Scanner;
public class Java {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());
        Child child = new Child(name, age);
        System.out.println(child.getName());
        System.out.println(child.getAge());

    }
}
