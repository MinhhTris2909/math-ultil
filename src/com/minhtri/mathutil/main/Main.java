/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtri.mathutil.main;

import com.minhtri.mathutil.core.MathUtil;

/**
 *
 * @author Tranduc
 */
public class Main {
    public static void main(String[] args) {
      //thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hhay ko
      //ta phari dua ra cac tinh huong su dung ham trong thuc te
      //vd: -5 coi tinh dc ko
      //    0 coi tinh dc mmay
      //    21 coi tinh dc may
      //Test Case: 1 tinh huong ham/app/man hinh/tinh nang dc dua vao su dung
      //gia lap hanh vi xai cua ai do
      
      //Test case: la 1 tinh huong su dung app, xai app ma no bao gom
      //Data dau vao cu the nao do
      //Output dau ra ung voi xu ly cua ham cua app, di nhien dung dau vao de xu ly
      //Ky vong: mong ham se tra ve value nao do ung voi innput o tren
      //so sanh ket qua co nhu ky vong hay ko
      long expected = 120; //ham oi ve 120 neu tinh 5!
      int n = 5;           // input
      long actual = MathUtil.getFactorial(n);
      System.out.println("5! = " + expected + " expected");
      System.out.println("5! = " + actual + " actual");
    }
}
