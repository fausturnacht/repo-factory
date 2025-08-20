public class PetRecord{
    private String petID;
    private String petName;
    private Pet pet;

    public PetRecord(String petID, String petName, Pet pet) {
        this.petID = petID;
        this.petName = petName;
        this.pet = pet;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
    public Pet getPet() {
        return pet;
    }
}