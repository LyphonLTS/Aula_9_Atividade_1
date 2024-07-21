package Controller;

import Interfaces.ICreateUser;

public class UserCreationAdapter implements ICreateUser {
  public User createUser(String name, int type) {
    switch (type) {
      case 1:
        return new UserCreator().createUser(name, "Paradox", "Gratuito");
      case 2:
        return new UserCreator().createUser(name, "Firebird", "Basico");
      case 3:
        return new UserCreator().createUser(name, "MySQL", "Ultimate");
      default:
        return null;
    }
  }
}
