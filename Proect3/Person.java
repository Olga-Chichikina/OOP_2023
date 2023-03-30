package Proect3;

public class Person extends Animal {

    public Person(String name, Sex sex, int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void feed_to_cat(Animal cat, Integer meal) {//кормим кошку
        cat.eat(meal);//кошка есть
        System.out.println("Кошка поела");
    }

    public void petting_a_cat(Animal cat) {//ласкаем кошку
        cat.reaction(); 
        System.out.println("Ласкаем кошку");
    }

    public void call_cat(Animal cat) {//позвать кошку
        cat.speak();
        System.out.println(cat.name + " ты где?");
    }

    @Override
    public String speak() {
        return "Кис, кис, кис";
    }

    public void speak(String voice) {
        System.out.println(" Что случилось?");
    }

    @Override
    public void eat(Integer meal) {
    }

    @Override
    public void reaction() {
        System.out.println("Кис,кис");
     }

}
