/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt47;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    int[]arr;
    int position;
    Scanner sc;
    public RandomArray()
    {
        arr=new int[101];
        int n;
        System.out.println("Nhap vao so phan tu (n<100)");
        sc= new Scanner(System.in   );
        n=sc.nextInt();
        Random rd= new Random();
        for(int i=0;i<n;i++)
           arr[i]=rd.nextInt(100)+1;
    }
    public void inMang()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+"\t");
            }
            else
                break;
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public void themGiaTri()
    {
        System.out.println("Nhap gia tri can them(>0)");
        int data=sc.nextInt();
        int count=0;
        for(int i=0;i<100;i++)
        {
            if(arr[i]==0)
            {
                count=i;
                break;
            }
        }
        if(count>=99)
            System.out.println("Khong the them");
        else
        {
            for(int i=count;i>=position;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[position]=data;
        }
    }
    public void sapxepMangNhoNhat()
    {
        for(int i=0;i<99;i++)
        {
            if(arr[i]==0)
            {
                break;
            }
            else
            {
                for(int j=i+1;j<100;j++)
                {
                    if(arr[j]==0)
                        break;
                    else
                    {
                        if(arr[i]>arr[j])
                        {
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
            }
        }
    }
    public int gtNhoNhat()
    {
        return arr[0];
    }
    public int tinhtong()
    {
        int tong=0;
        for(int i=0;i<100;i++)
        {
            if(arr[i]==0)
                break;
            else
                tong+=arr[i];
        }
        return tong;
    }
}
