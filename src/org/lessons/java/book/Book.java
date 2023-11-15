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
		public void setTitle(String title) {
			
//			Try and catch
			try {
				if(title.isEmpty() || title == null) {
					throw new Exception("Errore: Il titolo non può essere nullo o vuoto");
				}
				this.title = title;
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
			
		}

//		PAGE NUMBER
		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
//			Try and catch
			try {
				if(pageNumber <= 0) {
					throw new Exception("Errore: Il numero di pagine non può essere zero o inferiore");
				}
				this.pageNumber = pageNumber;
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}

		
//		AUTHOR
		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
//			Try and catch
			try {
				if(author.isEmpty() || author == null) {
					throw new Exception("Errore: L'autore non può essere nullo o vuoto");
				}
				this.author = author;
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}

		
//		EDITOR
		public String getEditor() {
			return editor;
		}

		public void setEditor(String editor) {
//			Try and catch
			try {
				if(editor.isEmpty() || editor == null) {
					throw new Exception("Errore: L'editore non può essere nullo o vuoto");
				}
				this.editor = editor;
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
}
