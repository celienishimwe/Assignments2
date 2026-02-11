package inheritance;

public class Animal {

    private String name;

    public  Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("all animals make sound");
    }

    public void animalName(){
        System.out.println("this is animal"+ " " + name);
    }
}
