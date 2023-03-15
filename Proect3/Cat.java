package homework.Proect3;

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

    @Override
    public void speak() {
        this.speak("Мяу!");
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
