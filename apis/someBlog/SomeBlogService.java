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
			BlogPost blogPost = new BlogPost("12/1/2013", "Blog short message #" + i, "Author #" + i);
			blogPosts.add(blogPost);
		}
	}
}
