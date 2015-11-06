import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {
	
	public List<Bookmark> populateBookmarkList() throws IOException {
		ArrayList<Bookmark> bookmarkList = new ArrayList<Bookmark>();
		Path htmlPath = Paths.get("WebContent/Bookmarks.html");
		File htmlFile = htmlPath.toFile();
		
		StringBuilder fullHTML = new StringBuilder();
		BufferedReader htmlReader = new BufferedReader(new FileReader(htmlFile));
		
		String line;
		while ((line = htmlReader.readLine()) != null) {
			fullHTML.append(line);
		}
		htmlReader.close();
		
		String html = fullHTML.toString();
		String[] individualHTMLs = html.split("<DT>");
		
		for (String eachHTML : individualHTMLs) {
			
			if (eachHTML.startsWith("<A HREF")) {
				Document doc = Jsoup.parse(eachHTML);
				Element link = doc.select("a").first();
			
				String linkHref = link.attr("href");
				String linkText = link.text();
			
				Bookmark bookmark = new Bookmark();
				bookmark.setName(linkText);
				bookmark.setUrl(linkHref);
				
				bookmarkList.add(bookmark);
			}
		}
		return bookmarkList;
	}
}
