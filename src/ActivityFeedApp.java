import java.text.DateFormat;
import java.util.Date;

import linkedIn.FeedItem;
import linkedIn.LinkedInService;
import models.MyActivityFeed;
import facebook.FacebookService;
import facebook.WallPost;


public class ActivityFeedApp {

	private static DateFormat dateFormat = DateFormat.getInstance();
	public static void main(String[] args) {
		MyActivityFeed feed = new MyActivityFeed(new FacebookService(), new LinkedInService());
		
		printFacebookPosts(feed);
		printLinkedInFeed(feed);
	}

	private static void printLinkedInFeed(MyActivityFeed feed) {
		for (WallPost post : feed.getFacebookPosts()) {
			printFeedItem(post.getUser(), post.getStory(), post.getPostDate());
		}
	}

	private static void printFacebookPosts(MyActivityFeed feed) {
		for (FeedItem item : feed.getLinkedInFeed()) {
			printFeedItem(item.getUser(), item.getMessage(), item.getPostDate());
		}	
	}

	public static void printFeedItem(String user, String message, Date date) {
		System.out.println(message + "\tby " + user + "\ton " + dateFormat.format(date));
	}

}
