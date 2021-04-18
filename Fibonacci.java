package week2;


import acm.program.ConsoleProgram;


public class Fibonacci extends ConsoleProgram
{

  public static void main(String[] args)
  {
    System.out.println("This is a Fibonacci Sequence");

    int n = 0, n1 = 0, sum = 1;

    while (n1 <= 10000)
    {
      n = n1;
      n1 = sum;
      sum = n + n1;

      System.out.println(n + " ");
    }

  }

}