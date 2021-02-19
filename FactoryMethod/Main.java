import java.util.*;
import pattpack.account.*;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int loginId = in.nextInt();
      FactoryIF account = Builder.build(loginId);
      System.out.println(account);
      User aUser = account.createUser(loginId);
      System.out.println(aUser);
    }
}
