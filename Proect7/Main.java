public class Main {
    public static void main(String[] args) {
       
        Model homePhone = new HomePhone("домашний", 235890);
        Model mobilPhone = new MobilPhone("мобильный", 89098002);
        Model videoPhone = new VideoPhone("мобильный с камерой", 256897777);
        User user = new User("Марина");
        user.callAnotherUser(235890,homePhone);
        user.callAnotherUser(89098002,mobilPhone);
        user.callAnotherUser(256897777,videoPhone);
        
        // ViewModel view = new ViewModel();
        // view.run();
    }
}
