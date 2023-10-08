package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Main_menu extends JFrame implements ActionListener
{
    JPanel contentPanel;
    JButton btn_commander;
    JButton catalog;
    JButton btn_quitter;
    JLabel lbl_title;

    public void show_mainFrame()
    {

    }

    public void show_registerFrame() 
    {
        
    }

    
    public void show_checkFrame()
    {

    }

    public void show_orderingFrame()
    {

    }

    public Main_menu()
    {
        

        this.setTitle("Rapizz Frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
        

        // Definir le contenu du menu d'Accueil

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        //contentPane.setBackground(Color.WHITE);

        // Defini les composantes + position
 
        // Ajouter une chaîne (étiquette) pour le titre du sujet + une image + ses caractéristiques

        JLabel lbl_title = new JLabel("Bienvenue à Rapizz !");
        lbl_title.setFont(new Font("Arial", Font.BOLD, 30));
        lbl_title.setBounds(250, 50, 500, 75);
        lbl_title.setForeground(Color.BLACK);
        contentPane.add(lbl_title);



        // Le catalogue

        catalog = new JButton("Catalogue");
        catalog.setBounds(300, 175, 200, 60);
        catalog.setBackground(Color.BLACK);
        catalog.setForeground(Color.WHITE);
        contentPane.add(catalog);

        catalog.addActionListener((ActionListener) new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Catalog_View ca = new Catalog_View();
                ca.show_catalogFrame();
            }
        });

        // La commande

        btn_commander = new JButton("Commander");
        btn_commander.setBounds(300, 275, 200, 60);
        btn_commander.setBackground(Color.BLACK);
        btn_commander.setForeground(Color.WHITE);
        contentPane.add(btn_commander);

        btn_commander.addActionListener((ActionListener) new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                Check c = new Check();
                c.show_checkFrame();
            }
        });


        // Lorsqu'on quitte la fenêtre

        btn_quitter = new JButton("Quitter");
        btn_quitter.setBounds(300, 375, 200, 60);
        btn_quitter.setBackground(Color.BLACK);
        btn_quitter.setForeground(Color.WHITE);
        contentPane.add(btn_quitter);

        btn_quitter.addActionListener(e -> 
        {
            this.dispose();
        });
    }

    public static void main(String[] agrs)
    {
        // Permet d'afficher la fenêtre

        Main_menu window = new Main_menu();
        window.setVisible(true);
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    


    
}

