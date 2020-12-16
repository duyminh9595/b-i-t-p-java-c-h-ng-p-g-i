/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt46;

import java.util.Random;
import java.util.Scanner;

public class Mang {
    int[]arr;
    public Mang()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong di 3be ui");
        n=sc.nextInt();
        arr=new int[n];
        Random rd= new Random();
        for(int i=0;i<n;i++)
        {
            arr[i]=rd.nextInt(100)+1;
            System.out.print(arr[i]+"\t");
        }
    }
    public void sapxepnho()
    {
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
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
    public void sapxeplom()
    {
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public int gtnhonhat()
    {
        return arr[0];
    }
    public void xuatmang()
    {
        for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i]+"\t");
    }
}
