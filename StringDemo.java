public class StringDemo {

  public static void main(String[] args) {
    //literal
    String str = "Do things right";
    //string object
    String stringObj = new String("Just do it");
    // System.out.println(str);
    // System.out.println(stringObj);

    //same memory location assigned to two variables
    String fooLiteral = "string";
    String barLiteral = "string";
    // System.out.println(fooLiteral == barLiteral);//true
    //fooObj and barObj do not have the same reference
    String fooObj = new String("String");
    String barObj = new String("String");
    // System.out.println(fooObj == barObj);//false
    // System.out.println(fooLiteral.equals(barLiteral));
    // System.out.println(fooObj.equals(barObj));
    String thing1 = "thing1";
    String thing2 = "Thing1";
    // System.out.println(thing1.equalsIgnoreCase(thing2));
    String imImmutable = "I'm immutable";
    String fooImmutable = "I'm immutable";
    imImmutable = imImmutable + " , but it seems like I'm not";
    System.out.println(imImmutable);
    System.out.println(fooImmutable);
  }
}
