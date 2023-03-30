package Proect3;

    public class Cat extends Animal {

    /**
     * @param name - кличка
     * @param sex  - пол
     * @param age  - возраст
     */
    public Cat(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Реакция на ласку
     */
    public void reaction() {
        speak("Мур-Мур-Мур");
    }

    public String search_person(Animal Person) {//кошка ищет хозяина
        Person.reaction(); 
        return "на диване";
    }

    public void call_person(Animal Person) {//кошка зовет человека
        Person.speak();
        System.out.println(Person.name + "  увидел кошку , бегущую за мышкой");
    }


    @Override
    public String speak() {
        return "Мяу!";
    }

    public void speak(String voice) {
        System.out.println(voice);
    }

    @Override
    public void eat(Integer meal) {
        speak("Мурррр!!!!");
    }

    public void viewParamCat() {
        System.out.printf( this.name, this.sex, this.age);
    }

}
