package hello1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hello1.dbtCon.DtbCon;
import hello1.dbtables.Artist;

public class ArtistDao {


	public void addArtist(Artist artist) {
		Connection connection=null;
		try {
			
			connection=DtbCon.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(
					"insert into artists(firstname,lastname,genre_id,date_of_birth,date_of_death) values (?, ?, ?, ? ,?)");

			preparedStatement.setString(1, artist.getFirstname());
			preparedStatement.setString(2, artist.getLastname());
			preparedStatement.setString(3, artist.getGenre_id());
			preparedStatement.setDate(4, new java.sql.Date(artist.getDate_of_birth().getTime()));
			preparedStatement.setDate(5, new java.sql.Date(artist.getDate_of_death().getTime()));

			preparedStatement.executeUpdate();

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally{
            DtbCon.closeConnection(connection);
        }
    }
	
	public void deleteArtist(int artist_id) {
		Connection connection=null;
		try {
			connection=DtbCon.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement("delete from artists where artist_id=?");

			preparedStatement.setInt(1, artist_id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
            DtbCon.closeConnection(connection);
        }
	}

	public void updateArtist(Artist artist) {
		Connection connection=null;
		try {
			connection=DtbCon.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(
					"update artists set firstname=?, lastname=?, genre_id=?,date_of_birth=?,date_of_death=? where artist_id=?");

			preparedStatement.setString(1, artist.getFirstname());
			preparedStatement.setString(2, artist.getLastname());
			preparedStatement.setString(3, artist.getGenre_id());
			preparedStatement.setDate(4, new java.sql.Date(artist.getDate_of_birth().getTime()));
			preparedStatement.setDate(5, new java.sql.Date(artist.getDate_of_death().getTime()));
			preparedStatement.setInt(6, artist.getArtist_id());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
            DtbCon.closeConnection(connection);
        }
	}

	public List<Artist> getAllArtists() {
		Connection connection = null;
        List<Artist> artists = new ArrayList<Artist>();
		
        try {
        	
        	connection=DtbCon.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from artists");
			while (rs.next()) {
				Artist artist = new Artist();
				artist.setArtist_id(rs.getInt("artist_id"));
				artist.setFirstname(rs.getString("firstname"));
				artist.setLastname(rs.getString("lastname"));
				artist.setGenre_id(rs.getString("genre_id"));
				artist.setDate_of_birth(rs.getDate("date_of_birth"));
				artist.setDate_of_death(rs.getDate("date_of_death"));
				artists.add(artist);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        finally{
            DtbCon.closeConnection(connection);
        }

		return artists;
	}

	public Artist getArtistById(int artist_id) {
		Connection connection=null;
		Artist artist = new Artist();
		try {
			connection=DtbCon.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from artists where artist_id=?");
			preparedStatement.setInt(1, artist_id);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				artist.setArtist_id(rs.getInt("artist_id"));
				artist.setFirstname(rs.getString("firstname"));
				artist.setLastname(rs.getString("lastname"));
				artist.setGenre_id(rs.getString("genre_id"));
				artist.setDate_of_birth(rs.getDate("date_of_birth"));
				artist.setDate_of_death(rs.getDate("date_of_death"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
            DtbCon.closeConnection(connection);
        }
		return artist;
	}
}
