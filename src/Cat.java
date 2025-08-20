public class Cat implements Pet{
    private int noOfLives;

    @Override
    public String makeSound(){
        return "Meow!";
    }

    @Override
    public String play(){
        return "*scratches you*";
    }

}