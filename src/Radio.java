import java.util.Arrays;

//Pedro Joaquin Castillo Coronado 14224
//Andre Josue Rodas Hernández 14395
//Freddy Josue Ruiz Gatica 14592
//Algoritmos y Estructura de Datos
//Seccion 10 

public class Radio implements InterfazRadio {

	
	private int volumen; 			/*Almacena el valor del volumen*/
	private boolean encendido;		/*Indica si el radio esta encendido o apagado*/
	private double emisora;			/*Almacena el valor numero de emisora*/
	private boolean frecuencia;		/*Indica si esta en AM o FM (True:FM False:AM)*/
	final String AM= "AM";			/*Indica que la radio se encuentra en la frecuencia AM*/
	final String FM= "FM";			/*Indica que la radio se encuentra en la frecuencia FM*/
	private double[][] memoria; 	/*Arreglo de 2x12 para almacenar las frecuencias guardadas*/
	
	/*Constructor de la clase*/
	public Radio(){
		/*Se inicializan los atributos con valores por defecto*/
		volumen=0;
		emisora=0;
		encendido=false;
		frecuencia=true;
		memoria=new double[2][12];
	}
	
	
	/*Metodos set para los atributos*/
	public void setVolumen(int vol){
		volumen=vol;
	}
	public void setEmisora(double emisora){
		this.emisora=emisora;
	}
	public void setEncendido(boolean estado){
		encendido=estado;
	}
	public void setFrecuencia(boolean frecuencia){
		this.frecuencia=frecuencia;
	}
	public void setMEmoria(double emisora, int fila, int columna){
		memoria[fila][columna]=emisora;
	}
	
	/*Metodos get de los atributos*/
	/**
	 * @return the volumen
	 */
	public int getVolumen(){
		return volumen;
	}
	/**
	 * @return the emisora
	 */
	public double getEmisora(){
		return emisora;
	}
	/**
	 * @return the frecuencia
	 */
	public boolean getFrecuencia(){
		return frecuencia;
	}
	/**
	 * @return the encendido
	 * 
	 */
	public boolean getEncendido(){
		return encendido; 
	}
	/**
	 * @return the memoria
	 */
	public double getMemoria(int fila, int columna){
		return memoria[fila][columna];
	}
	
	/*Metodos que son implementados de la InterfazRadio*/
	/*Metodo que permite encender o apagar el radio*/
	/* (non-Javadoc)
	 * @see InterfazRadio#encenderApagar()
	 */
	public void encenderApagar(){
		if(encendido==true){				//Si la radio esta encendida se apaga
			encendido=false;
		}
		else{								//Si esta apagada se enciende
			encendido=true;
		}
	}
	
	/*Metodo para alternar la frecuencia entre AM y FM*/
	
	/* (non-Javadoc)
	 * @see InterfazRadio#cambiarFrec()
	 */
	public void cambiarFrec(){
		if(frecuencia==true){				//Si la radio esta en FM cambia a AM
			frecuencia=false;	
			emisora=MIN_AM;
		}
		else{								//Si esta en AM cambia a FM 
			frecuencia=true;
			emisora=MIN_FM;
		}
	}
	
	/*Metodo para cargar una emisora previamente guardada*/
	/*Metodo para cargar una emisora previamente guardada*/
	
	/**
	 * @param emisora
	 */
	public void cargarEmisora(double emisora){
		if(frecuencia==true){								//Si la frecuencia esta en FM 									//se obtienen los datos de la primera fila del arreglo
			this.emisora=memoria[0][(int) emisora-1];		//Se resta 1 a la emisora para encontrar la columna
		}
		if(frecuencia==false){
			this.emisora=memoria[1][(int) emisora-1];
		}
	}
	
	/*Metodo para adelantar la emisora*/
	/* (non-Javadoc)
	 * @see InterfazRadio#adelantarEmisora()
	 */
	public void adelantarEmisora(){
		if(frecuencia==true){								//Si la frecuencia esta en FM: 							
			if(emisora==MAX_FM){							//Si ya esta en la maxima emisora
				emisora=MIN_FM;								//se le asigna la emisora minima
			}
			else{
				emisora=emisora+CONST_CAMBIO_FM;			//Si no esta en el maximo se aumenta la emisora FM
			}
		}
		if(frecuencia==false){								//Si la frecuencia esta en AM:
			if(emisora==MAX_AM){							//Si ya esta en la maxima emisora
				emisora=MIN_AM;								//se le asigna la emisora minima 
			}
			else{
				emisora=emisora+CONST_CAMBIO_AM;			//Si no esta en el maximo se aumenta la emisora
			}
		}
	}
	
	/*Metodo para atrasar la emisora*/
	/* (non-Javadoc)
	 * @see InterfazRadio#atrasarEmisora()
	 */
	public void atrasarEmisora(){
		if(frecuencia==true){								//Si la frecuencia esta en FM: 							
			if(emisora==MIN_FM){							//Si ya esta en la minima emisora
				emisora=MAX_FM;								//se le asigna la emisora maxima
			}
			else{
				emisora=emisora-CONST_CAMBIO_FM;			//Si no esta en el maximo se reduce la emisora FM
			}
		}
		if(frecuencia==false){								//Si la frecuencia esta en AM:
			if(emisora==MIN_AM){							//Si ya esta en la minima emisora
				emisora=MAX_AM;								//se le asigna la emisora maxima 
			}
			else{
				emisora=emisora-CONST_CAMBIO_AM;			//Si no esta en el maximo se reduce la emisora
			}
		}
	}
	
	/*Metodo para guardar emisora*/
	/* (non-Javadoc)
	 * @see InterfazRadio#guardarEmisora(double, int)
	 */
	public void guardarEmisora(double emisora, int posicion){
		if(frecuencia==true){								//Si esta en frecuencia FM:
			memoria[0][posicion-1]=this.emisora;			//Almacena la emisora actual en la primera fila 
		}
		if(frecuencia==false){								//Si esta en frecuencia AM:
			memoria[1][posicion-1]=this.emisora;			//Alamacena la emisora actual en la segunda fila y posicion establecida
		}
	}
	
	/*Metodo para subirVolumen*/
	/* (non-Javadoc)
	 * @see InterfazRadio#subirVolumen()
	 */
	public void subirVolumen(){
		if(volumen!=10){
			volumen++;
		}	
	}
	
	/*Metodo para reducir el volumen*/
	/*Metodo para reducir el volumen*/
	/* (non-Javadoc)
	 * @see InterfazRadio#bajarVolumen()
	 */
	public void bajarVolumen(){
		if(volumen!=0){
			volumen--;
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Radio [volumen=" + volumen + ", encendido=" + encendido
				+ ", emisora=" + emisora + ", frecuencia=" + frecuencia
				+ ", AM=" + AM + ", FM=" + FM + ", memoria="
				+ (memoria != null ? Arrays.asList(memoria) : null) + "]";
	}
	
}
