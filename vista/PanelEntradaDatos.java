package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JLabel Lbtitulo;
    private JLabel lbLogo;
    private JLabel LbX;
    private JLabel LbY;
    private JLabel LbZ;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    private javax.swing.JTextField tfZ;



    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.YELLOW);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("MAYOR 3 ENTEROS", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Arial",Font.BOLD,20));
        Lbtitulo.setForeground(Color.BLACK);
        Lbtitulo.setBounds(10,10,465,20);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        LbX = new JLabel("X =");
        LbX.setFont(new Font("Arial",Font.BOLD,20));
        LbX.setForeground(Color.BLACK);
        LbX.setBounds(10,50,465,20);
        this.add(LbX);

        tfX = new JTextField();
        tfX.setFont(new Font("Arial", Font.PLAIN, 18));
        tfX.setForeground(Color.BLACK);
        tfX.setBounds(45, 50, 190, 30);
        this.add(tfX);

        //Crear y agregar etiqueta al titulo
        LbY = new JLabel("Y =");
        LbY.setFont(new Font("Arial",Font.BOLD,20));
        LbY.setForeground(Color.BLACK);
        LbY.setBounds(10,100,465,20);
        this.add(LbY);

        tfY = new JTextField();
        tfY.setFont(new Font("Arial", Font.PLAIN, 18));
        tfY.setForeground(Color.BLACK);
        tfY.setBounds(45, 100, 190, 30);
        this.add(tfY);

        //Crear y agregar etiqueta al titulo
        LbZ = new JLabel("Z =");
        LbZ.setFont(new Font("Arial",Font.BOLD,20));
        LbZ.setForeground(Color.BLACK);
        LbZ.setBounds(10,150,465,20);
        this.add(LbZ);

        tfZ = new JTextField();
        tfZ.setFont(new Font("Arial", Font.PLAIN, 18));
        tfZ.setForeground(Color.BLACK);
        tfZ.setBounds(45, 150, 190, 30);
        this.add(tfZ);

        lbLogo = new JLabel(new ImageIcon("imagenes/signo.png"));
        lbLogo.setBounds(250, 30, 205, 160);
        this.add(lbLogo);

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);

    }

    //Metodos de acceso a la información
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    public String getTfZ()
    {
        return tfZ.getText();
    }

    //Metodo para borrar las cajas de texto
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
        tfZ.setText("");
    }
}