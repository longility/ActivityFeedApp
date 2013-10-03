package linkedIn;

import java.util.ArrayList;
import java.util.Date;

public class LinkedInService {
	private final static ArrayList<FeedItem> feedItems =
			new ArrayList<FeedItem>();
	
	public ArrayList<FeedItem> getFeedItems() {
		if(feedItems.isEmpty())
			generateFeedItems();
		return feedItems;
	}
	
	private void generateFeedItems() {
		for(int i=0; i<10; i++) {
			FeedItem item = new FeedItem("LinkedIn user #" + i, new Date(), "LinkedIn message #" + i);
			feedItems.add(item);
		}
	}
}
