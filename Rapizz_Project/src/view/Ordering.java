package view;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Check;

public class Ordering extends JFrame implements ActionListener
{
    JPanel contentPane;
    JButton btnacc;
    JButton btn_catalog;
    JButton btn_purchase;
    JButton btn_sold;

    public void show_orderingFrame()
    {
        this.setTitle("Commande");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);

        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);

        btnacc = new JButton("Retour à l'accueil");
        btnacc.setBounds(25, 25, 134, 20);
        btnacc.setBackground(Color.BLACK);
        btnacc.setForeground(Color.WHITE);
        contentPane.add(btnacc);

        btnacc.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Main_menu m = new Main_menu();
                m.show_mainFrame();
            }
        });

        btn_catalog = new JButton("Consulter le catalogue");
        btn_catalog.setBounds(300, 200, 175, 50);
        btn_catalog.setBackground(Color.BLACK);
        btn_catalog.setForeground(Color.WHITE);
        contentPane.add(btn_catalog);
        

        btn_catalog.addActionListener((ActionListener) new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Catalog_View ca = new Catalog_View();
                ca.show_catalogFrame();
            }
        });

        btn_purchase = new JButton("Payer (Commander)");
        btn_purchase.setBounds(300, 300, 175, 50);
        btn_purchase.setBackground(Color.BLACK);
        btn_purchase.setForeground(Color.WHITE);
        contentPane.add(btn_purchase);

        btn_purchase.addActionListener((ActionListener) new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Purchase p = new Purchase();
                p.show_purchaseFrame();
            }
        });

        btn_sold = new JButton("Remplir le solde");
        btn_sold.setBounds(300, 400, 175, 50);
        btn_sold.setBackground(Color.BLACK);
        btn_sold.setForeground(Color.WHITE);
       // contentPane.add(btn_sold);

        btn_sold.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(true);
                Sold s = new Sold();
                s.show_soldFrame();

            }

            
        });

    }
        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
