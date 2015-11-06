
public class Bookmark {
	public String url;
	public String name;
	public String topic;
	public int bookmarkID;
	
	public Bookmark() {}
	public Bookmark(String url, String name, String topic, int bookmarkID) {
		this.url = url;
		this.name = name;
		this.topic = topic;
		this.bookmarkID = bookmarkID;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getBookmarkID() {
		return bookmarkID;
	}

	public void setBookmarkID(int bookmarkID) {
		this.bookmarkID = bookmarkID;
	}

}
