/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt47;

public class Main {
    public static void main(String[] args)
    {
        RandomArray arr=new RandomArray();
        arr.inMang();
        arr.setPosition(4);
        arr.themGiaTri();
        arr.inMang();
        arr.sapxepMangNhoNhat();
        arr.inMang();
        System.err.println("");
        System.out.println("Gia tri nho nhat: "+arr.gtNhoNhat());
        System.out.println("Tong gia tri mang: "+arr.tinhtong());
    }
}
