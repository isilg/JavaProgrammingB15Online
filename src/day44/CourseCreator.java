package day44;
public class CourseCreator {
    public static void main(String[] args) {

        // Short cut Course.counter.soutv
        // Static field i nasil cagiririz? =>  Class_name.static_field_name
        System.out.println("Course.counter = " + Course.counter);


        Course c1 = new Course("Java", "foundation");
        System.out.println("counter after created c1 object(c1.counter): "+c1.counter);

        Course c2 = new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Webservices");
        Course c5 = new Course("Agile", "Soft Skills");
        System.out.println("counter after created c5 object(c5.counter): " + c5.counter);
    }
}
