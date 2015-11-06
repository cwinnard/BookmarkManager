import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookmarkDB {
	String driver = "com.mysql.jdbc.Driver";
	String connection = "jdbc:mysql://localhost:3306/testerizer";
	String user = "root";
	String password = "sesame";
	
	public int saveBookmarksToDB(List<Bookmark> bookmarks) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String statementString = "Insert into BookmarksTest (BookmarkName, BookmarkURL, UserIDLink) Values (?,?,?)";
		
		try {
			Connection con = DriverManager.getConnection(connection, user, password);
			PreparedStatement addBookmarksToBookmarkTable = con.prepareStatement(statementString);
			for (Bookmark bookmark : bookmarks) {
				addBookmarksToBookmarkTable.setString(1, bookmark.getName());
				addBookmarksToBookmarkTable.setString(2, bookmark.getUrl());
				addBookmarksToBookmarkTable.setString(3, "1");
			int rowsAdded = addBookmarksToBookmarkTable.executeUpdate();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
}

