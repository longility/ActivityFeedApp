package models.adapter.services;

import java.util.ArrayList;

import models.adapter.FeedItemAdapter;
import models.adapter.ServiceAdapter;
import models.adapter.items.BlogPostAdapter;
import someBlog.BlogPost;
import someBlog.SomeBlogService;

public class SomeBlogServiceAdapter implements ServiceAdapter {

	private final SomeBlogService someBlogService;
	
	public SomeBlogServiceAdapter(SomeBlogService someBlogService) {
		super();
		this.someBlogService = someBlogService;
	}

	@Override
	public ArrayList<FeedItemAdapter> getFeedItems() {
		ArrayList<FeedItemAdapter> feedItems = new ArrayList<FeedItemAdapter>();
		
		for (BlogPost post : someBlogService.getBlogPosts()) {
			feedItems.add(new BlogPostAdapter(post));
		}
	
		return feedItems;
	}

}
