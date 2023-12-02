public class DecimalToOctal
{
  public static void main(String[] args)
  {
  
    int num = 14, tmp;
    tmp = num;
 
    String octal = "";
    while(num >= 8)
    {
      octal = num%8 + octal;
      num = num /8;
    }
    octal = num + octal ;
    System.out.println("Octal of " + tmp + " is " + octal);
  }
}
