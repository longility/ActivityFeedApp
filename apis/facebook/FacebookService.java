package facebook;

import java.util.ArrayList;
import java.util.Date;


public class FacebookService {
	private final static ArrayList<WallPost> wallPosts =
			new ArrayList<WallPost>();
	
	public ArrayList<WallPost> getWallPosts() {
		if(wallPosts.isEmpty())
			generateWallPosts();
		return wallPosts;
	}
	
	private void generateWallPosts() {
		for(int i=0; i<10; i++) {
			WallPost wallPost = new WallPost(new Date(), "Facebook message #" + i, "Facebook user #" + i);
			wallPosts.add(wallPost);
		}
	}
}
