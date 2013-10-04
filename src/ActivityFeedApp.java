import java.text.DateFormat;
import java.util.Date;

import linkedIn.LinkedInService;
import models.MyActivityFeed;
import models.adapter.FeedItemAdapter;
import models.adapter.services.FacebookServiceAdapter;
import models.adapter.services.LinkedInServiceAdapter;
import models.adapter.services.SomeBlogServiceAdapter;
import someBlog.SomeBlogService;
import facebook.FacebookService;


public class ActivityFeedApp {

	private static DateFormat dateFormat = DateFormat.getInstance();
	public static void main(String[] args) {
		MyActivityFeed feed = new MyActivityFeed();
		feed.AddService(new FacebookServiceAdapter(new FacebookService()));
		feed.AddService(new LinkedInServiceAdapter(new LinkedInService()));
		feed.AddService(new SomeBlogServiceAdapter(new SomeBlogService()));
		
		printFeed(feed);
	}

	private static void printFeed(MyActivityFeed feed) {
		for (FeedItemAdapter feedItem : feed.getFeedItems()) {
			printFeedItem(feedItem.getUser(), feedItem.getMessage(), feedItem.getPostDate());
		}
	}

	public static void printFeedItem(String user, String message, Date date) {
		System.out.println(message + "\tby " + user + "\ton " + dateFormat.format(date));
	}

}
