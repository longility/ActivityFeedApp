package models.adapter.items;

import java.util.Date;

import linkedIn.FeedItem;
import models.adapter.FeedItemAdapter;

public class LinkedInFeedItemAdapter implements FeedItemAdapter {

	private final FeedItem feedItem;
	
	public LinkedInFeedItemAdapter(FeedItem feedItem) {
		super();
		this.feedItem = feedItem;
	}

	@Override
	public String getMessage() {
		return feedItem.getMessage();
	}

	@Override
	public Date getPostDate() {
		return feedItem.getPostDate();
	}

	@Override
	public String getUser() {
		return feedItem.getUser();
	}
	
}
