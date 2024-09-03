package BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		Book b1 =  new Book("Atomic Habits","Dibya Kumar");
		Book b2 =  new Book("Atomic","Dibya Kumar");
		Book b3 =  new Book("Habits","Dibya Kumar");
		Book b4 =  new Book("Atomics","Dibya Kumar");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		Library library = new Library(books);
		
		Iterator createIterator = library.createIterator();
		
		while(createIterator.hasNext()) {
			System.out.println(createIterator.next());
		}
		
	}
}
