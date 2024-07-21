package Controller;

public class User {
  private String name;
  private String type;
  private String sgbd;

  public User(String name, String type) {
    this.name = name;
    this.type = type;
    this.sgbd = "";
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSgbd() {
    return this.sgbd;
  }

  public void setSgbd(String sgbd) {
    this.sgbd = sgbd;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Nome: " + this.name + "\nSGBD: " + this.sgbd + "\nTipo: " + this.type;
  }
}
