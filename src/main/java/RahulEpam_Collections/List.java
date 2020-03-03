package RahulEpam_Collections;

import java.util.Scanner;

public class List {
    public static  void main(String Args[])
    {
        Scanner sc= new Scanner(System.in);
        DemoList dl= new DemoList();
        int ch;
        while (sc.hasNext())
        {
            ch=sc.nextInt();
            if (ch==1)
            {
              dl.addelement(sc.nextInt());
            }
            else if(ch==2 )
            {
                System.out.println("Element is:"+dl.getElement(sc.nextInt()));
            } else if(ch==3)
            {
                System.out.println("Position is:"+dl.position(sc.nextInt()));
            }
            else if(ch==4)
            {
                dl.remove(sc.nextInt());
            }
            else if(ch==5)
            {
                dl.removelast();
            }
            else
            {
                dl.print();
            }
        }
    }
}
