package test;

public class Test {

  public static void main(String[] args) {

    String msg = method();
    System.out.println(msg);
  }

  public static String method() {
    String var = "ciao";
    try {

      throw new NullPointerException();
    }
    catch (NullPointerException e) {

    }
    finally {
      var = "pippo";
    }
    return var;
  }
}
