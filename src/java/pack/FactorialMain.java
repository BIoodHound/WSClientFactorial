/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author gonca
 */
public class FactorialMain {

    public static void main(String[] args) {
        int x = 1;
        System.out.println(factorial(x));
    }

    private static int factorial(int x) {
        pack.FactorialService service = new pack.FactorialService();
        pack.Factorial port = service.getFactorialPort();
        return port.factorial(x);
    }

    
}
