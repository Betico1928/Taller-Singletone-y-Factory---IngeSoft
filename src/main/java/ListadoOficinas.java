import java.util.List;

public class ListadoOficinas
{
    // Declare variables
    private List<Oficina> ListaDeOficinas;
    public static ListadoOficinas ListadoOficinas_instance = null;

    // Constructor
    public ListadoOficinas(List<Oficina> listaDeOficinas)
    {
        ListaDeOficinas = listaDeOficinas;
    }

    // Metodo ListadoOficinas
    public ListadoOficinas(){}


    // Getters & Setters
    // Getter ListadoDeOficinas
    public List<Oficina> getListaDeOficinas()
    {
        return ListaDeOficinas;
    }

    // Setter ListadoDeOficinas
    public void setListaDeOficinas(List<Oficina> listaDeOficinas) {
        ListaDeOficinas = listaDeOficinas;
    }



    // Singleton: Devuelve  una instancia unica del objeto y que no se pueden crear mas
    public static ListadoOficinas getInstance()
    {
        // Si no existe lo crea
        if (ListadoOficinas_instance == null)
        {
            ListadoOficinas_instance = new ListadoOficinas();
        }
        // Devuelve oficina
        return ListadoOficinas_instance;
    }
}
