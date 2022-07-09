import java.util.Scanner;

// Email class

public class Email {

    // define private variables
    private String firstName;
    private String lastName;
    private String department;

    private String email;
    private String password;
    private String altEmail;
    private int mailboxCapacity = 500;

    private int defaultPassLength = 10;
    private String companySuffix = "potato.com";

    // class constructor
    public Email(String firstName, String lastName) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("CREATING EMAIL FOR: " + firstName + " " + lastName);

        // ask for department by calling method
        this.department = setDepartment();

        // create email from above info
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + this.companySuffix;
        System.out.println("EMAIL HAS BEEN CREATED: " + this.email);

        // generate random password by calling method
        this.password = randomPassword(defaultPassLength);
        System.out.println("YOUR PASSWORD: " + this.password);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    
    // method to set department
    private String setDepartment() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Departments:");
        System.out.println("1. HR");
        System.out.println("2. Marketing");
        System.out.println("3. Finance");
        System.out.println("4. IT");
        System.out.println("5. Operations");
        System.out.println("0. None");

        System.out.print("CHOOSE DEPARTMENT CODE: ");
        int code = scan.nextInt();
        scan.close();

        String department = "";

        switch (code) {
            case 1: department = "hr."; break;
            case 2: department = "marketing."; break;
            case 3: department = "finance."; break;
            case 4: department = "it."; break;
            case 5: department = "operations."; break;
            case 0: department = "";
        }

        return department;
    }

    // method to generate random password
    private String randomPassword(int length) {
        String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@£&?%#";
        
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int a = (int) (Math.random() * passSet.length());
            password[i] = passSet.charAt(a);
        }

        return String.valueOf(password);
    }

    // method to change password
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Setting password...");
    }

    // method to change mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
        System.err.println("Setting mailbox capacity...");
    }

    // method to change alternate email
    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
        System.err.println("Setting alternate email...");
    }

    // method to show information
    public void showInfo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Mailbox Capacity: " + this.mailboxCapacity);
        System.out.println("Alternate Email: " + this.altEmail);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    
}
