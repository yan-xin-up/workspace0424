package buzz.xinyan.java.Exception;

public class ArrayExceptionTest {
	
	String a = null;
	ArrayExceptionTest w = null;
    public static void main(String[] args) {
        
        //1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
        int[] arr = new int[]{1,2,3,4,5};
        
     for(int i = 0;i <arr.length;i++){
          System.out.println(arr[i]);        //越界下标只到4  不在角标正常范围均为错误
     }
        
//     System.out.println(arr[-2]);
        
     System.out.println("hello");
        
        //2.2. 空指针异常：NullPointerException
        //情况一：
//      int[] arr1 = new int[]{1,2,3};
//      arr1 = null;                //数组未赋值或为NULL 为空指针
//      System.out.println(arr1[0]);
        
        //情况二：
      int[][] arr2 = new int[4][5];
      System.out.println(arr2[0][0]);
        
//        //情况三：
//        String[] arr3 = new  String[]{"AA","BB","CC"};
//        System.out.println(arr3[0]);
//        
//        arr3[0] = null;
//        System.out.println(arr3[0]);
      ArrayExceptionTest A = new ArrayExceptionTest();
      ArrayExceptionTest b = null;
      System.out.println(b.w);
    }
}