/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.primary.project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Main extends JFrame implements ActionListener{
    JButton btn;
    Container con;
    
    Main(){
    con=getContentPane();
    con.setLayout(new FlowLayout());
     JTextArea area;
    
    btn=new JButton("Color");
    btn.addActionListener(this);
    con.add(btn);
    
     area=new JTextArea(200,300);
        area.setBounds(15, 50, 200, 200);
        Font font= new Font("Verdana",Font.BOLD,16);
        
        area.setBackground(Color.WHITE);
        area.setForeground(Color.PINK);
        area.setFont(font);
        
         add(area);
      
    }
     public static void main (String[] args){
        Main m =new Main();
        m.setSize(500, 500);
        m.setVisible(true);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

 @Override
    public void actionPerformed(ActionEvent e) {
        Color initialcolor= Color.WHITE;
        Color colorC= JColorChooser.showDialog(this, "choose a color",initialcolor);
        con.setBackground(colorC);
    }
    }