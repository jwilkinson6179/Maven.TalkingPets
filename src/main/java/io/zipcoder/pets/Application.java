package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.List;

public class Application {
    Console console;
    Integer petCount;
    List<Pet> pets;

    public Application()
    {
        console = new Console();
        pets = new ArrayList<Pet>();
    }

    public void askAboutPets()
    {
        petCount = Console.getIntegerInput("How many pets do you own?");

        for(Integer i = 0; i < petCount; i++)
        {
            Pet newPet = getPet(i);
            pets.add(newPet);

        }
    }

    public Pet getPet(Integer petNumber)
    {
        String petName = Console.getStringInput(String.format("What is pet #%s's name? ", petNumber + 1));
        Boolean validPet = false;
        Pet pet;

        while(validPet == false)
        {
            String petTypeInput = Console.getStringInput(String.format("Are they a cat, a dog, or a gorilla? ", petNumber + 1));

            if(petTypeInput.equalsIgnoreCase("cat"))
            {
                pet = new Cat(petName);
                validPet = true;
                return pet;
            } else if(petTypeInput.equalsIgnoreCase("dog"))
            {
                pet = new Dog(petName);
                validPet = true;
                return pet;
            } else if(petTypeInput.equalsIgnoreCase("gorilla"))
            {
                pet = new Gorilla(petName);
                validPet = true;
                return pet;
            }
        }

        return null;
    }

    public void petSoundOff()
    {
        for(Pet pet : pets)
        {
            Console.println(String.format("%s goes %s!", pet.getName(), pet.speak()));
        }
    }
}