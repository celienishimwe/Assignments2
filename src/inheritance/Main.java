package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("please Enter the name of animal:");
        String name = user_input.nextLine();
        Animal animal = new Animal(name);
        animal.makeSound();
        Birds bird = new Birds(name);
        bird.animalName();
        bird.makeSound();
        bird.Fly();
    }
}
