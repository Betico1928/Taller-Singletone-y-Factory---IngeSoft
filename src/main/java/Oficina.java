public class Oficina
{
    //Declare variables
    private int idOficina;
    private String nombreOficina;

    //Constructor
    public Oficina (int idOficina, String nombreOficina)
    {
        this.idOficina = idOficina;
        this.nombreOficina = nombreOficina;
    }

    // Getters y Setters
    // Getter idOficina
    public int getIdOficina()
    {
        return idOficina;
    }

    // Setter idOficina
    public void setIdOficina(int idOficina)
    {
        this.idOficina = idOficina;
    }

    // Getter nombreOficina
    public String getNombreOficina()
    {
        return nombreOficina;
    }

    // Setter nombreOficina
    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    // Fabrica Oficina
    public static Oficina fabricaOficina (int numeroOficina)
    {
        // Verificar si el # de la oficina esta bien
        if (numeroOficina == 0 || numeroOficina > 7)
        {
            return null;
        }
        else
        {
            //Dependiendo del # de oficina, le asigna un nombre (Switch exotico de IntelliJ
            return switch (numeroOficina) {
                case 1 -> new Oficina(1, "Oficina Pricipal");
                case 2 -> new Oficina(2, "Oficina Barrio cercano");
                case 3 -> new Oficina(3, "Oficina Barrio Lejano");
                case 4 -> new Oficina(4, "Oficina Jubilados");
                case 5 -> new Oficina(5, "Oficina Juvenil");
                case 6 -> new Oficina(6, "Oficina horario extendido");
                case 7 -> new Oficina(7, "Oficina horario corto");
                default ->
                        throw new IllegalArgumentException("El numero de oficina " + numeroOficina + " es invalido. Escriba bien");
            };
        }
    }
}
