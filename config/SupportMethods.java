package config;

import collection.AnimalsCollection;
import creature.*;
import exception.AnimalCreationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SupportMethods {

    private AnimalsCollection animalsCollection;

    public SupportMethods(){
    }

    public SupportMethods(AnimalsCollection animalsCollection) {
        this();
        this.animalsCollection = animalsCollection;
    }

    public int chooseNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Incorrect input, try again");
        }
        return chooseNumber();
    }

    public Animal animalCreation() {

        String name, birth, command;
        double weight;
        int liftingCapacity;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please choose number of Animal to create and press Enter");
        System.out.println(" 1. Cat, 2. Dog, 3. Hamster, 4. Horse, 5. Camel, 6. Donkey");

        try {

            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1,2,3 -> {
                    System.out.println("Insert name");
                    name = sc.next();
                    System.out.println("Insert birthdate in format yyyy-mm-dd");
                    birth = sc.next();
                    System.out.println("Insert weight");
                    weight = sc.nextDouble();
                    System.out.println("Insert command it knows");
                    command = sc.next();

                    if (userChoice == 1){
                        return new Cat(name,birth,weight,command);
                    } else if (userChoice == 2) {
                        return new Dog(name,birth,weight,command);
                    }else return new Hamster(name, birth, weight, command);

                }
                case 4,5,6 -> {
                    System.out.println("Insert name");
                    name = sc.next();
                    System.out.println("Insert birthdate in format yyyy-mm-dd");
                    birth = sc.next();
                    System.out.println("Insert lifting capacity");
                    liftingCapacity = sc.nextInt();
                    System.out.println("Insert command it knows");
                    command = sc.next();

                    if (userChoice == 4){
                        return new Horse(name,birth,liftingCapacity,command);
                    } else if (userChoice == 5) {
                        return new Camel(name,birth,liftingCapacity,command);
                    }else return new Donkey(name, birth, liftingCapacity, command);
                }

                default ->
                        System.err.println("Incorrect number, try again");
            }

        }catch (AnimalCreationException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
