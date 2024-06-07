package example.checkfriday;

public class CheckFriday {

  public String check(String today) {
    return "Friday".equalsIgnoreCase(today) ? "Yes" : "No";
  }
}
