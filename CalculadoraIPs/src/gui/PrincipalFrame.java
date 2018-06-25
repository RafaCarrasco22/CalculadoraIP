/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class PrincipalFrame extends JFrame{
    
    private JLabel guion;
    private JLabel guion1;
    private JLabel guion2;
    private JTextField c1;
    private JTextField c2;
    private JTextField c3;
    private JTextField c4;
    private JPanel panel;
    private JPanel panelenc;
    private JPanel panelbtn;
    private JButton btnCalcular;
    private Subnetting sub;
    
    
    
    public PrincipalFrame(){
        super("Calculadora de direcciones IP's");
        super.setSize(350, 130);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        
        //llamada
        guion = new JLabel(" - ");
        guion2 = new JLabel(" - ");
        guion1 = new JLabel(" - ");
        panel = new JPanel();
        panelenc = new JPanel();
        panelbtn = new JPanel();
        btnCalcular = new JButton("Calcular!");
          
        
       
        //celdas
        c1 = new JTextField(3);
        c2 = new JTextField(3);
        c3 = new JTextField(3);
        c4 = new JTextField(3);
        
        
        //agrega
        panel.add(c1);
        panel.add(guion2);
        panel.add(c2);
        panel.add(guion1);
        panel.add(c3);
        panel.add(guion);
        panel.add(c4);
        
        panelbtn.add(btnCalcular);
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Clase = null;
                String Uso = null;
                
                if(isNumeric(c1.getText()) && isNumeric(c2.getText()) && isNumeric(c3.getText()) && isNumeric(c4.getText())){
                    Integer campo1=Integer.parseInt(c1.getText());
                    if(campo1>=0 && campo1<=127){
                        Clase="A";
                    }else if(campo1>=128 && campo1<=191){
                        Clase="B";
                    }else if(campo1>=192 && campo1<=223){
                        Clase="C";
                    }else if(campo1>=224 && campo1<=239){
                        Clase="D";
                    }else if(campo1>=240 && campo1<=255){
                        Clase="E";
                    }
                    
                    
                Integer campo2=Integer.parseInt(c2.getText());
                Integer campo3=Integer.parseInt(c3.getText());
                Integer campo4=Integer.parseInt(c4.getText());
        
                if(campo1==0 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Reservado";
                }else if(campo1>=1 && campo1<=9 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Dirección publica";
                }else if(campo1==10 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Dirección privada";
                }else if(campo1>=11 && campo1<=126 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Dirección publica";
                }else if(campo1==127 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Reservado";
                }
    
                else if(campo1>=128 && campo1<=169 && campo2>=0 && campo2<=253 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1==169 && campo2==254 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Reservado";
                }else if(campo1==169 && campo2==255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1==170 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1==171 && campo2>=0 && campo2<=15 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1==172 && campo2>=16 && campo2<=31 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion privada";
                }else if(campo1==172 && campo2>=32 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion privada";
                }else if(campo1>=173 && campo1<=191 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1==192 && campo2>=0 && campo2<=167 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                     Uso="Direccion publica";
                }else if(campo1==192 && campo2==168 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion privada";
                }else if(campo1==192 && campo2>=169 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }else if(campo1>=193 && campo1<=223 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion publica";
                }
        
                else if(campo1>=224 && campo1<=239 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                    Uso="Direccion de multifusion";
                }

                 else if(campo1>=240 && campo1<=255 && campo2>=0 && campo2<=255 && campo3>=0 && campo3<=255 && campo4>=0 && campo4<=255 ){
                     Uso="Reservada para investigacion";
                 }
                
              
                if(Clase == null || Uso == null){
                    JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ERRONEOS");
                }else{
                    JOptionPane.showMessageDialog(null, "Clase:\n                 "+Clase);
                    JOptionPane.showMessageDialog(null, "Uso:\n              "+Uso);
                }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ERRONEOS");
                    
                }
                
                
                if(Clase == "C"){
                    sub = new Subnetting();
                    
                }
                
            }
        });
        
        
        super.add(panelenc,BorderLayout.NORTH);
        super.add(panel,BorderLayout.CENTER);
        super.add(panelbtn, BorderLayout.SOUTH);
        
        
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}

    }
}
