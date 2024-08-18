import java.util.Scanner;
public class Calculator
{
    public double D,r;
    public static void Maths()
    {
        int num,a;
        double operation,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number");
        a=s.nextInt();
        System.out.println("Enter Second number");
        b=s.nextInt();
        System.out.println("What operation you want to perform: \n 1. Addition \n 2. Subtraction \n 3. Product \n 4. Divide");
        num=s.nextInt();
        switch (num) 
        {
            case 1: operation=a+b;
                    System.out.println(operation);
                break;
            case 2: operation=a-b;
                    System.out.println(operation);
                break;
            case 3: operation=a*b;
                    System.out.println(operation);
                break;
            case 4: operation=a/b;
                    System.out.println(operation);
                break;
            default: System.out.println("Enter a valid command");
        }
    }
    public static void Logarithm()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter input value for natural log");
        int a=s.nextInt();
        if (a <= 0) 
        {
            throw new IllegalArgumentException("x must be greater than 0");
        }
        
        double log = a - 1; 
        double tolerance = 1e-10;
        double result;
        
        do 
        {
            result = log;
            log = log - (Math.exp(result) - a) / Math.exp(result);
        } 
        while (Math.abs(result - log) > tolerance);
        System.out.println("Log of "+a+" is "+log);

    }
    static double Sqrt(double x)
    {
            double root = x;
            double epsilon = 0.00001; 
            for (int i = 0; i < 100; ++i)
            {
                double next = 0.5 * (root + x / root); 
                if ((next - root) < epsilon && (root - next) < epsilon) 
                {
                    break;
                }
                root = next;
            }
            return root;
    }
    public static void Quad()
    {
         double a,b,c,d,D,value;
         System.out.println("A Quadratic equation is of form 'a*x*x+b*x+c'");
         Scanner s=new Scanner(System.in);
         System.out.println("Enter value of a");
         a=s.nextFloat();
         System.out.println("Enter value of b");
         b=s.nextFloat();
         System.out.println("Enter value of c");
         c=s.nextFloat(); 
         D=(b*b-4*a*c);
         if(D>0)
         {
            value=(-b+Sqrt(D))/2*a;
            System.out.print("Values of x are\n"+value);
            value=(-b-Sqrt(D))/2*a;
            System.out.print(" and "+value);
         }
         else
         {
            System.out.println("Roots does not exist");
         }
    }
    static double sinvalue(double r)
    {
        double term=r;
        double value=term;
        int n=1;
        for(int i=1;i<10;i++)
        {
            term*=-(r*r)/((2*n)*(2*n+1));
            value+=term;
            n++;
        }
        return value;
    }
    public static void Trignometric()
    {
        double cos,tan,sec,cosec,cot;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter angle in radian");
        double n1=s.nextDouble();
        System.out.println("Select a function:\n 1)sin \n 2)cos \n 3)tan \n 4)sec \n 5)cosec \n 6)cot ");
        int a=s.nextInt();
        cos=Sqrt(1-sinvalue(n1)*sinvalue(n1));
        tan=sinvalue(n1)/Sqrt(1-sinvalue(n1)*sinvalue(n1));
        sec=1/Sqrt(1-sinvalue(n1)*sinvalue(n1));
        cosec=1/sinvalue(n1);
        cot=Sqrt(1-sinvalue(n1)*sinvalue(n1))/sinvalue(n1);
        sinvalue(n1);
        if(a==1)
        {
            System.out.println("sin "+n1+" = "+sinvalue(n1));
        }
        if(a==2)
        {
            System.out.println("cos "+n1+" = "+cos);
        }
        if(a==3)
        {
            System.out.println("tan "+n1+" = "+tan);
        }
        if(a==4)
        {
            System.out.println("sec "+n1+" = "+sec);
        }
        if(a==5)
        {
            System.out.println("cosec "+n1+" = "+cosec);
        }
        if(a==6)
        {
            System.out.println("cot "+n1+" = "+cot);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Select any one type of operation:\n1) Arithmetic\n2)Logarithm\n3)Quadratic\n4)Trigonometric");
        int a=s.nextInt();
        if (a==1)
        {
            Maths(); 
        } 
        if(a==2)
        {
            Logarithm();
        }
        if(a==3)
        {
            Quad();
        }
        if(a==4)
        {
            Trignometric();
        }
    }
}