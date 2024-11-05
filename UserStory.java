
// Define the UserStory class
public class UserStory {
  
  // Define file data for default data files
  private static String defaultFullNamesFile = "FullNames.txt";
  private static String defaultNationalitiesFile = "Nationality.txt";
  private static String defaultStylesFile = "Style.txt";

  // Array to hold Artist objects
  private Artist[] artists;

  // Default constructor that calls the parameterized constructor with default file names
  public UserStory() {
    this(defaultFullNamesFile, defaultNationalitiesFile, defaultStylesFile);
  }
  
// Parameterized constructor that takes file names as input
  public UserStory(String fullNamesFile, String nationalitiesFile, String stylesFile) {

    // load arrays of artist attributes
    String[] fullNames = FileReader.toStringArray(fullNamesFile);
    String[] nationalities = FileReader.toStringArray(nationalitiesFile);
    String[] styles = FileReader.toStringArray(stylesFile);

    // Initialize the length of the artists array
    artists = new Artist[fullNames.length];
       
    // Populate the artists array with new Artist objects
    for (int i=0; i<artists.length; i++) {
      artists[i] = new Artist(fullNames[i], nationalities[i], styles[i]);
    }
  }  

 // Method to count the number of artists by nationality
  public int countByNationality(String nationality) {
    int count = 0;

 // Iterate through the artists array to count matches
    for (int i=0; i<artists.length; i++) {
      if (artists[i].getNationality().equals(nationality)) {
        count++;
      }
    }
// Return to total count
    return count;
  }

 // Counts artists of a specified style
public int countByStyle(String style) {
    int count = 0; 
    for (int i = 0; i < artists.length; i++) {
      if (artists[i].getStyle().equals(style)) { 
        count++;
      }
    }
    return count;  
  }
  
//Create a string representation of the UserStory object
  public String toString() {
     return "Number of Artists: " + artists.length ;
  }
}