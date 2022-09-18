package vista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class PanelOperacion extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    public JButton btHallarMayor;
    public JButton btBorrar;
    public JButton btSalir;

    //---------------------------
    // Metodos
    //---------------------------
    //Metodo constructor
    public PanelOperacion()
    {
         //Definir contenedor del panel
         this.setLayout(null);
         this.setBackground(Color.WHITE);

         //Crear y agregar boton HallarMayor
         btHallarMayor = new JButton("Hallar Mayor");
         btHallarMayor.setBounds(30,20,110,20);
         btHallarMayor.setActionCommand("hallarMayor");
         this.add(btHallarMayor);

         //Crear y agregar boton Borrar
         btBorrar = new JButton("Borrar");
         btBorrar.setBounds(164,20,110,20);
         btBorrar.setActionCommand("borrar");
         this.add(btBorrar);
         //Crear y agregar boton Salir
         btSalir = new JButton("Salir");
         btSalir.setBounds(321,20,110,20);
         btSalir.setActionCommand("salir");
         this.add(btSalir);
         //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Operaciones");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
    }
}