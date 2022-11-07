public class Main {

    public static void main(String[] args) {
        AnimalPrinter animalPrinter = new AnimalPrinter();

        Dog dog = new Dog();
        dog.setName("Perro1");
        dog.setAge(5);
        animalPrinter.printAnimal(dog);

        Horse horse = new Horse();
        horse.setName("Caballo1");
        horse.setAge(5);
        animalPrinter.printAnimal(horse);

        Whale whale = new Whale();
        whale.setName("Ballena1");
        whale.setAge(5);
        animalPrinter.printAnimal(whale);
    }
}
