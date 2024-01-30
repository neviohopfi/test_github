package socialNetwork;

public class Test {

	public static void main(String[] args) {
		
		NewsFeed nf = new NewsFeed();	
		
		News n = new Newscast("Andreas", "Das ist ein Text");
		News p = new Photocast("Nevio", "image1.png", "Klassenfoto");
		
		nf.add(n);
		nf.add(p);
		//nf.search(author);
		
		n.addLikes();
		p.addLikes();
		p.addLikes();
		
		nf.print();
	}

}
