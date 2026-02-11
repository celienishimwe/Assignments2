package inheritance;

public class Birds extends Animal {

    public Birds(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("bird chirp");
    }

    public void Fly(){
        System.out.println("All birds flying");
    }
}
