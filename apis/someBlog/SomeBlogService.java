package someBlog;

import java.util.ArrayList;

public class SomeBlogService {
	private final static ArrayList<BlogPost> blogPosts =
			new ArrayList<BlogPost>();
	
	public ArrayList<BlogPost> getBlogPosts() {
		if(blogPosts.isEmpty())
			generateBlogPosts();
		return blogPosts;
	}
	
	private void generateBlogPosts() {
		for(int i=0; i<10; i++) {
			BlogPost blogPost = new BlogPost("Thu Sep 28 20:29:30 JST 2000", "Blog short message #" + i, "Author #" + i);
			blogPosts.add(blogPost);
		}
	}
}
