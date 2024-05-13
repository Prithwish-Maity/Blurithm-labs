import java.io.*;
class Compound_Interest2
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader x=new InputStreamReader (System.in);
        BufferedReader y=new BufferedReader (x);
        double p,r,t,c,a,b,d;
        System.out.println("Principal:");
        p=Double.parseDouble(y.readLine());
        System.out.println("Rate of Interest(per annum):");
        r=Double.parseDouble(y.readLine());
        System.out.println("Time:");
        t=Double.parseDouble(y.readLine());
        a=1+r/100;
        b=(double)Math.pow(a, t);
        d=b-1;
        c=p*d;
        System.out.print("Compund Interest = "+c);
    }
}