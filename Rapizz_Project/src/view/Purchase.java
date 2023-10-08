package view;

import model.Order;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Purchase extends JFrame implements ActionListener
{
    JPanel contentPane;
    JButton btnpre;
    JButton btn_minus;
    JButton btn_plus;
    JButton btn_bill;
    JButton btn_order_again;
    JLabel lbl_pizzaName;
    JLabel lbl_sizeName;
    JLabel lbl_price_rBtn1;
    JLabel lbl_price_rBtn2;
    JLabel lbl_price_rBtn3;
    JLabel lbl_quantity_number;
    JLabel lbl_results ;
    JLabel lbl_quantity;
    JLabel lbl_bike_or_car;
    int count = 1;
    JComboBox combobox;
    JRadioButton rBtn1, rBtn2, rBtn3;
    JRadioButton rBtn_bike, rBtn_car;
    ButtonGroup bg;
    ButtonGroup bg2;
    JTextArea result_area ;
    String pizza_name[]  = {"Di Napoli", "Reine", "Paysanne", "Exotique", "Capri"};

 

    public void show_purchaseFrame()
    {
        this.setTitle("Paiement");
        this.setVisible(true);

        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        //contentPane.setBackground(Color.LIGHT_GRAY);

        btnpre = new JButton("Retour à la fenêtre précedente");
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
                Ordering o = new Ordering();
                o.show_orderingFrame();
            }
        });

        // Label qui désigne le choix d'une pizza

        lbl_pizzaName = new JLabel("Selectionnez une pizza :");
        lbl_pizzaName.setFont(new Font("Arial", Font.BOLD, 10));
        lbl_pizzaName.setBounds(30, 60, 300, 20);
        lbl_pizzaName.setForeground(Color.BLACK);
        contentPane.add(lbl_pizzaName);

        // Menu qui permet de choisir une pizza ou plusieurs

    
        combobox = new JComboBox(pizza_name);
        combobox.setBounds(50, 80, 100, 20);
        contentPane.add(combobox);

        combobox.addActionListener (new ActionListener()
        {
           public void actionPerformed(ActionEvent arg0)
           {
                priceSize();
           }
        });
        

        // Label qui désigne le choix de la taille

        lbl_sizeName = new JLabel("Selectionnez une taille :");
        lbl_sizeName.setFont(new Font("Arial", Font.BOLD, 10));
        lbl_sizeName.setBounds(30, 100, 500, 20);
        lbl_sizeName.setForeground(Color.BLACK);
        contentPane.add(lbl_sizeName);

        // Le choix de la taille

        

        bg = new ButtonGroup(); 
        


        rBtn1 = new JRadioButton("Naine");
        rBtn1.setBounds(50, 120, 100, 20);
        contentPane.add(rBtn1);

        lbl_price_rBtn1 = new JLabel();
        lbl_price_rBtn1.setFont(new Font("Arial", Font.BOLD, 12));
        lbl_price_rBtn1.setBounds(200, 120, 100, 20);
        lbl_price_rBtn1.setForeground(Color.BLACK);
        contentPane.add(lbl_price_rBtn1);

        rBtn2 = new JRadioButton("Humaine");
        rBtn2.setBounds(50, 140, 100, 20);
        contentPane.add(rBtn2);

        lbl_price_rBtn2 = new JLabel();
        lbl_price_rBtn2.setFont(new Font("Arial", Font.BOLD, 12));
        lbl_price_rBtn2.setBounds(200, 140, 100, 20);
        lbl_price_rBtn2.setForeground(Color.BLACK);
        contentPane.add(lbl_price_rBtn2);

        rBtn3 = new JRadioButton("Ogresse");
        rBtn3.setBounds(50, 160, 100, 20);
        contentPane.add(rBtn3);

        lbl_price_rBtn3 = new JLabel();
        lbl_price_rBtn3.setFont(new Font("Arial", Font.BOLD, 12));
        lbl_price_rBtn3.setBounds(200, 160, 100, 20);
        lbl_price_rBtn3.setForeground(Color.BLACK);
        contentPane.add(lbl_price_rBtn3);

        bg.add(rBtn1);
        bg.add(rBtn2);  
        bg.add(rBtn3);  

        lbl_quantity_number = new JLabel("Quantité :");
        lbl_quantity_number.setFont(new Font("Arial", Font.BOLD, 10));
        lbl_quantity_number.setBounds(30, 180, 500, 20);
        lbl_quantity_number.setForeground(Color.BLACK);
        contentPane.add(lbl_quantity_number);

        btn_minus = new JButton("-");
        btn_minus.setBounds(40, 200, 40, 20);
        btn_minus.setBackground(Color.BLACK);
        btn_minus.setForeground(Color.WHITE);
        contentPane.add(btn_minus);

        btn_minus.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                if(count > 0)
                {
                    count--;
                    lbl_quantity.setText(String.valueOf(count));
                }
            }
        });

        lbl_quantity = new JLabel("1");
        lbl_quantity.setFont(new Font("Arial", Font.BOLD, 8));
        lbl_quantity.setBounds(105, 200, 10, 20);
        lbl_quantity.setForeground(Color.BLACK);
        contentPane.add(lbl_quantity);


        btn_plus = new JButton("+");
        btn_plus.setBounds(140, 200, 45, 20);
        btn_plus.setBackground(Color.BLACK);
        btn_plus.setForeground(Color.WHITE);
        contentPane.add(btn_plus);

        btn_plus.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                count++;
                lbl_quantity.setText(String.valueOf(count));
            }
        });

        lbl_bike_or_car = new JLabel("Mode de livraison :");
        lbl_quantity.setFont(new Font("Arial", Font.BOLD, 8));
        lbl_bike_or_car.setBounds(30, 250, 120, 40);
        lbl_bike_or_car.setBackground(Color.BLACK);
        contentPane.add(lbl_bike_or_car);

        bg2 = new ButtonGroup();

        rBtn_bike = new JRadioButton("Moto");
        rBtn_bike.setBounds(50, 285, 100, 20);
        contentPane.add(rBtn_bike);

        rBtn_car = new JRadioButton("Voiture");
        rBtn_car.setBounds(50, 310, 100, 20);
        contentPane.add(rBtn_car);

        
        bg2.add(rBtn_bike);
        bg2.add(rBtn_car);  


        btn_bill = new JButton("Facturation");
        btn_bill.setBounds(65, 450, 100, 40);
        btn_bill.setBackground(Color.BLACK);
        btn_bill.setForeground(Color.WHITE);
        contentPane.add(btn_bill);

        btn_bill.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                showOrderResults();
            }
        });


        btn_order_again = new JButton("Re-Commander");
        btn_order_again.setBounds(45, 500, 150, 40);
        btn_order_again.setBackground(Color.BLACK);
        btn_order_again.setForeground(Color.WHITE);
        contentPane.add(btn_order_again);

        btn_order_again.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                clearOrderResults();
            }
        });

        lbl_results = new JLabel("Résultat de la commande :");
        lbl_results.setFont(new Font("Arial", Font.BOLD, 15));
        lbl_results.setBounds(300, 60, 500, 20);
        lbl_results.setForeground(Color.BLACK);
        contentPane.add(lbl_results);

        result_area = new JTextArea();
        result_area.setBounds(300, 100, 450, 300);
        contentPane.add(result_area);
    }



    public void priceSize()
    {
        if(combobox.getSelectedIndex() == 0)
        {   
            lbl_price_rBtn1.setText("6.33");
            lbl_price_rBtn2.setText("9.5");
            lbl_price_rBtn3.setText("12.67");
        }
        else if(combobox.getSelectedIndex() == 1)
        {
            lbl_price_rBtn1.setText("4.77");
            lbl_price_rBtn2.setText("7.0");
            lbl_price_rBtn3.setText("9.33");
        }
        else if(combobox.getSelectedIndex() == 2)
        {
            lbl_price_rBtn1.setText("5.77");
            lbl_price_rBtn2.setText("8.5");
            lbl_price_rBtn3.setText("11.33");
        }
        else if(combobox.getSelectedIndex() == 3)
        {
            lbl_price_rBtn1.setText("7.67");
            lbl_price_rBtn2.setText("11.5");
            lbl_price_rBtn3.setText("15.33");
        }
        else if(combobox.getSelectedIndex() == 4)
        {
            lbl_price_rBtn1.setText("3.33");
            lbl_price_rBtn2.setText("5.0");
            lbl_price_rBtn3.setText("6.67");
        }
    }
    
    public String pizzaSize()
    {
        String size = "";

        if(rBtn1.isSelected())
        {
            size = rBtn1.getText();
        }
        else if(rBtn2.isSelected())
        {
            size = rBtn2.getText();
        }
        else if(rBtn3.isSelected())
        {
            size = rBtn2.getText();
        }

        return size;
    }

    public double pizzaPrice()
    {
        double pizza_price = 0.0;

        if(rBtn1.isSelected())
        {
            pizza_price = Double.parseDouble(lbl_price_rBtn1.getText());
        }
        if(rBtn2.isSelected())
        {
            pizza_price = Double.parseDouble(lbl_price_rBtn2.getText());
        }
        if(rBtn3.isSelected())
        {
            pizza_price = Double.parseDouble(lbl_price_rBtn3.getText());
        }

        return pizza_price;
    }

    public String deliveryMethod()
    {
        String method = "";

        if(rBtn_bike.isSelected())
        {
            method = "Moto";
        }
        else if(rBtn_car.isSelected())
        {
            method = "Voiture";
        }
        return method;
    }

    public double totalPrice()
    {
        double total = 0.0;
        total = pizzaPrice();
        return total;
    }

    public void clearOrderResults()
    {
        result_area.setText(null);
    }

    public void showOrderResults()
    {
        double total_price = 0.0;
        int quantity = Integer.parseInt(lbl_quantity.getText());
        total_price = totalPrice() * quantity;

        result_area.setText("\n Pizza choisie: \t" + combobox.getSelectedItem()
        + "\n\n Taille de la pizza: \t" + pizzaSize() 
        + "\n\n Prix de la pizza: \t" + pizzaPrice()
        + "\n\n Quantitée prise: \t\t" + quantity
        + "\n\n Méthode de Livraison : \t\t" + deliveryMethod()
        + "\n\n==========================================================================="
        + "\n\n Prix total de la commande ==> \t\t" + total_price
        );
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

