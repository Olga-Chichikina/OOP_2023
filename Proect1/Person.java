public class Person {
    public String fullName;
    public String age;

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age ;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
