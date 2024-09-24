public class WarmUp
{
  public static void main(String[] args)
  {
    // test your methods here
    boolean var1 = isEven(4);
    System.out.println(var1);

    boolean var2 = isDivisable(9, 5);
    System.out.println(var2);
  }

  // write your methods below
    public static boolean isEven(int n)
    {
       return (n % 2 == 0);
    }
  public static boolean isDivisable(int a, int b)
  {
    return (a % b == 0);
  }
}
