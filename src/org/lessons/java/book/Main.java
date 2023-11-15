package org.lessons.java.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	// MY FILE
	static final File booksFile = new File("C:\\Users\\tanas\\eclipse-workspace\\java-exceptions-books\\Books.txt");

	public static void main(String[] args) {

//		BOOKS ARRAY WITH TRY CATCH
		Scanner in = new Scanner(System.in);

//		Request how many books user want
		System.out.println("Quanti libri vuoi aggiungere");
		String bookCount = in.nextLine();
		int intBookCount = Integer.parseInt(bookCount);

//		Initialize books array
		Book[] books = new Book[intBookCount];

		int booksIndex = 0;

//		Cicle to add book in books array
		while (booksIndex < intBookCount) {

			System.out.println("Inserisci il titolo del " + (booksIndex + 1) + " libro");
			String title = in.nextLine();

			System.out.println("Inserisci il numero di pagine del " + (booksIndex + 1) + " libro");
			String pageNumber = in.nextLine();
			int intPageNumber = Integer.parseInt(pageNumber);

			System.out.println("Inserisci l'autore del " + (booksIndex + 1) + " libro");
			String author = in.nextLine();

			System.out.println("Inserisci l'editore del " + (booksIndex + 1) + " libro");
			String editor = in.nextLine();

			try {

//				New Book
				Book b = new Book(title, intPageNumber, author, editor);

//				Increment index and insert book in books array
				books[booksIndex++] = b;

			} catch (Exception e) {
//				Print Error
				System.out.println(e.getMessage());
			}
		}

//		Cicle to print every book
		for (int i = 0; i < books.length; i++) {
			System.out.println("Libro numero: " + (i + 1));
			System.out.println(books[i]);
			System.out.println("\n---------------------------------\n");
		}

		in.close();

//		WRITE BOOKS IN FILE	
		FileWriter myWriter = null;

		try {
			myWriter = new FileWriter(booksFile);

			for (int i = 0; i < books.length; i++) {
				Book b = books[i];

				myWriter.write(b + "\n-----------------------\n");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {

			if (myWriter != null)
				try {
					myWriter.close();
				} catch (IOException e) {
				}
		}

//		READ BOOKS IN FILE

		Scanner reader = null;

		try {

			reader = new Scanner(booksFile);
			
			System.out.println("Libri letti direttamente dal file \n");

			while (reader.hasNextLine()) {
				String data = reader.nextLine();

				System.out.println(data);
			}

		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		} finally {	
			
			if (reader != null)
				reader.close();
			
		}

	}
}
