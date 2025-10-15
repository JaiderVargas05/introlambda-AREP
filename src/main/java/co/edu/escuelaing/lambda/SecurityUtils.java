/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.lambda;

/**
 *
 * @author jaider.vargas-n
 */
public class SecurityUtils {
    public static User login(User u){
        System.out.println("Username: "+ u.getUsername());
        System.out.println("Password: "+ u.getPassword());
        u.setPassword("");
        return u;
    }
}
