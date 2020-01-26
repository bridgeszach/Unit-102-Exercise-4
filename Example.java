public class Example {
    public static void main(String[] args) {
        Student s1 = new Student("Zach", 35, 7);
        Student s2 = new Student("Eli", 25, 7);
        Student s3 = new Student("Alexander", 28, 7);
        // User u1 = new User("Alexander", 28);
        Animal a1 = new Animal("Machiato", "Dog");
        Animal a2 = new Animal("Eastern Timber", "Wolf");
        Animal a3 = new Animal("Jigglypuff", "Fairy");

        // s1.studentDisplay();

        a1.attack(s1);
        a2.attack(s1);
        a3.attack(s3);
        a2.attack(s2);
    }
}