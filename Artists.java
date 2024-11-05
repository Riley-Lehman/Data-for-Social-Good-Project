// Define artist class
public class Artist {

  // Store full name, nationality, and style variables
  private String fullName;
  private String nationality;
  private String style;

  // Constructor to initialize the Artist object with given attributes
  public Artist(String fullName, String nationality, String style) {
    this.fullName = fullName;
    this.nationality = nationality;
    this.style = style;
  }

  // Getter method to retrieve the artist's full name
  public String getFullName() {
    return fullName;
  }

  // Getter method to retrieve the artist's nationality
  public String getNationality() {
    return nationality;
  }

  // Getter method to retrieve the artist's style
  public String getStyle() {
    return style;
  }

// Provide a string representation of the Artist object, including full name, nationality, and art style
  public String toString() {
    return "Artist {\n" + 
      "fullName=" + fullName + ",\n" + 
      "nationality=" + nationality + ",\n" + 
      "style=" + style + "}\n";
  }
}