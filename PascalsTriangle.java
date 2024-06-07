public class PascalsTriangle
{
    private final int rows;

    public PascalsTriangle(int rows)
    {
        this.rows = rows;
    }

    public long factorial(int n)
    {
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public long binomialCoefficient(int n, int k)
    {
        long nFactorial = factorial(n);
        long kFactorial = factorial(k);
        long nMinusKFactorial = factorial(n - k);
        return nFactorial/(kFactorial * nMinusKFactorial);
    }

    public void printBinomialCoefficients()
    {
        int i, j;
        for(i = 0; i <= rows; i++)
        {
            for(j = 0; j <= rows - i; j++) System.out.print(" ");
            for(j = 0; j <= i; j++) System.out.print(" " + this.binomialCoefficient(i, j));
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Pascal's Triangle from 0-20: ");
        PascalsTriangle pascalsTriangle = new PascalsTriangle(20);
        pascalsTriangle.printBinomialCoefficients();
    }
}