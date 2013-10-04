package models.adapter.services;

import java.util.ArrayList;

import linkedIn.FeedItem;
import linkedIn.LinkedInService;
import models.adapter.FeedItemAdapter;
import models.adapter.ServiceAdapter;
import models.adapter.items.LinkedInFeedItemAdapter;

public class LinkedInServiceAdapter implements ServiceAdapter {

	private final LinkedInService linkedInService;
	
	public LinkedInServiceAdapter(LinkedInService linkedInService) {
		super();
		this.linkedInService = linkedInService;
	}

	@Override
	public ArrayList<FeedItemAdapter> getFeedItems() {
		ArrayList<FeedItemAdapter> feedItems = new ArrayList<FeedItemAdapter>();
		
		for (FeedItem feedItem : linkedInService.getFeedItems()) {
			feedItems.add(new LinkedInFeedItemAdapter(feedItem));
		}
	
		return feedItems;
	}

}
