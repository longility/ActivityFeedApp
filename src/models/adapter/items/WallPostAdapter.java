package models.adapter.items;

import java.util.Date;

import models.adapter.FeedItemAdapter;
import facebook.WallPost;

public class WallPostAdapter implements FeedItemAdapter {

	private final WallPost wallPost;

	public WallPostAdapter(WallPost wallPost) {
		super();
		this.wallPost = wallPost;
	}

	@Override
	public String getMessage() {
		return wallPost.getStory();
	}

	@Override
	public Date getPostDate() {
		return wallPost.getPostDate();
	}

	@Override
	public String getUser() {
		return wallPost.getUser();
	}

}
