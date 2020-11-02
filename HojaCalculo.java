
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author - Javier Mayor  
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;
    private int numeroFilas;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas () {

        numeroFilas = 3;
        
        if(fila1 == null){
            numeroFilas--;

        }
        if(fila2 == null){
            numeroFilas--;
        }
        if(fila3 == null){
            numeroFilas--;
        }

        return numeroFilas;
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if(getNumeroFilas() == 3){

            return true;

        }
        return hojaCompleta();
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public Fila addFila()  {
       
        
        if(getNumeroFilas() == 3){
            System.out.println("FilaX no se puede añadir en HOJAX");

        }
        else if(getNumeroFilas() < 3){
            if(fila1 == null){
               // fila1 = new Fila() ;
               nombre = "fila1";

            }
            if(fila2 == null){
               
               nombre = "fila2";
            }
            if(fila3 == null){
               
               nombre = "fila3";
               
            }

        }
        return addFila();
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        // fila1 = new Fila();
        id = "";
        // fecha = 1/10/2020;
        ingresos = 0;
        gastos = 0;
        
        
        // fila1 = new Fila();
    }
    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double totalIngresos = fila1.getIngresos() + fila2.getIngresos() + fila3.getIngresos();
        
        
        return totalIngresos;
        
        
       
    }

    
    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double totalGastos = fila1.getGastos() + fila2.getGastos() + fila3.getGastos();
        
        
        return totalGastos;

    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        return getTotalIngresos() - getTotalGastos();

    }

    // /**
     // * Representación textual de la hoja
     // * con el formato exacto que indica el enunciado
     // */
    // public String toString(String id, Fecha fecha, double ingresos, double gastos, double beneficios) {

        // // return "Hoja1" + "/n        Fecha         Ingresos      Gastos       Beneficio"
                       // // + "/n" + addFila(id, fecha, ingresos, gastos, beneficios)
                       // // + "/n" + addFila(id, fecha, ingresos, gastos, beneficios)
                       // // + "/n" + addFila(id, fecha, ingresos, gastos, beneficios);

                    

    // }

    // /**
    // * Devuelve un duplicado de la hoja actual.
    // * El nombre de la hoja duplicada será "Duplicada HojaX"
    // * Al duplicar la hoja se duplicarán también las filas que contenga
    // */
    // public HojaCalculo duplicarHoja() {

    // // return new HojaCalculo(this.nombre, this.fila1, this.fila2, this.fila3, this.numeroFilas);
    // }

}
