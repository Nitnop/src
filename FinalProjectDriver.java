import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class FinalProjectDriver {
    
    static Scanner UserInput = new Scanner(System.in);
    static int managerPIN = 1234;
    static Boolean manager = false;
    static CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Movie>();
    static int userpassword;
    static String title;
    static String actor;
    static String genre;
    static String year;
    static String titleSearch;
    static int numOfindexToRemove;


    //static ArrayList<Movie> m2 = Populator.startinglist();
    //ArrayList<Movie> list = new ArrayList<Movie>();
    //list.add(new Movie ("The hunt for red october", "Sean Connery", "action", "1985") );
    //ArrayList<Movie> m2 = Populator.startinglist();
    //Collections.copy(m1, Populator.startinglist);

    public static void main(String[] args){
        
        movieList = Populator.startinglistMovie();

        // user needs a value probably bool and varriable call manager

        System.out.println("Login = 0\nContinue without login = 1");

        int userchoice = UserInput.nextInt();

        switch(userchoice){
            case 0:
            System.out.println("Enter Password:");
            userpassword = UserInput.nextInt();
            if(userpassword == managerPIN){
                manager = true;
                System.out.println("Welcome Manager");
                
                do {
                    UserPromps.getUserprompts(manager);
                    userchoice = UserInput.nextInt();

                    switch(userchoice){
                        
                        case 1:
                        System.out.println("Enter Movie title...");
                        title = UserInput.nextLine();
                        System.out.println("Enter Movie main actor...");
                        actor = UserInput.nextLine();
                        System.out.println("Enter Movie genre...");
                        genre = UserInput.nextLine();
                        System.out.println("Enter Movie release year...");
                        year = UserInput.nextLine();
                        movieList.add(Populator.addMovie(title, actor, genre, year));

                        case 2:
                       
                        System.out.println("What movie would you like to remove from the library? Enter title");
                        
                        for (Movie mov : movieList){System.out.println(mov);}
                        
                        titleSearch = UserInput.next();

                        for (Movie movieTitle : movieList){



                            if (movieTitle.getTitle() != null && movieTitle.getTitle().contains(titleSearch)){
                                
                                //movieList.remove(movieTitle);
                                
                                System.out.println(movieTitle);
                                
                            
                                numOfindexToRemove = movieList.indexOf(movieTitle);
                                //System.out.println("Are you sure you want to delete " + movieTitle);
                                //System.out.println("yes = 0\nno = 1");
                                //int answer = UserInput.nextInt();
                                movieList.remove(numOfindexToRemove);
                            }                           
                        }

                        case 3:

                        Collections.sort(movieList);
                            
                    }


                    

                }while(userchoice != 8);


            }
            else{
                System.out.println("Incorect password");
            }

            case 1:
            System.out.println("Welcome User");
            UserPromps.getUserprompts();

        }
        

        




        // movie object needs title, leading actor, release year, genre

        //toDo:user input and validation probably make a method I can reuse

        //toDo switch statement to fire off Driven

        //method to add movie object

        //method to remove movie object

        //method to set movie title

        //method to set movie actor

        //method to set movie genre

        //method to set movie relese year

        // method to search for a movie name and print it and display it A to Z or Z to A

        // method to search for a movie genre and print it and display it A to Z or Z to A
        
        // method to search for a movie actor and print it and display it A to Z or Z to A

        //catch statement

        //some exit text

        

    }
    
}
