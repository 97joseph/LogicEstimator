import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

  public static final String city1Name = "City1";
  public static final String city2Name = "City2";
  public static final int cityDistance = 3;


  @Test
  void getLength() {
  }

  @Test
  void getAdj() {
  }

  @Test
  void isUsed() {
  }

  @Test
  void setUsed() {
  }

  @Test
  void testToString_sorted() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    String expectedString = city1Name + " " + cityDistance + " " + city2Name;
    String resultString = link.toString();
    assertEquals(expectedString, resultString, "toString with sorted city names returned wrong string");
  }

  @Test
  void testToString_unsorted() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city2, city1, cityDistance);
    String expectedString = city1Name + " " + cityDistance + " " + city2Name;
    String resultString = link.toString();
    assertEquals(expectedString, resultString, "toString with unsorted city names returned wrong string");
  }

  @Test
  void compareTo() {
  }
}