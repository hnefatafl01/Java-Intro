public class ArraysDemo {
  public static void main(String[] args){
    String[] names = {"Guy", "Gal"};
    System.out.println(names.length);
    String[][] fullNames = {{"a","the"},{"Guy", "Gal"}};
    System.out.println(fullNames[0][0] + " " + fullNames[1][0]);
    System.out.println(fullNames[0][1] + " " + fullNames[1][1]);
  }
}
