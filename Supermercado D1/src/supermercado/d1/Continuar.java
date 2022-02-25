/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.d1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Continuar extends JFrame {

    public JPanel Panel;
    public JLabel Msg;
    public JTextField Continuar;
    public JButton Envio;
    public int X;
    public Continuar() {
        this.setSize(700, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Supermercado D1");
        this.setLocationRelativeTo(null);
        Panel = new JPanel();
        Color Bg = new Color(222, 25, 25);
        Panel.setBackground(Bg);
        this.getContentPane().add(Panel);
        Panel.setLayout(null);
        JLabel Text = new JLabel();
        Text.setText("Supermercado D1");
        Text.setBounds(225, 50, 250, 50);
        Text.setForeground(Color.BLUE);
        Text.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Text.setOpaque(true);
        Panel.add(Text);
    }

    public int Mensaje() {
        Msg = new JLabel("Digite el Id del producto");
        Msg.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
        Msg.setBounds(225, 100, 300, 50);
        Panel.add(Msg);

        Continuar = new JTextField();
        Continuar.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
        Continuar.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));
        Continuar.setBackground(Color.white);
        Continuar.setBounds(225, 150, 250, 40);
        Panel.add(Continuar);
        
        Envio= new JButton("Añadir");
        Envio.setBackground(Color.white);
        Envio.setBounds(225, 300, 250, 40);
        Envio.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
        Panel.add(Envio);
        
        
        ActionListener Agregar=new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent ae) {
                X=Integer.parseInt(Continuar.getText());
            }
        };
        
        Envio.addActionListener(Agregar);
        return(X);
    }
}
