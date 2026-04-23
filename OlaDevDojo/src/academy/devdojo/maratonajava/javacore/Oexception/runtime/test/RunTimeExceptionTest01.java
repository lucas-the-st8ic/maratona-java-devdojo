package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    static void main(String[] args) {
        /*Checked e Unchecked*/


        Object object = null;
        System.out.println(object.toString());
        /*Exception in thread "main"
        java.lang.NullPointerException:
        Cannot invoke "Object.toString()" because "object"
        is null
         */

        int[] numeros = {1, 2, 3};
        System.out.println(numeros[4]);
        /*Exception in thread "main"
        java.lang.NullPointerException:
        Cannot invoke "Object.toString()"
        because "object" is null
         */
    }
}
