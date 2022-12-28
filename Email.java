package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String departament;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "avycompany.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName +"" +this.lastName);	
		// Call a method asking for the department - return the department
		this.departament = setDepartment();
		System.out.println("Department: " + this.departament);
		
		// Call a method that returns a random password
		this.password = randomPassword(8);
		System.out.println("Your password is: "+ this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departament + "." + companySuffix; 
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accouting\n0 for none\nEnter the department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		if(depChoice == 2) {return "dev";}
		if(depChoice == 3) {return "acct";}
		else {return "";}
		
		
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet ="QWERTYUIOPASDFGHJKLZXCVBNM1234567890!$%*,.";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String (password);
	}

	// Set the mailbox capacity
	public void setMailBoxCapasity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate mail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity(){ return mailboxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	public void showInfo() {
		System.out.println( "DISPLAY NAME: " + firstName + lastName + "\nCOMPANY EMAIL:" + email + "\nMAILBOX CAPACITY: " + mailboxCapacity);
	}
}



