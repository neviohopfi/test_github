package socialNetwork;

import java.util.ArrayList;
import java.time.Duration;
import java.time.Instant;



public abstract class News {

	private String author;
	private Instant timestamp;
	private int likes;
	private ArrayList <Comment> comments;
	
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
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
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
		Comment c = new Comment(comment);
		this.comments.add(c);
	}
	
	
	/**
	 * Method calculates a time between the post reales and now.
	 * @param n is the news you want to check
	 */
	public void uploadDate(News n) {
		Instant start = n.getTimestamp(); 
		Instant end = Instant.now();
		
		System.out.println("Beitrag wurde vor: " + Duration.between(start, end).toMinutes() + "Minuten erstellt");
		
	}
	
}
