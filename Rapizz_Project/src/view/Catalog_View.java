package view;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catalog_View extends JFrame implements ActionListener
{
    JPanel contentPane;
    JButton btnpre;
    JLabel lbl_title;
    JLabel lbl_pizza1;
    JLabel lbl_pizza2;
    JLabel lbl_pizza3;
    JLabel lbl_pizza4;
    JLabel lbl_pizza5;
    JLabel drink;
    JLabel lbl_pizza_name1;
    JLabel lbl_pizza_name2;
    JLabel lbl_pizza_name3;
    JLabel lbl_pizza_name4;
    JLabel lbl_pizza_name5;
    JLabel lbl_drinks;

    Image img_pizza1 = new ImageIcon(Purchase.class.getResource("Images/DiNapoli.jfif")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    Image img_pizza2 = new ImageIcon(Purchase.class.getResource("Images/Reine.jfif")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    Image img_pizza3 = new ImageIcon(Purchase.class.getResource("Images/Paysanne.jfif")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    Image img_pizza4 = new ImageIcon(Purchase.class.getResource("Images/Exotique.jfif")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    Image img_pizza5 = new ImageIcon(Purchase.class.getResource("Images/Capri.jfif")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);

    Image img_drink = new ImageIcon(Purchase.class.getResource("Images/Boissons.jfif")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    

    public void show_catalogFrame()
    {
        this.setTitle("Catalogue");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);

        JButton btnpre = new JButton("Retour à la fenêtre précedente");
        btnpre.setBounds(25, 25, 230, 20);
        btnpre.setBackground(Color.BLACK);
        btnpre.setForeground(Color.WHITE);
        contentPane.add(btnpre);

        btnpre.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Main_menu m = new Main_menu();
                m.show_orderingFrame();
            }
        });

        // Le titre

        JLabel lbl_title = new JLabel("Catalogue des pizzas !");
        lbl_title.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_title.setBounds(250, 50, 500, 75);
        lbl_title.setForeground(Color.BLACK);
        contentPane.add(lbl_title);

        //Images des 5 pizzas 

        lbl_pizza1 = new JLabel("");
        lbl_pizza1.setIcon(new ImageIcon(img_pizza1));
        lbl_pizza1.setBounds(50, 150, 90, 60);
        contentPane.add(lbl_pizza1);

        lbl_pizza2 = new JLabel("");
        lbl_pizza2.setIcon(new ImageIcon(img_pizza2));
        lbl_pizza2.setBounds(200, 150, 90, 60);
        contentPane.add(lbl_pizza2);

        lbl_pizza3 = new JLabel("");
        lbl_pizza3.setIcon(new ImageIcon(img_pizza3));
        lbl_pizza3.setBounds(350, 150, 90, 60);
        contentPane.add(lbl_pizza3);

        lbl_pizza4 = new JLabel("");
        lbl_pizza4.setIcon(new ImageIcon(img_pizza4));
        lbl_pizza4.setBounds(500, 150, 90, 60);
        contentPane.add(lbl_pizza4);

        lbl_pizza5 = new JLabel("");
        lbl_pizza5.setIcon(new ImageIcon(img_pizza5));
        lbl_pizza5.setBounds(650, 150, 90, 60);
        contentPane.add(lbl_pizza5);

        drink = new JLabel("");
        drink.setIcon(new ImageIcon(img_drink));
        drink.setBounds(320, 400, 200, 125);
        contentPane.add(drink);


        lbl_pizza_name1 = new JLabel("Di Napoli, prix : 9.5");
        lbl_pizza_name1.setBounds(38, 200, 150, 90);
        contentPane.add(lbl_pizza_name1);

        lbl_pizza_name1 = new JLabel("Reine, prix : 7.0");
        lbl_pizza_name1.setBounds(188, 200, 150, 90);
        contentPane.add(lbl_pizza_name1);

        lbl_pizza_name1 = new JLabel("Paysanne, prix : 8.5");
        lbl_pizza_name1.setBounds(338, 200, 150, 90);
        contentPane.add(lbl_pizza_name1);

        lbl_pizza_name1 = new JLabel("Exotique, prix : 11.5");
        lbl_pizza_name1.setBounds(488, 200, 150, 90);
        contentPane.add(lbl_pizza_name1);

        lbl_pizza_name1 = new JLabel("Capri, prix : 5.0");
        lbl_pizza_name1.setBounds(638, 200, 150, 90);
        contentPane.add(lbl_pizza_name1);


        lbl_drinks = new JLabel("Boissons, c'est gratuit");
        lbl_drinks.setBounds(300, 300, 150, 90);
        contentPane.add(lbl_drinks);

        






    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}