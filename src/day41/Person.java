package day41;

public class Person {

    private String name;
    private int age;
    private long ssn;


    // What if I want to get only name
    public String getName(){
        return name;
    }


    //What if I want to change the name
    public void setName(String newName){
       name = newName;
    }

    // If I wanna get the age:
    // Return tyoe is int cause age's type is int
    public int getAge(){
        return age;
    }


    // If I want to change age
    public void setAge(int newAge){
        age = newAge;
    }

    public long getSsn(){
        return ssn;
    }


    public void setSsn(long newSsn){
        ssn = newSsn;
    }


    // Write a method to give value to field
    // I have 3 attributes I declared at the beginning so i have 3 parameters here
    public void setAll(String newName, int newAge, long newSsn){
        //Set the value
        name = newName;
        age = newAge;
        ssn = newSsn;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
