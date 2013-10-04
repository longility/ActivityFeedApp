package models.adapter.items;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import models.adapter.FeedItemAdapter;
import someBlog.BlogPost;

public class BlogPostAdapter implements FeedItemAdapter {

	private final BlogPost blogPost;
	
	public BlogPostAdapter(BlogPost blogPost) {
		super();
		this.blogPost = blogPost;
	}

	@Override
	public String getMessage() {
		return blogPost.getShortMessage();
	}

	@Override
	public Date getPostDate() {
		try {
		    DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH); 
			return dateFormat.parse(blogPost.getPublishDate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getUser() {
		return blogPost.getAuthor();
	}
	
}
