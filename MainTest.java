import java.io.IOException;
import java.util.List;

public class MainTest {
	public static void main(String[] args) throws IOException {
		Parser parser = new Parser();
		List<Bookmark> bookmarkList = parser.populateBookmarkList();
		for (Bookmark bookmark : bookmarkList) {
			System.out.println(bookmark.getName());
			System.out.println(bookmark.getUrl());
		}
		BookmarkDB db = new BookmarkDB();
		db.saveBookmarksToDB(bookmarkList);
		
	}
}
