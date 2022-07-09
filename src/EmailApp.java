// Create instance of Email class

public class EmailApp {
    
    public static void main(String[] args) {
        Email email1 = new Email("Frank", "Major");

        email1.setAltEmail("fsharpmajor@gmail.com");
        email1.setMailboxCapacity(200);
        email1.setPassword("g3taW4Y!");
        email1.showInfo();
    }
}
