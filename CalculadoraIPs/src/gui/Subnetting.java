/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Rafael
 */
public class Subnetting extends JDialog{
    
    private String[] numeros = {"24","25","26","27","28","29","30"};
    private JComboBox ListaNumeros;
    private JPanel panelito;
    private JPanel p;
    private JLabel txt;
    private JLabel hosts;
    private JLabel redes;
    private JLabel mascara;
    private JLabel h;
    private JLabel r;
    private JLabel m;
    private JButton btnAcept;
    
    public Subnetting(){
        //System.out.println("hola");
        super();
        super.setSize(350, 130);
        setTitle("Subnetting clase C");
        panelito = new JPanel();
        p = new JPanel();
        txt = new JLabel("Selecciona la /red: ");
        hosts = new JLabel("Host: ");
        redes = new JLabel("Redes: ");
        mascara = new JLabel("Máscara: 255.255.255.");
        panelito.add(txt);
        btnAcept = new JButton("Aceptar");
        
        ListaNumeros = new JComboBox(numeros);
        ListaNumeros.setBackground(Color.white);
        
        panelito.add(ListaNumeros);
        panelito.add(btnAcept);
        
        btnAcept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch(ListaNumeros.getSelectedIndex()){
                    case 0:
                        h= new JLabel("256");
                        r= new JLabel("1");
                        m= new JLabel("0");
                        break;
                    case 1:
                        h= new JLabel("128");
                        r= new JLabel("2");
                        m= new JLabel("128");
                        break;
                    case 2:
                        h= new JLabel("64");
                        r= new JLabel("4");
                        m= new JLabel("192");
                        break;
                    case 3:
                        h= new JLabel("32");
                        r= new JLabel("8");
                        m= new JLabel("224");
                        break;
                    case 4:
                        h= new JLabel("16");
                        r= new JLabel("16");
                        m= new JLabel("240");
                        break;
                    case 5:
                        h= new JLabel("8");
                        r= new JLabel("32");
                        m= new JLabel("248");
                        break;
                    case 6:
                        h= new JLabel("4");
                        r= new JLabel("64");
                        m= new JLabel("252");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ERRONEOS");
                        break;
            
                }
                btnAcept.setEnabled(false);
                p.add(hosts);
                p.add(h);
                p.add(redes);
                p.add(r);
                p.add(mascara);
                p.add(m);
                
            }
        });
        
        panelito.add(p, BorderLayout.CENTER);
        super.add(panelito);
        super.setSize(350, 132);
        //super.repaint();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        
    }
}
