package models;

import java.util.ArrayList;

import models.adapter.FeedItemAdapter;
import models.adapter.ServiceAdapter;

public class MyActivityFeed {
	private final ArrayList<ServiceAdapter> services = new ArrayList<ServiceAdapter>();
	
	public void AddService(ServiceAdapter service) {
		services.add(service);
	}

	public ArrayList<FeedItemAdapter> getFeedItems() {
		ArrayList<FeedItemAdapter> feedItems = new ArrayList<FeedItemAdapter>();
		
		for (ServiceAdapter service : services) {
			feedItems.addAll(service.getFeedItems());
		}
		
		return feedItems;
	}
}
