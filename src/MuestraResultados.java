public class MuestraResultados{
    public static void main (String[] args){
        System.out.println("Calculando...");
        DatosEstadisticos [] vectorResultados1  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 1000);
        DatosEstadisticos [] vectorResultados2  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 2000);
        DatosEstadisticos [] vectorResultados3  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 4000);
        DatosEstadisticos [] vectorResultados4  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 8000);
        DatosEstadisticos [] vectorResultados5  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 16000);
        DatosEstadisticos [] vectorResultados6  = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), 32000);
        System.out.println("*******************************************************************************************");
        System.out.println("* Elementos       Vector en orden inverso(Tiempo)       Vector en orden aleatorio(Tiempo) *");
        System.out.printf("*    1000                    %.4f                                    %.4f             *\n", vectorResultados1[0].dameTiempo(),vectorResultados1[1].dameTiempo());
        System.out.printf("*    2000                    %.4f                                    %.4f             *\n", vectorResultados2[0].dameTiempo(),vectorResultados2[1].dameTiempo());
        System.out.printf("*    4000                    %.4f                                    %.4f             *\n", vectorResultados3[0].dameTiempo(),vectorResultados3[1].dameTiempo());
        System.out.printf("*    8000                    %.4f                                    %.4f             *\n", vectorResultados4[0].dameTiempo(),vectorResultados4[1].dameTiempo());
        System.out.printf("*    16000                   %.4f                                    %.4f             *\n", vectorResultados5[0].dameTiempo(),vectorResultados5[1].dameTiempo());
        System.out.printf("*    32000                   %.4f                                    %.4f             *\n", vectorResultados6[0].dameTiempo(),vectorResultados6[1].dameTiempo());
        System.out.println("*******************************************************************************************");

    }
}