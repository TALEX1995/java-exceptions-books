package org.lessons.java.book;

public class Book {

		private String title;
		private int pageNumber;
		private String author;
		private String editor;
		
		public Book(String title, int pageNumber, String author, String editor) throws Exception {
			setTitle(title);
			setPageNumber(pageNumber);
			setAuthor(author);
			setEditor(editor);
		}

//		TITLE
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) throws Exception {
			

				if(title.isEmpty() || title == null) {
					throw new Exception("Errore: Il titolo non può essere nullo o vuoto");
				}
				this.title = title;	
		}

//		PAGE NUMBER
		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) throws Exception {


				if(pageNumber <= 0) {
					throw new Exception("Errore: Il numero di pagine non può essere zero o inferiore");
				}
				this.pageNumber = pageNumber;
		}

		
//		AUTHOR
		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) throws Exception {
			
				if(author.isEmpty() || author == null) {
					throw new Exception("Errore: L'autore non può essere nullo o vuoto");
				}
				this.author = author;
		}

		
//		EDITOR
		public String getEditor() {
			return editor;
		}

		public void setEditor(String editor) throws Exception {

				if(editor.isEmpty() || editor == null) {
					throw new Exception("Errore: L'editore non può essere nullo o vuoto");
				}
				this.editor = editor;

		}
		
		@Override
		public String toString() {
		
		return "Titolo: " + title
				+ "\nNumero pagine: " + pageNumber
				+ "\nAutore: " + author
				+"\nEditore: " + editor;
		}
}
