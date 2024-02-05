package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Newscast extends News{

	private String textMessage;

	
	public Newscast(String author, String textMessage) {
		this.setAuthor(author);
		this.setTiemstamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(new ArrayList <String>());
		this.textMessage = textMessage;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

	public String toString() {
		return super.toString() + 
			"\t Message: " + this.textMessage + "\n";
	}
	
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
	
	
	
}
