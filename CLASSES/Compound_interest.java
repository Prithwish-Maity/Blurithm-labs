import java.io.*;
class Compound_interest
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader x=new InputStreamReader (System.in);
        BufferedReader y=new BufferedReader (x);
        double p,r,t,a,c,m,s;
        System.out.println("Principal:");
        p=Double.parseDouble(y.readLine());
        System.out.println("Rate of Interest:");
        r=Double.parseDouble(y.readLine());
        System.out.println("Time:");
        t=Double.parseDouble(y.readLine());
        m=1+r/100;
        s=(double)Math.pow(m, t);
        a=p*s;
        System.out.println("Amount = "+a);
        c=a-p;
        System.out.print("Compound Interest = "+c);
    }
}