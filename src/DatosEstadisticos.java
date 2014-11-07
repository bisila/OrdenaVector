public class DatosEstadisticos {
    private float tiempoEjecucion; //Segundos

    public DatosEstadisticos() {
        tiempoEjecucion=0.0f;
    }

    public void añadeTiempo(float incremento){
        tiempoEjecucion+=incremento;
    }
    
    public void estableceTiempo(float tiempo){
        tiempoEjecucion=tiempo;
    }
    
    public float dameTiempo(){
        return tiempoEjecucion;
    }
}