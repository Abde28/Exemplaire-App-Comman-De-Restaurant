package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.*;

public class Check extends JFrame implements ActionListener
{
    JPanel contentPane;
    JButton btnacc;
    JButton btn_log;
    JLabel lbl_title;
    JLabel lbl_last_name;
    JLabel lbl_first_name;
    JLabel lbl_num_tel;
    JLabel lbl_mdp;
    JTextField txt_last_name;
    JTextField txt_first_name;
    JTextField txt_phone_number;
    JPasswordField txt_psw;

    public void show_checkFrame()
    {
        this.setTitle("Vérification");
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

        lbl_title = new JLabel("Connexion");
        lbl_title.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_title.setBounds(300, 50, 500, 75);
        lbl_title.setForeground(Color.BLACK);
        contentPane.add(lbl_title);


        lbl_last_name = new JLabel("Nom :");
        lbl_last_name.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_last_name.setBounds(100, 150, 500, 75);
        lbl_last_name.setForeground(Color.BLACK);
        contentPane.add(lbl_last_name);

        lbl_first_name = new JLabel("Prénom :");
        lbl_first_name.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_first_name.setBounds(100, 200, 500, 75);
        lbl_first_name.setForeground(Color.BLACK);
        contentPane.add(lbl_first_name);

        lbl_num_tel = new JLabel("Numéro de téléphone :");
        lbl_num_tel.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_num_tel.setBounds(100, 250, 500, 75);
        lbl_num_tel.setForeground(Color.BLACK);
        contentPane.add(lbl_num_tel);

        lbl_mdp = new JLabel("Mot de passe :");
        lbl_mdp.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_mdp.setBounds(100, 300, 500, 75);
        lbl_mdp.setForeground(Color.BLACK);
        contentPane.add(lbl_mdp);

        txt_last_name = new JTextField();
        txt_last_name.setBounds(325, 175, 200, 25);
        contentPane.add(txt_last_name);

        txt_last_name.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e) 
            {
              char c = e.getKeyChar();
                 if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ))
                {
                  e.consume();
                  JOptionPane.showMessageDialog(null, "Seulement les lettres dans ce champ !", "Erreur"
                  , JOptionPane.INFORMATION_MESSAGE);
              }
             }
          });

        txt_first_name = new JTextField();
        txt_first_name.setBounds(325, 225, 200, 25);
        contentPane.add(txt_first_name);

        txt_first_name.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e) 
            {
              char c = e.getKeyChar();
                 if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ))
                {
                  e.consume();
                  JOptionPane.showMessageDialog(null, "Seulement les lettres dans ce champ !", "Erreur"
                  , JOptionPane.INFORMATION_MESSAGE);
              }
             }
          });

        txt_phone_number = new JTextField();
        txt_phone_number.setDocument(new LimitJTextField(10));
        txt_phone_number.setBounds(325, 275, 200, 25);
        contentPane.add(txt_phone_number);

        
        txt_phone_number.addKeyListener(new KeyAdapter() 
        {
          public void keyTyped(KeyEvent e)
           {
              char c = e.getKeyChar();
              if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) 
              {
                  e.consume();  
                  JOptionPane.showMessageDialog(null, "Seulement les numéros dans ce champ !", "Erreur"
                  , JOptionPane.INFORMATION_MESSAGE);
              }
           }
      });
      
        txt_psw = new JPasswordField();
        txt_psw.setBounds(325, 325, 200, 25);
        contentPane.add(txt_psw);


        btn_log = new JButton("Connexion");
        btn_log.setBounds(300, 400, 200, 60);
        btn_log.setBackground(Color.BLACK);
        btn_log.setForeground(Color.WHITE);
        contentPane.add(btn_log);

        btn_log.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                is_checked();
            }

                public void is_checked()
                {
                    String last_name = txt_last_name.getText();
                    String first_name = txt_first_name.getText();
                    String numTel = txt_phone_number.getText();
                    String password = txt_psw.getText();
            
                    if(last_name.equals("MARTINEZ") && first_name.equals("Paulo") && numTel.equals("0612769809") && password.equals("Secret008")
                    || last_name.equals("ABERKA")&& first_name.equals("Abde") && numTel.equals("0169866750") && password.equals("Agent007") 
                    || last_name.equals("MAHREZ")&& first_name.equals("Riyad") && numTel.equals("0769905440") && password.equals("Cache_89")
                    || last_name.equals("BENAHMED")&& first_name.equals("Mounir") && numTel.equals("0627392021") && password.equals("Connecte_01")
                    || last_name.equals("SALAH")&& first_name.equals("Mohamed") && numTel.equals("0912345678") && password.equals("Mdrdu98"))
                    {
                      JOptionPane.showMessageDialog(null, "Connexion réussie");
    
                      setVisible(false);
                      Ordering o = new Ordering();
                      o.show_orderingFrame();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Les champs sont soit incomplets ou incorrectes !\n recommencez");
                    }
                }
            });
        }
    

      
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
}
