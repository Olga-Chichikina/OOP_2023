package homework.Proect3;

public class Person {
    private String namePerson;

    public Person (String namePerson){
        this.namePerson = namePerson;
    }
   
    public String getNamePer() {
        return namePerson;
    }

    public void setNamePer(String namePer) {
        this.namePerson = namePer;
    }

    @Override
    public String toString() {
       return this.namePerson;
    }

    public String voice(){
        return this.namePerson + "говорит КИС-КИС" ;
    }
    public String voice1(){
        return this.namePerson + "гладит кошку" ;
    }
    }

