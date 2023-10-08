package view;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Sold extends JFrame implements ActionListener
{
    JPanel contenuFenêtre;
	JTextField champAffichage;
	 JButton bouton0;
	 JButton bouton1;
	 JButton bouton2;
	 JButton bouton3;
	 JButton bouton4;
	 JButton bouton5;
	 JButton bouton6;
	 JButton bouton7;
	 JButton bouton8;
	 JButton bouton9;
	 
	 JButton boutonVirgule;
	 JButton boutonEgale;

	 JButton plus;
	 JButton moins;
	 JButton fois;
	 JButton div;
     

    public void show_soldFrame()
    {
        contenuFenêtre=new JPanel();
		this.getContentPane().add(contenuFenêtre);
		contenuFenêtre.setLayout(new BorderLayout());
		champAffichage = new JTextField("0");

		contenuFenêtre.add(BorderLayout.NORTH,champAffichage);
	
	bouton0 = new JButton("0");
	bouton1 = new JButton("1");
	bouton2 = new JButton("2");
	bouton3 = new JButton("3");
	bouton4 = new JButton("4");
	bouton5 = new JButton("5");
	bouton6 = new JButton("6");
	bouton7 = new JButton("7");
	bouton8 = new JButton("8");
	bouton9 = new JButton("9");
	boutonVirgule = new JButton(",");
	boutonEgale  = new JButton("=");

	

	JPanel panneauChiffres = new JPanel();
	  GridLayout disposition2 = new GridLayout(4, 3); 

	  panneauChiffres.setLayout(disposition2);

		

	  panneauChiffres.add(bouton1);
	  panneauChiffres.add(bouton2);
	  panneauChiffres.add(bouton3);
	  panneauChiffres.add(bouton4);
	  panneauChiffres.add(bouton5);
	  panneauChiffres.add(bouton6);
	  panneauChiffres.add(bouton7);
	  panneauChiffres.add(bouton8);
	  panneauChiffres.add(bouton9);
	  panneauChiffres.add(bouton0);
	  panneauChiffres.add(boutonVirgule);
	  panneauChiffres.add(boutonEgale);


	  contenuFenêtre.add(BorderLayout.CENTER, panneauChiffres);

	  JPanel op = new JPanel();
	  GridLayout disposition3 = new GridLayout(4,1);
	  op.setLayout(disposition3);
	  plus = new JButton("+");
	  moins = new JButton("-");
	  fois= new JButton("*");
	  div = new JButton("/");
	  op.add(plus);
	  op.add(moins);
	  op.add(fois);
	  op.add(div);
	  
	  contenuFenêtre.add(BorderLayout.EAST,op);
	  
	  this.setVisible(true);
	  this.pack();
    }
    

		
	


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
