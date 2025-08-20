public class Dog implements Pet{
    private String breed;

    @Override
    public String makeSound(){
        return "Aw!";
    }

    @Override
    public String play(){
        return "*plays fetch with you*";
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}