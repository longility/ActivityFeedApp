package models;

import java.util.ArrayList;

import linkedIn.FeedItem;
import linkedIn.LinkedInService;
import facebook.FacebookService;
import facebook.WallPost;

public class MyActivityFeed {
	private final FacebookService facebookService;
	private final LinkedInService linkedInService;
	
	public MyActivityFeed(FacebookService facebookService,
			LinkedInService linkedInService) {
		super();
		this.facebookService = facebookService;
		this.linkedInService = linkedInService;
	}

	public ArrayList<WallPost> getFacebookPosts() {
		return facebookService.getWallPosts();
	}
	
	public ArrayList<FeedItem> getLinkedInFeed() {
		return linkedInService.getFeedItems();
	}
}
