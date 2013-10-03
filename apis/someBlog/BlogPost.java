package someBlog;


public class BlogPost {
	private final String publishDate;
	private final String shortMessage;
	private final String author;
	
	public BlogPost(String publishDate, String shortMessage, String author) {
		super();
		this.publishDate = publishDate;
		this.shortMessage = shortMessage;
		this.author = author;
	}
	
	public String getPublishDate() {
		return publishDate;
	}
	public String getShortMessage() {
		return shortMessage;
	}
	public String getAuthor() {
		return author;
	}
}
