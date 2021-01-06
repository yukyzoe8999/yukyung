package Java_0105;

import java.util.Scanner;

public class Book_contacts {
	private Book contacts[];
	private int count;

	public Book_contacts() {
		this.contacts = new Book[5];
		this.count = 0;
	}
	
	public Book back(int count) {
		return contacts[count];
	}
	public void sett(String name, String number, String mail) {
		Book num_book = new Book();
		
		num_book.setName(name);
		num_book.setNumber(number);
		num_book.setMail(mail);
		
		contacts[count] = num_book;
	    count++;
	}
	public int size() {
		return count;
	}

	
}
