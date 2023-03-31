public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, Model phone){
        phone.call(number);
    }
    public String getName() {
        return name;
    }
}
 

