package socialNetwork;

import java.time.LocalDate;

public class Photocast extends News{

	private String photoFileName;
	private String photoHeadline;
	

	public Photocast(String author, LocalDate timestamp, String photoFileName, String photoHeadline) {
		this.setAuthor(author);
		this.setTiemstamp(LocalDate.now());
		this.setLikes(0);
		this.setComments(null);
		this.photoFileName = photoFileName;
		this.photoHeadline = photoHeadline;
	}


	public String getPhotoFileName() {
		return photoFileName;
	}


	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}


	public String getPhotoHeadline() {
		return photoHeadline;
	}


	public void setPhotoHeadline(String photoHeadline) {
		this.photoHeadline = photoHeadline;
	}
		
	
}
