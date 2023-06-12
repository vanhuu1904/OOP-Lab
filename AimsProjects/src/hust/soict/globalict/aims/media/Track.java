package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class Track implements Playable {
	private String title;
	private int length;
	public Track(String title, int length) {
		this.title=title;
		this.length=length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track other = (Track) o;
			if (this.title.equals(other.getTitle()) &&(this.length==other.getLength())){
				return true;
			}
		}
		return false;
	}
}