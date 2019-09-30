package hello1.dbtables;

import java.util.Date;

public class Artist {
	private int artist_id;
	private String lastname;
	private String firstname;
	private String genre_id;
	private Date date_of_birth;
	private Date date_of_death;

	public Artist(){}
	 
	//public Artist(int artist_id, String lastname, String firstname, int genre_id, Date date_of_birth,
	//		Date date_of_death) {
	//	this.artist_id = artist_id;
	//	this.lastname = lastname;
	//	this.firstname = firstname;
	//	this.genre_id = genre_id;
	//	this.date_of_birth = date_of_birth;
	//	this.date_of_death = date_of_death;
	//}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Date getDate_of_death() {
		return date_of_death;
	}

	public void setDate_of_death(Date date_of_death) {
		this.date_of_death = date_of_death;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(String string) {
		this.genre_id = string;
	}
	
	@Override
    public String toString() {
        return "Artist [artist_id=" + artist_id + ", FirstName=" + firstname
                + ", LastName=" + lastname + ", date_of_birth=" + date_of_birth + ", date_of_death"
                + date_of_death + ", genre_id="+genre_id + "]";
    }   
}