
package practice;
public enum Animals {
    DOG("멍멍이"), CAT("냐옹이"), BIRD("참새");

    private final String animalName;

    Animals(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return this.animalName;
    }


    // Main
    public static void main(String[] args) {

        Animals animal = Animals.CAT;

        System.out.println(animal.compareTo(Animals.DOG));
    }
}

