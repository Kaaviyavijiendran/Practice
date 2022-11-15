package com.chainsys.day2;

public class TestBookDay2 {
public static void main(String [] args) {
	
	    BookDay2 book = new BookDay2();
	    book.bookNum = 124;
	    book.yearofPublished = 1999;
		book.bookName = "Agnisiragukal";
		book.authorName = "Abdulkalam";
		book.bookPrice = 340.0;
		book.language = 'T';
		book.available = true;
		
		System.out.println(book.bookNum);
		System.out.println(book.bookName);
		System.out.println(book.authorName);
		System.out.println(book.bookPrice);

}
}

