/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtri.mathutil.core;

/**
 *
 * @author Tranduc
 */
public class MathUtil {
    // trong class nay cung cap cho ta rat nhieu ham xu ly toan hpc
    // clone class Math cua JDK
    // ham thu vien xai chung cho ai do ma ko can luu lai cac trang thai/gia tri
    //chon thiet ke la ham static
    
    // ham tinh giai thua !!!
    //n!=1.2.3.....n
    // ko co giai thua cho so am
    // 0!=1!=1 quy uoc
    // giai thua ham do thi doc dung, tang nhanh ve gia tri
    //20 giai thua 18 con so 0, vua kip du cho kieu long cua Java
    //21 giai thua tran kieu long
    //bai nay quy uoc tinh n! trong khoang 0-20
    public static long getFactorial(int n){
//        if(n<0 || n>20){
//            throw new IllegalArgumentException("Invalid Argument. N must be between 0 and 20");        
//        }
//        if(n==0 || n==1){
//            return 1; //ket thuc cuoc choi som neu nhan nhug dau vao dac biet
//        }
//        long product=1; //tich nhan don
//        for (int i = 2; i <= n; i++) 
//            product *= i; //product=product*i;
//           
//        return product;
        
        //Học đệ quy trong vòng 30s - RECURSION
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: COn búp bê Nga, Giống nhau và lồng trong nhau
    //Búp bê to, nhỏ hơn, nhỏ hơn nữa, ... đến điểm dừng
    
    if (n < 0 || n > 20) {
        throw new IllegalArgumentException("Invalid Argument. N must be between 0..20");
        
    }
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * getFactorial(n-1);
   
    }
     //tính giùm tui 6!
    //n! = 1.2.3.4.5.6...n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! ///điểm dừng
    // quy ước 1! = 0! = 1
    
    //chốt hạ: n! = n * (n-1)!
    
}
