public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Animal animal = null;
        animal = factory.getAnimal("dog");
        animal.eat();
        animal.sport();

    }
}
