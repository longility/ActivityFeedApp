package facebook;

import java.util.Date;

public class WallPost {
	private final Date postDate;
	private final String story;
	private final String user;
	public WallPost(Date postDate, String story, String user) {
		super();
		this.postDate = postDate;
		this.story = story;
		this.user = user;
	}
	public Date getPostDate() {
		return postDate;
	}
	public String getStory() {
		return story;
	}
	public String getUser() {
		return user;
	}
}
