package socialNetwork;

import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;



public abstract class News {

	private String author;
	private Instant timestamp;
	private int likes;
	private ArrayList <String> comments;
	
	public News() {
		this.timestamp = Instant.now();
		this.likes = 0;
		this.comments = new ArrayList<>();
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	
	public String toString() {
		return "Beitrag: \n" + 
				"\t Benutzername des Autors: " + this.author + "\n" +
				"\t Zeitstempel: " + this.timestamp + "\n" +
				"\t Anzahl Likes: " + this.likes + "\n" +
				"\t Kommentare: " + this.comments + "\n";
	}
	
	public abstract void addLikes();
	
	
	/**
	 * Method adds a comment to a post
	 * @param comment
	 */
	public void addCommentary(String comment) {
		this.comments.add(comment);
	}
	
	
	/**
	 * Method calculates a time between the post reales and now.
	 * @param n is the news you want to check
	 */
	public void uploadDate(News n) {
		Instant start = n.getTimestamp(); 
		Instant end = Instant.now();
		
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: " + timeElapsed.toMillis() + " Milliseconds");
	}
	
}
