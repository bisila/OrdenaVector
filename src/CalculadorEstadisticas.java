public class CalculadorEstadisticas {
    
    public static DatosEstadisticos [] estadisticaOrdenaVector(OrdenarVector metodoOrdenacion, int tam){
        DatosEstadisticos [] datosEstadisticos = new DatosEstadisticos[2];
        int [] vecInverso = GeneraCaso.generaVector(tam,false);
        DatosEstadisticos datosEstadVecInverso = new DatosEstadisticos();
        metodoOrdenacion.ordena(vecInverso, datosEstadVecInverso);
        CompruebaCaso.compruebaVector(vecInverso, tam);
        datosEstadisticos[0] = datosEstadVecInverso;
        float datosEstad10Vectores = 0;
        for(int i=0; i<10; i++){
            int [] vec = GeneraCaso.generaVector(tam,true);
            DatosEstadisticos estadisticos = new DatosEstadisticos();
            metodoOrdenacion.ordena(vec, estadisticos);
            CompruebaCaso.compruebaVector(vec, tam);
            //System.out.println("Tiempo de un vector = "+estadisticos.dameTiempo());
            datosEstad10Vectores += estadisticos.dameTiempo();
            //System.out.println("Tiempo acumulado = "+datosEstad10Vectores);
        }
        datosEstadisticos[1] = new DatosEstadisticos();
        datosEstadisticos[1].estableceTiempo(datosEstad10Vectores/10);
        return datosEstadisticos;
    }
}