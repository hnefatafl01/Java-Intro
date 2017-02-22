public class PageCountDemoApp {
  public static void main(String [] args) {
    System.out.println("PageCount starting value: ");
    System.out.println(PageCount.count);
    PageCount.count++;
    PageCount.count++;
    System.out.println("PageCount ending value: ");
    System.out.println(PageCount.count);
  }
}
