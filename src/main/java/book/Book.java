package book;

public class Book {
	private final String author, title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return "Book(" + author + "," + title + ")";
	}
}
