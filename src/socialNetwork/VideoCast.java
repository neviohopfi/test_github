package socialNetwork;

public class VideoCast extends News {

	private String videoFileName;
	private String videoHeadline;
	

	public VideoCast(String author, String videoFileName, String videoHeadline) {
		super();
		this.setAuthor(author);
		this.videoFileName = videoFileName;
		this.videoHeadline = videoHeadline;
	}


	public String getVideoFileName() {
		return videoFileName;
	}


	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}


	public String getVideoHeadline() {
		return videoHeadline;
	}


	public void setVideoHeadline(String videoHeadline) {
		this.videoHeadline = videoHeadline;
	}
	
	public String toString() {
		return super.toString() + 
			  "\t Filename: " + this.videoFileName + "\n" + 
			  "\t Headline: " + this.videoHeadline + "\n";
	}
	
	/**
	 * Method adds likes to a post
	 */
	@Override
	public void addLikes() {
		this.setLikes(getLikes()+1);
	}
	

}
