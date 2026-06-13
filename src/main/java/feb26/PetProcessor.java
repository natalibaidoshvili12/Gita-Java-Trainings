package feb26;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PetProcessor {

    private static final String FILE_NAME = "pets.txt";

    public static void writePets(List<Pet> pets) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(pets);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Pet> readPets() {
        List<Pet> pets = new ArrayList<>();

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            pets = (List<Pet>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return pets;
    }

    // სატესტო main
    public static void main(String[] args) {

        Owner owner = new Owner(
                "Nino",
                "Beridze",
                "01010101010",
                2
        );

        Pet pet1 = new Pet(3, "Bobby", owner, "PET-001");
        Pet pet2 = new Pet(5, "Max", owner, "PET-002");

        List<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);

        writePets(pets);

        List<Pet> loadedPets = readPets();

        for (Pet pet : loadedPets) {
            System.out.println(
                    pet.getName() + " | age: " + pet.getAge() +
                            " | owner: " + pet.getOwner().getFirstName()
            );
        }
    }
}

