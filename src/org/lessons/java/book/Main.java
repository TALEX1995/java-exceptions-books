package org.lessons.java.book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Quanti libri vuoi aggiungere");
		String bookCount = in.nextLine();
		int intBookCount = Integer.parseInt(bookCount);

		Book[] books = new Book[intBookCount];

		int booksIndex = 0;

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

				Book b = new Book(title, intPageNumber, author, editor);

				books[booksIndex++] = b;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
		for(int i = 0; i < books.length; i++) {
			System.out.println("Libro numero: " + (i + 1));
			System.out.println(books[i]);
			System.out.println("\n---------------------------------\n");
		}
		
		in.close();

	}

}
