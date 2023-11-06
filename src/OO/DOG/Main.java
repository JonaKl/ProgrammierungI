package OO.DOG;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Neapolitan Mastiff", 50, 5, "Black");
        dogs[1] = new Dog("Maltese", 20, 2, "White");
        dogs[2] = new Dog("Chow Chow", 30, 3, "Brown");

        for(Dog dog : dogs) {
            System.out.println(dog.getBreed());
        }
        for (Dog dog: dogs){
            System.out.println(dog);
        }
        for (Dog dog: dogs){
            if(dog.getColor().equalsIgnoreCase("Black")||dog.getColor().equalsIgnoreCase("schwarz")){
                System.out.println(dog);
            }
        }
    }
}
