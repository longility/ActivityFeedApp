package twitter;

public class TwitterUser {
	private final String userName;
	private final String name;
	
	public TwitterUser(String userName, String name) {
		super();
		this.userName = userName;
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public String getName() {
		return name;
	}
	
	
}
