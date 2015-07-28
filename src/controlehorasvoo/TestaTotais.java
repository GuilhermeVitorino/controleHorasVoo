/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlehorasvoo;

import java.util.ArrayList;
import sun.applet.Main;

/**
 *
 * @author anonymous
 */
public class TestaTotais {
    public static void main(String[] args) {
       RegistroDao reg = new RegistroDao();
        ArrayList<Registro> arrReg = reg.getListaTotais();
        
        for(Registro x : arrReg)
            System.out.println(x.getDiurno()); 
    }
}
