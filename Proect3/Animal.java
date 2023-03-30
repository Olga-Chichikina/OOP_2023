package Proect3;

/**
 * Класс животных
 */
public abstract class Animal implements Action {

    protected String name;
    protected int age;
    Sex sex;
    
    String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    

}
