public abstract class Human {

    String fullName;
    String age;
    Sex sex;

    public Human (String fullName, String age, Sex sex) {
        this.fullName = fullName;
        this.age = age ;
        this.sex = sex;
    }
    
    public Sex getSex() {
        return sex;
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
