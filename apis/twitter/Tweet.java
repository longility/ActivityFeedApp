package twitter;

import java.util.Date;

public class Tweet {
	private final TwitterUser user;
	private final String message;
	private final Date tweetDate;
	public Tweet(TwitterUser user, String message, Date tweetDate) {
		super();
		this.user = user;
		this.message = message;
		this.tweetDate = tweetDate;
	}
	public TwitterUser getUser() {
		return user;
	}
	public String getMessage() {
		return message;
	}
	public Date getTweetDate() {
		return tweetDate;
	}
}
