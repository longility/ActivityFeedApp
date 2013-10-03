package linkedIn;

import java.util.Date;

public class FeedItem {
	private final String user;
	private final Date postDate;
	private final String message;
	
	public FeedItem(String user, Date postDate, String message) {
		super();
		this.user = user;
		this.postDate = postDate;
		this.message = message;
	}
	public String getUser() {
		return user;
	}
	public Date getPostDate() {
		return postDate;
	}
	public String getMessage() {
		return message;
	}
}
