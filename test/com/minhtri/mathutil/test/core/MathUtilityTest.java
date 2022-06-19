/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minhtri.mathutil.test.core;

import com.minhtri.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class MathUtilityTest {
    //Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit 
    //Để kiểm thử/ kiểm tra code chính - hàm tinh1GiaiThua() bên
    //Clase core.MathUtil
    //Viết code để test chính bên kia!!!

    //Có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử
    //tính huống xài hàm theo kiểu thành công và thất bại
    //Hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //Ta sẽ xài hàm kiểu well - đưa 5!, 6!, hong chơi đưa -5!, -6!, 30!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //Test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1;

        //long actual = ; // gọi là hàm cần test bên core/app chính/ code chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected vs actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);

        //Gộp thêm vài case thành công/ đưa đầu vào ngon!!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));

        //Hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko
        //Nếu giống nhau -> Màu xanh đèn đường - đường thông, code ngon
        //                  Ít nhất cho case đang test
        // Nếu ko giống nhau -> Màu đỏ đèn đường
        //                      Hàm ý expected và actual ko giống nhau.
    }

    //Hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. Đưa data tử tế trong [0-20] -> Tính đúng dc n! -> DONE
    //2. Đưa data vào cà chớn, sai (Số âm, > 20) -> Thiết kế của hàm là ném ra ngoại lệ.
    //Ta kỳ vọng ngoại lệ xuất hiện khi N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này.
    //Nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    //Hàm chạy đúng như THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    //Nếu hàm nhận n < 0 hoặc n > 20 và ko ném ra ngoại lệ
    //-> Hàm chạy sai THIẾT KẾ, SAI KỲ VỌNG, MÀU ĐỎ.
    //Test case:
    //Input: -5
    //Expected: IllegalArgumentException xuất hiện
    //Tình huống bất thường, ngoại lệ, ngoài dự tính dự liệu.
    //Là những thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường - cách chúng có xuất hiện hay không
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value!!!
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

    //Cách viết khác để bắt ngoại lệ, viết tự nhiên hơn!!!
    //Xài Lambda
    //Test case: hàm sẽ về ngoại lệ nếu nhận vào 21
    //Tui cần tháy màu xanh khi chơi với 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {

//        Assert.assertThrows(tham số 1: ngoại lệ muon so sánh, 
//                            tham số 2: đoạn code chạy văng ra ngoại lệ runnable);
        Assert.assertThrows(IllegalArgumentException.class,
                () -> {
                    MathUtil.getFactorial(-5);
                }
        );
    }
    
    //Bắt NL, xem hàm có ném vè NL hay ko khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> XANH
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5);
        }
        catch (Exception e) {
            //Bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc NL mình cần sẽ xuất hiện hay ko ???
            //Có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid Argument. N must be between 0..20", e.getMessage());
        }
    }
}
