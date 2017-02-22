public class Main {
  public static void main(String [] args){
    System.out.println("hi");
    Clown bozo = new Clown("red", 15, 20000);
    System.out.println(bozo);
    System.out.println(Clown.shoeSize);
    System.out.println(Clown.creepyLevel);
    System.out.println(bozo.noseColor);
    System.out.println(bozo.shoeSize);
    System.out.println(bozo.creepyLevel);
    System.out.println(Clown.sing());
    System.out.println(Clown.sing());
  }
}
