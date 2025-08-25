import java.util.Scanner;

public class Clinic {

    public static String generatePetData(PetRecord petFile){
        return "\nPet id is " + petFile.getPetId() +
                "\nPet name is " + petFile.getPetName() +
                "\nPet kind: " + petFile.getPet().getClass().getSimpleName() +
                "\nCommunication sound: "+ petFile.getPet().makeSound() +
                "\nPlay mode: " + petFile.getPet().play();
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PetRecord petFile = new PetRecord();
        Pet pet;

        System.out.print("Welcome to the pet clinic!");
        int choice = 1;
        while(choice!=3) {
            System.out.print("\nPlease choose a pet type:" +
                    "\n[1] Dog" +
                    "\n[2] Cat"+
                    "\n[3] Exit"+
                    "\nChoose your pet number: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println(generatePetData(petFile) +
                            "\nBreed: " + ((Dog) pet).getBreed());

                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println(generatePetData(petFile) +
                            "\nNumber of lives: " + ((Cat) pet).getNoOfLives());
                    break;
                case 3:
                    System.out.print("Exiting Clinic...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}