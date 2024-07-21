import java.util.ArrayList;
import java.util.Scanner;

import Controller.User;
import Controller.UserCreationAdapter;

class Main {
  public static void main(String[] args) {
    String isToContinue = "y";
    ArrayList<User> users = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    while (isToContinue.toLowerCase().equals("y")) {
      try {
        System.out.print("Digite o nome do usuáro: ");
        String name = scan.nextLine();

        System.out.println("Qual o tipo de usuário?");
        System.out.println("1 - Gratuito");
        System.out.println("2 - Basico");
        System.out.println("3 - Ultimate");
        int type = Integer.parseInt(scan.nextLine());

        users.add(new UserCreationAdapter().createUser(name, type));
      } catch (Exception e) {
        System.out.println(e);
      }

      for (User user : users) {
        System.out.println("");
        System.out.println(user.toString());
        System.out.println("");
      }

      System.out.println("Deseja continuar?(y/n) ");
      isToContinue = scan.nextLine();
    }

    scan.close();
  }
}