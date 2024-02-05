package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
		
		private ArrayList<News> news;
		
		public NewsFeed() {
				this.news = new ArrayList<News>();
				
		}
		
		public ArrayList<News> getNews() {
			return news;
		}
		
		public void setNews(ArrayList<News> news) {
			this.news = news;
		}		
		
		
		public void add(News n) {
			if(!this.news.contains(n)) {
				this.news.add(n);
			}
		}
		
		public void remove(News n) {
			this.news.remove(n);
		}
		
		
		public void searchNews(String author) {
			ArrayList<News> searchNews = new ArrayList<News>();
			for(News n : this.news) {
				if(n.getAuthor().equals(author)&& n instanceof Newscast) {
					searchNews.add(n);
				}
			}
			System.out.println(searchNews);
		}
		
		
		
		public void searchPhots(String author) {
			ArrayList<News> searchPhotos = new ArrayList<News>();
			for(News n : this.news) {
				if(n.getAuthor().equals(author)&& n instanceof Photocast) {
					searchPhotos.add(n);
				}
			}
			System.out.println(searchPhotos);
		}
		
		
		public void search(String author) {
			ArrayList<News> searchByAuthor = new ArrayList<News>();
			for(News n : this.news) {
				if(n.getAuthor().equals(author)) {
					searchByAuthor.add(n);
				}
			}
			System.out.println(searchByAuthor);
		}
		
		public void print() {
			for(News n : this.news) {
				System.out.println(n);
			}
		}	
}