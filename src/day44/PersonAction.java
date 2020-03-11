package day44;
public class PersonAction {
    public static void main(String[] args) {

        Person p1 = new Person("Jon Snow",27);
        p1.species = "Human";
        System.out.println("p1= "+p1);

        Person p2 = new Person("Arya Stark", 18);
        System.out.println("p2= "+p2);

        // species ine bisey yazmadim ama human gorunuyor neden?
        // species static. sadece p1 e atamam yeterli diger tum
        // object lerinde species i human olur otomatikman
        Person p3 = new Person("Dani", 25);
        System.out.println("p3= "+p3);

        // Bu code u calistirirsam otomatikman Person template indeki
        // Person constructor calisir ve isimlerle yaslar set edilir.
        // Sonra toString() method calisir ve sout ile ekrana yazdirirsam
        // object lerin isim ve yaslarini gorurum

        // *******P2 NUN SPECIES INI HUMANOID E DEGISTIRIRSEM NE OLUR?
        // P1 DEGISMEZ HUMAN KALIR AMA P2 VE P2 DAN SONRAKI TUM OBJECT
        // LERIN SPECIES LERI HUMANOID OLARAK DEGISIR!!!******

        // ******What is the correct way to access static member of the class: STATIC WAY!!
        // What is the static way =>> Class_name.static_field_name ********
        System.out.println("Person.species= "+Person.species);

    }
}
