package Controller;

public class UserCreator {
  public User createUser(String name, String sgbd, String type) {
    if (!name.equals("") || !sgbd.equals("") || !type.equals("")) {
      User user = new User(name, type);
      user.setSgbd(sgbd);

      return user;
    } else {
      return null;
    }
  }

}
