package models.adapter.services;

import java.util.ArrayList;

import models.adapter.FeedItemAdapter;
import models.adapter.ServiceAdapter;
import models.adapter.items.WallPostAdapter;
import facebook.FacebookService;
import facebook.WallPost;

public class FacebookServiceAdapter implements ServiceAdapter {

	private final FacebookService facebookService;
	
	public FacebookServiceAdapter(FacebookService facebookService) {
		super();
		this.facebookService = facebookService;
	}

	@Override
	public ArrayList<FeedItemAdapter> getFeedItems() {
		ArrayList<FeedItemAdapter> feedItems = new ArrayList<FeedItemAdapter>();
		
		for (WallPost post : facebookService.getWallPosts()) {
			feedItems.add(new WallPostAdapter(post));
		}
	
		return feedItems;
	}

}
