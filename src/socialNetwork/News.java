package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class News {

	private String author;
	private LocalDate tiemstamp;
	private int likes;
	private ArrayList <String> comments;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getTiemstamp() {
		return tiemstamp;
	}
	public void setTiemstamp(LocalDate tiemstamp) {
		this.tiemstamp = tiemstamp;
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
	
	
	
}
