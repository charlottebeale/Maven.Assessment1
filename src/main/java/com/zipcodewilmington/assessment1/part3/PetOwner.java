package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    public String name;
    public Pet[]pets;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if(pets != null) {
            for(Pet pet: pets);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets == null) {
            this.pets = new Pet[0];
            Pet[]newPetArray = new Pet[pets.length + 1];
            for(int i = 0; i < pets.length; i++) {
                newPetArray[i] = pets[i];
            }
            newPetArray[newPetArray.length - 1] = pet;
            this.pets = newPetArray;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet[]newPetArray = new Pet[pets.length -1];
        if(newPetArray.length == 0){
            this.pets = null; }
        else {
            for(int i = 0; i < pets.length; i++) {
                if(!pets[i].equals(pet)) {
                    newPetArray[i++] = pets[i];
                }
            }
            this.pets = newPetArray;
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean owner = false;
        for(Pet p : pets) {
            if(p.equals(pet)) {
                owner = true;
            }
        }
        return owner;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = pets[0].getAge();
        for(Pet p : pets) {
            if(p.getAge() <= youngestAge) {
                youngestAge = p.getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = pets[0].getAge();
        for(Pet p : pets) {
            if(p.getAge() > oldestAge) {
                oldestAge = p.getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0f;
        for(Pet pet : pets) {
            sum +=pet.getAge();
        }
        return sum/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        for(Pet p : pets) {
            System.out.println(p);
        }
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
