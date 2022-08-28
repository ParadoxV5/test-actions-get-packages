package xyz.paradoxv5;
public class TestActionsGetPackages { public static void main(String[] __) {
  String str = Double.toString(Math.random());
  if(str.equals(new MyString(str).toString()))
    System.out.println("simple test passed");
  else
    throw new RuntimeException("simple test failed");
} }