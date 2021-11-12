import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private String email;
    private int defaultPasswordLength;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //Constructor to receive first and last name

    //Ask for the department

    //Generate a random password

    //Set the mailbox capacity

    //Set the alternate email

    //change the password

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.defaultPasswordLength = 10;
        this.passWord = randomPassword(defaultPasswordLength);
        this.email = this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //call a method asking for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName + ". "+  "\nThe department codes: \n1 for Sales\n2 for Development\n3 for accounting\n0 for none\nEnter Code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1 ) { return "Sales";}
        else if (departmentChoice ==2) { return "Development";}
        else if (departmentChoice == 2) {return "Accounting";}
        else { return "";}
    }

    //call a method that returns a random password
    private String randomPassword (int passwordLength) {
        String passwordSet = "ABCDEFGHIKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[passwordLength]; //creating an array of character with parameter password length
        for (int i = 0; i < passwordLength; i++) {
           int rand = (int) (Math.random() * passwordSet.length()); //want a random number between 0-length
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the email capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    //change the password

    public void changePassword (String password) {
        this.passWord = password;
    }

    public String getPassword () {
        return this.passWord;
    }

    //set alternate email

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String showInfo () {
        return  "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: "  + this.email + "\n" +
                "MAILBOX CAPACITY: " +  mailBoxCapacity + " mb";
    }

    public String toString() {
         return "Your password is: " + this.passWord;
    }
}
