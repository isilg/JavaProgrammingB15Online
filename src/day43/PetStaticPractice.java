package day43;
public class PetStaticPractice {
    public static void main(String[] args) {

        Pet.showGeneralPetInfo();

        // Doesn't work because it is not static so need an object to call that method
        // Pet.getName();
        // How to make it work? Like below creating an object:
        Pet p1 = new Pet("cat","yumyum");
        System.out.println( p1.getName() );
        p1.speak();

    }
}
