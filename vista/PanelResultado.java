package vista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
public class PanelResultado extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    //---------------------------
    // Metodos
    //---------------------------
    //Metodo constructor
    public PanelResultado()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        //Creacion y edicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,447,150);
        this.add(spResultado);
        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
        
    }
    //Metodos de acceso a la informacion
    public void mostrarResultados(int mayor)
    {
        //taResultado.setText("El numero mayor es: " + mayor);
        taResultado.append("\nEl numero mayor es: "+ mayor);
    }

    //Borrar
    public void borrar()
    {
        taResultado.setText("");
    }
}