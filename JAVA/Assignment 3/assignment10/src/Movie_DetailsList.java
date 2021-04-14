import java.util.*;

public class Movie_DetailsList {

	List<Movie_Details> list=new ArrayList<Movie_Details>();
		
	
	public void add_movie(String mov_Name, String lead_actor, String lead_actress, String genre) {
		list.add(new Movie_Details(mov_Name,lead_actor,lead_actress,genre));
		
	}
	public void remove_movie(String name) {
	for(Movie_Details m: list) {
		if(m.mov_Name.equals(name)) {
			int index=list.indexOf(m);
			list.remove(index);
			break;
		}
	}
	}
	public void remove_AllMovies() {
		list.removeAll(list);
	}
	public void find_movie_By_mov_Name(String name) {
		for(Movie_Details m: list) {
			if(m.mov_Name.equals(name)) {
				int index=list.indexOf(m);
				list.remove(index);
				break;
			}
		}
		}
	public void find_movie_by_genre(String genre) {
		for(Movie_Details m :list) {
			if(m.genre.equals(genre)) {
				int index =list.indexOf(m);
				System.out.println(list.get(index));
				break;
			}
		}
		
		
	}
	
	
	class NameComparator implements Comparator<Movie_Details> {
	    public int compare(Movie_Details s1, Movie_Details s2) {
	        return s1.mov_Name.compareTo(s2.mov_Name);
	    }
	}

	class GenreComparator implements Comparator<Movie_Details> {
	    public int compare(Movie_Details s1, Movie_Details s2) {
	        return s1.genre.compareTo(s2.genre);
	    }
	}


	
	
	
	
	  public void sort(String criteria) {
	        String a="name";
	        if (a.equals(criteria)) {
	            Collections.sort(list, new NameComparator());
	            for (Movie_Details m : list) {
	                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actress + " " + m.genre);
	            }
	        }
	        else{
	            Collections.sort(list, new GenreComparator());
	            for (Movie_Details m : list) {
	                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actress + " " + m.genre);
	            }
	        }
	    }
	
		
		
	
	    public static void main(String[] args) {
	        Movie_DetailsList movie = new Movie_DetailsList();
	        movie.add_movie("b", "b", "b", "x");
	        movie.add_movie("a", "a", "a", "y");
	        // movie.size();
	        movie.sort("genre");
	        
	        
	        
	
	    }

		
		
		
	}

	
	
	
	

