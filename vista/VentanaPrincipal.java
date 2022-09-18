package vista;
import javax.swing.JFrame;
public class VentanaPrincipal extends JFrame
{
    //---------------------------
    // Atributos 
    //---------------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperacion miPanelOperacion;
    public PanelResultado miPanelResultado;

    //---------------------------
    // Metodos
    //---------------------------
    // Metodo constructor
    public VentanaPrincipal()
    {
        //Definicion contenedor de la ventana
        this.setLayout(null);
        //Creación y adición de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,465,200);
        this.add(miPanelEntradaDatos);
        //Creación y adición de un panel tipo PanelOperación
        miPanelOperacion = new PanelOperacion();
        miPanelOperacion.setBounds(10,210,465,60);
        this.add(miPanelOperacion);
        //Creación y adición de un panel tipo PanelResultado
        miPanelResultado = new PanelResultado();
        miPanelResultado.setBounds(10,275,465,180);
        this.add(miPanelResultado);
        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}