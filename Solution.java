
public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
  
       
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
   //    System.out.println(stackTraceElements[0].getMethodName());
   //    System.out.println(stackTraceElements[1].getMethodName());
   //    System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
        
        
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    //   System.out.println(stackTraceElements[0].getMethodName());
    //   System.out.println(stackTraceElements[1].getMethodName());
    //   System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
       
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
     //  System.out.println(stackTraceElements[0].getMethodName());
     //  System.out.println(stackTraceElements[1].getMethodName());
     //  System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
      
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    //   System.out.println(stackTraceElements[0].getMethodName());
    //   System.out.println(stackTraceElements[1].getMethodName());
    //   System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
       
    }

    public static String method5() {
        //напишите тут ваш код
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    //    System.out.println(stackTraceElements[0].getMethodName());
    //   System.out.println(stackTraceElements[1].getMethodName());
    //   System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
       
    }
}
