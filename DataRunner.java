// Define the main class named DataRunner
public class DataRunner {
  
  public static void main(String[] args) {
    
// Create an instance of the UserStory class
    UserStory userStory = new UserStory();

// Count American artists in dataset 
int countNationalities = userStory.countByNationality("American"); 

// Count Realist artists in dataset
int countStyles = userStory.countByStyle("Realist"); 

// Print number of artists, americans, and realist artists
System.out.println("Number of American artists: " + countNationalities);
System.out.println("Number of Realist artists: " + countStyles);
System.out.println(userStory.toString()); 
  }
}