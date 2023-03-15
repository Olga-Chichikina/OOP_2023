package homework.Proect3;

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
    public void speak() {
        speak("Добрый день!");
    }

    public void speak(String voice) {
        System.out.println(voice);
    }

    @Override
    public void eat(Integer meal) {
    }

    @Override
    public void reaction() {
     }

}
