import java.util.*;
//Bubble class created
class Bubble
{
    private int a[], n;
    
    Scanner scan = new Scanner(System.in);

    public void getdata()
    {
        System.out.println("Enter Size of List : ");
        n = scan.nextInt();
        a = new int[n];

        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter "+(i+1)+" :");
            a[i] = scan.nextInt();
        }

       
    }

    public void Sort()
    {
        int flag = 1;
        for(int i = 0;  i<n; i++)
        {
            for(int j = 0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = 0;
                }
            }

            if(flag==1)
                break;
            else
                flag = 1;
        }
      
    }

    public void display()
    {
        for(int i = 0; i<n; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}


public class BubbleSort 
{
    public static void main(String args[])
    {
        Bubble b1 = new Bubble();
        b1.getdata();
        b1.Sort();
        System.out.println("SORTED LIST : " );

        b1.display();
    }
}
