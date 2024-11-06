//forward iteration !!
/*class main
{
  public static void main(String[] args)
   {
    int start=1,end=10;
    while(start<=end)
     {
      System.out.println(start);
      start++;
      }
    }
}*/

//backward iteration
/*class main
{
  public static void main(String[] args)
   {
    int start=10,end=1;
    while(start>=end)
     {
      System.out.println(start);
      start--;
      }
    }
}*/

//sum of first 10 natural numbers
/*class main
{
  public static void main(String[] args)
   {
    int start=1,end=10,sum=0;
    while(start<=end)
    {
     sum=sum+start;
     start++;
     }
    System.out.println("sum is " +sum);
   }
}*/

//product of first 5 natural numbers
/*class main
{
  public static void main(String[] args)
   {
    int start=1,end=10,pro=1;
    while(start<=end)
    {
     pro=pro*start;
     start++;
     }
    System.out.println("product is " +pro);
   }
}*/

//print a table
/*class main
{
  public static void main(String[] args)
   {
    int num=2,start=1,end=10;
    while(start<=end)
    {
     System.out.println(num+"X"+start+"="+(num*start));
     start++;
     }
  }
}*/

//swappping of two numbers using bitwise xor
/*class main
{
  public static void main(String[] args)
   {
     int x=10,y=20;
     x=x^y;
     y=y^x;
     x=x^y;
     System.out.println(x);
     System.out.println(y);
   }
}*/

//factors of a number
/*class main
{
  public static void main(String[] args)
   {
    int fact=12,start=1;
    while(start<=fact)
    {
     if(fact%start==0)
     {
      System.out.println(start);
       start++;
     }
    }
  }
}*/

//factorial of a number
/*class main
{
  public static void main(String[] args)
   {
    int num=5,pro=1,start=1;
    while(start<=num)
    {
     pro=pro*start;
     start++;
     }
     System.out.println("factorial of num is "+pro);
    }
}*/

//something
/*class main
{
  public static void main(String[] args)
   {
    int num=3;
    while(num>1)
    {
    System.out.println(num);
    if(num%2==0)
    {
    num=num/2;
    }
    else
    {
    num=3*num+1;
    }
   }
  System.out.println(num);
  }
}*/

//accept any number as input check perfect number or not//
class main
{
  public static void main(String[] args)
   {
    int fact=6,start=1,sum=0;
    while(start<fact)
    {
     if(fact%start==0)
     {
      sum=sum+start;
     }
     start++;
     }
    if(fact==sum)
    System.out.println("perfect number");
    else
    System.out.println("Not a perfect number");
   }
}

