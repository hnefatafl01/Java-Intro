public class UserDemoApp {
  public static void main(String[] args) {
    User chewie = new User("Chewbacca");
    User vader = new User("Darth Vader");

    //all will print vader because of static username instance
    System.out.println(chewie.userName);
    System.out.println(vader.userName);
    System.out.println(User.userName);
  }
}
