/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package but;
import java.awt.*;
import java.awt.event.*;


public class But extends Frame {
  public But() {
        
        Label l = new Label("Name:");
        TextField t = new TextField("Enter your name");
        Label l2 = new Label("email:");
        TextField t2 = new TextField("Enter your email");
        Label l3 = new Label("password:");
        TextField t3 = new TextField("Enter your password");
        Label l4 = new Label("choice:");
        Choice c=new Choice();
        c.add("english");
        c.add("tamil");
        c.add("hindi");
        Button b=new Button("submit");
        
        l.setBounds(10, 50, 80, 30);
        t.setBounds(100, 50, 150, 30);
        l2.setBounds(10, 100, 80, 30);
        t2.setBounds(100, 100, 150, 30);
        l3.setBounds(10, 150, 80, 30);
        t3.setBounds(100, 150, 150, 30);
        l4.setBounds(10, 200, 80, 30);
        c.setBounds(100,200,150,30);
        b.setBounds(90, 250, 100, 30);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                System.out.println( t.getText());
                System.out.println( t2.getText());
              System.out.println( t3.getText());
              System.out.println( c.getSelectedItem());
            }
        });

       
          
        
        setLayout(null);
        setVisible(true);
      
        add(b);
        add(l);
        add(t);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(c);

        
        setSize(500,500);
        
        
        
    }
    public static void main(String[] args) {
       
        new But();
    }
    
}

