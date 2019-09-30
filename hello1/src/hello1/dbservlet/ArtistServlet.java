package hello1.dbservlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello1.dao.ArtistDao;
import hello1.dbtables.Artist;

@WebServlet("/ArtistServlet")
public class ArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArtistDao artistdao;
       
  
    public ArtistServlet() {
    	super();
        artistdao=new ArtistDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String forward = "";
		String action = request.getParameter( "action" );

		if( action.equalsIgnoreCase( "delete" ) ) {
			
			int artist_id = Integer.parseInt( request.getParameter("artist_id") );
			artistdao.deleteArtist(artist_id);
			forward = "/ArtistsList.jsp";
			request.setAttribute("artists", artistdao.getAllArtists() );
		}
		else if( action.equalsIgnoreCase( "edit" ) ) {
			forward = "/artist.jsp";
			int artist_id = Integer.parseInt( request.getParameter("artist_id") );
		    Artist artist = artistdao.getArtistById(artist_id);
			request.setAttribute("artist", artist);
		}
		else if( action.equalsIgnoreCase( "insert" ) ) {
			forward = "/artist.jsp";
		}
		else {
			forward = "/artist.jsp";
			request.setAttribute("artists", artistdao.getAllArtists() );
		}
		RequestDispatcher view = request.getRequestDispatcher( forward );
		view.forward(request, response);
	}
		
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Artist artist = new Artist();
		artist.setFirstname( request.getParameter( "firstname" ) );
		artist.setLastname( request.getParameter( "lastname" ) );
		artist.setGenre_id(request.getParameter( "genre_id") );
		
		try {
            Date date_of_birth = newSimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("date_of_birth"));
            artist.setDate_of_birth(date_of_birth);
      } catch (ParseException e) {
            e.printStackTrace();
      }
		
		try {
            Date date_of_death = newSimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("date_of_death"));
            artist.setDate_of_death(date_of_death);
      } catch (ParseException e) {
            e.printStackTrace();
      }
		
		String artist_id = request.getParameter("artist_id");

		if( artist_id == null || artist_id.isEmpty() )
			artistdao.addArtist(artist);
		else {
			artist.setArtist_id( Integer.parseInt(artist_id) );
			artistdao.updateArtist(artist);
		}
		RequestDispatcher view = request.getRequestDispatcher( "/ArtistsList.jsp" );
		request.setAttribute("artists", artistdao.getAllArtists());
		view.forward(request, response);

	}


	private DateFormat newSimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}}
