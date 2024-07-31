public class rec6 {
    //stack height
    //print x^n(stack height=logn)
    public static int calcPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        //even
        if(n%2==0)
        {
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else{
            //n is odd
            return calcPower(x,n/2)*calcPower(x,n/2)*x;

        }
    }
    public static void main(String args[])
    {
        int x=2;
        int n=5;
        System.out.println("Result: "+calcPower(x,n));//output 
    }
}
