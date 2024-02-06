package socialNetwork;

public class PhotoGalaryCast extends News{

	private String photoGalaryFileName;
	private String photoGalaryHeadline;
	

	public PhotoGalaryCast(String author, String photoGalaryFileName, String photoGalaryHeadline) {
		super();
		this.setAuthor(author);
		this.photoGalaryFileName = photoGalaryFileName;
		this.photoGalaryHeadline = photoGalaryHeadline;
	}
	
	
	public String getPhotoGalaryFileName() {
		return photoGalaryFileName;
	}




	public void setPhotoGalaryFileName(String photoGalaryFileName) {
		this.photoGalaryFileName = photoGalaryFileName;
	}




	public String getPhotoGalaryHeadline() {
		return photoGalaryHeadline;
	}




	public void setPhotoGalaryHeadline(String photoGalaryHeadline) {
		this.photoGalaryHeadline = photoGalaryHeadline;
	}




	public String toString() {
		return super.toString() + 
			  "\t Filename: " + this.photoGalaryFileName + "\n" + 
			  "\t Headline: " + this.photoGalaryHeadline + "\n";
	}
	
	/**
	 * Method adds likes to a post
	 */
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
	


	
	
}
