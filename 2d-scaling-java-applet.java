/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;

/**
 *
 * @author CSE_IT
 */
public class NewApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        Scanner s=new Scanner (System.in);
        g.drawRect(10, 20, 50, 50);
        
        int sx,sy,xp,yp;
        System.out.println("Enter SX Value");
        sx=s.nextInt();
        System.out.println("Enter SY Value");
        sy=s.nextInt();
        xp=sx*50;
        yp=sy*50;
        g.drawRect(10, 20, xp, yp);
        
    }

    
}
