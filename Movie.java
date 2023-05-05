import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Movie {

    public Movie(){
        String title;
        String actor;
        String genre;
        String year;
    }

    public Movie(String titleIn, String actorIn, String genreIn, String yearIn){
        //Movie movie = new Movie();
        this.title = titleIn;
        this.actor = actorIn;
        this.genre = genreIn;
        this.year = yearIn;
        
    }

    protected String title;
    protected String actor;
    protected String genre;
    protected String year;

    
    static Scanner UserInput = new Scanner(System.in);

    static void setTitle(){
        System.out.println("Enter movie title:");
        this.title = UserInput.next();
    }

    static void setActor(){
        System.out.println("Enter movie actor:");
        actor = UserInput.next();
    }    

    static void setGenre(){
        System.out.println("Enter movie genre:");
        genre = UserInput.next();
    }

    static void setYear(){
        year = UserInput.next();
    }

    static void setWorkingList(){

    }
    public String toString(){
        return "[" + title + ", " + actor + ", " + genre + ", " + year + "]";
    }

    public String getTitle(){
        return title;
    }


}