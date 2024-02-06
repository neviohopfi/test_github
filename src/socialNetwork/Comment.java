package socialNetwork;

public class Comment {

	private String text;
	private int Likes;
	
	
	public Comment(String text) {
		this.text = text;
		this.Likes = 0;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getLikes() {
		return Likes;
	}


	public void setLikes(int likes) {
		Likes = likes;
	}
	
	
	public String toString() {
		return "Kommentar: \n" + 
				"\t Text: " +this.text + "\n" +
				"\t Anzahl Likes " + this.Likes + "\n";
	}
	
	public void addLikes() {
		this.setLikes(getLikes() + 1);
		
	}
	
}
