package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    static void main(String[] args) {
        /*Checked e Unchecked*/


       /* Object object = null;
        System.out.println(object.toString());*/
        /*Exception in thread "main"
        java.lang.NullPointerException:
        Cannot invoke "Object.toString()" because "object"
        is null
         */

        int[] numeros = {1, 2, 3};
        System.out.println(numeros[6]);
        /*Exception in thread "main"
        java.lang.ArrayIndexOutOfBoundsException:
        Index 6 out of bounds for length 3
        at academy.devdojo.maratonajava.javacore.
        Oexception.runtime.test.
        RunTimeExceptionTest01.main
        (RunTimeExceptionTest01.java:17)
         */
    }
}
