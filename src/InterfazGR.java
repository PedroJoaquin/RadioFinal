import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*Universidad del Valle de Guatemala*/
/*Curso: Estructura de Datos*/
/*Autores:
* Freddy José Ruíz Gatica 14592
* Pedro Joaquín Castillo 14224
* André Josue Rodas 14395
*/
/*Clase InterfazGr.java
* Esta encargada de interactuar con el usuario, encendiendose y apagandose, guardando estacion
* cargando estacion, subiendo y bajando volumen. Todo esto mostrado en una interfaz amigable al
* usuario, con el fin que la experiencia del usuario sea la mejor
*/
import java.awt.SystemColor;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InterfazGR {

	private JFrame frame;
	private JPanel panelFrec,panelVol, panel_1, panelRad,	 panel ,panelAmFm;
	private JLabel  lblPower,lblEst, lblFrecFav, lblVolumen,lblNewLabel;
	private JButton btnE1,btnE2,btnE3,btnE4,btnE5,btnE6,btnE7,btnE8,btnE9,btnE10,btnE11,btnE12, btnSubEst, btnBajarV,btnSubirV;
	private JRadioButton rdbtnAlm,rdnbtnFm,	rdbtnLoad ,rdbtnAm;
	private JLabel lblestacion;
	private JButton btnBajEst;
	public static int contRadio;
	private JButton btnCtrlRad;
	private   ButtonGroup group1, group2;
	private Radio radio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGR window = new InterfazGR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazGR() {
		initialize();
		contRadio=0;
		radio= new Radio(); /* Inicialización del objeto radio*/
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		/*Inicialización de todos los componentes*/
		
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		panelFrec = new JPanel();
		panelFrec.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelFrec.setForeground(SystemColor.activeCaption);
		panelFrec.setToolTipText("Frecuencias Almacenadas");
		panelFrec.setBounds(47, 124, 400, 115);
		frame.getContentPane().add(panelFrec);
		panelFrec.setLayout(null);
		
		/* Botones que guardarn las estaciones */
		 btnE1 = new JButton("E1");
		 btnE1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnE1.setBounds(10, 47, 56, 23);
		btnE1.addActionListener(new ctrlBtn());
		panelFrec.add(btnE1);
		
		btnE2 = new JButton("E2");
		btnE2.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE2.setBounds(76, 47, 56, 23);
		btnE2.addActionListener(new ctrlBtn());
		panelFrec.add(btnE2);
		
		btnE3 = new JButton("E3");
		btnE3.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE3.setBounds(142, 47, 56, 23);
		btnE3.addActionListener(new ctrlBtn());
		panelFrec.add(btnE3);
		
		 btnE4 = new JButton("E4");
		 btnE4.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE4.setBounds(208, 47, 56, 23);
		btnE4.addActionListener(new ctrlBtn());
		panelFrec.add(btnE4);
		
		 btnE5 = new JButton("E5");
		 btnE5.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE5.setBounds(274, 47, 56, 23);
		btnE5.addActionListener(new ctrlBtn());
		panelFrec.add(btnE5);
		
		btnE6 = new JButton("E6");
		btnE6.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE6.setBounds(340, 47, 56, 23);
		btnE6.addActionListener(new ctrlBtn());
		panelFrec.add(btnE6);
		
		 btnE7 = new JButton("E7");
		 btnE7.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnE7.setBounds(10, 81, 56, 23);
		btnE7.addActionListener(new ctrlBtn());
		panelFrec.add(btnE7);
		
		 btnE8 = new JButton("E8");
		 btnE8.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE8.setBounds(76, 81, 56, 23);
		btnE8.addActionListener(new ctrlBtn());
		panelFrec.add(btnE8);
		
		 btnE9 = new JButton("E9");
		 btnE9.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE9.setBounds(142, 81, 56, 23);
		btnE9.addActionListener(new ctrlBtn());
		panelFrec.add(btnE9);
		
		 btnE10 = new JButton("E10");
		 btnE10.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE10.setBounds(208, 81, 56, 23);
		btnE10.addActionListener(new ctrlBtn());
		panelFrec.add(btnE10);
		
		btnE11 = new JButton("E11");
		btnE11.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE11.setBounds(274, 81, 56, 23);
		btnE11.addActionListener(new ctrlBtn());
		panelFrec.add(btnE11);
		
		btnE12 = new JButton("E12");
		btnE12.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnE12.setBounds(340, 81, 56, 23);
		btnE12.addActionListener(new ctrlBtn());
		panelFrec.add(btnE12);
		/***********Finalizan botones para guardad estaciones ***************/
		
		lblPower = new JLabel("Power");
		lblPower.setBounds(20, 11, 46, 14);
		frame.getContentPane().add(lblPower);
		
		lblFrecFav = new JLabel("ESTACIONES FAVORITAS:");
		lblFrecFav.setBounds(10, 6, 156, 14);
		panelFrec.add(lblFrecFav);
		
		panel = new JPanel();
		panel.setBounds(231, 6, 159, 35);
		panelFrec.add(panel);
		panel.setLayout(null);
		
		/* Radio Button*/
		rdbtnAlm = new JRadioButton("Almacenar");
		rdbtnAlm.setToolTipText("Guarda la estaci\u00F3n actual");
		rdbtnAlm.setBounds(6, 7, 88, 23);
		rdbtnAlm.addActionListener(new ctrlBtn());
		panel.add(rdbtnAlm);
		
		rdbtnLoad = new JRadioButton("Cargar");
		rdbtnLoad.setToolTipText("Carga la estaci\u00F3n almacenada en el bot\u00F3n");
		rdbtnLoad.setBounds(96, 7, 88, 23);
		rdbtnLoad.addActionListener(new ctrlBtn());
		panel.add(rdbtnLoad);
		/********finalizan los radio buttons AM Y FM******************/
		
		 panelVol = new JPanel();
		panelVol.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelVol.setBounds(407, 11, 80, 84);
		frame.getContentPane().add(panelVol);
		panelVol.setLayout(null);
		
		lblVolumen = new JLabel("Vol: 0");
		lblVolumen.setBounds(10, 11, 51, 14);
		panelVol.add(lblVolumen);
		
		btnSubirV = new JButton("+");
		btnSubirV.setBounds(20, 29, 41, 23);
		btnSubirV.addActionListener(new ctrlVol());
		panelVol.add(btnSubirV);
		
		btnBajarV = new JButton("-");
		btnBajarV.setBounds(19, 50, 42, 23);
		btnBajarV.addActionListener(new ctrlVol());
		panelVol.add(btnBajarV);
		
		lblNewLabel = new JLabel("Frecuencia");
		lblNewLabel.setBounds(20, 54, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		panelAmFm = new JPanel();
		panelAmFm.setBounds(10, 69, 101, 31);
		frame.getContentPane().add(panelAmFm);
		panelAmFm.setLayout(null);
		
		rdbtnAm = new JRadioButton("AM");
		rdbtnAm.setBounds(6, 7, 46, 23);
		rdbtnAm.addActionListener(new ctrlBtn());
		panelAmFm.add(rdbtnAm);
		
		rdnbtnFm = new JRadioButton("FM");
		rdnbtnFm.setBounds(54, 7, 46, 23);
		rdnbtnFm.addActionListener(new ctrlBtn());
		panelAmFm.add(rdnbtnFm);
		
		/*Grupos de radio button */
		group1 = new ButtonGroup();
	    group1.add (rdnbtnFm);
	    group1.add (rdbtnAm);
	      
	    group2= new ButtonGroup();
	    group2.add (rdbtnAlm);
	    group2.add (rdbtnLoad);
		/**************************/

	    panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(317, 11, 80, 84);
		frame.getContentPane().add(panel_1);
		
		lblEst = new JLabel("Estaci\u00F3n");
		lblEst.setBounds(10, 11, 51, 14);
		panel_1.add(lblEst);
		
		btnSubEst = new JButton("+");
		btnSubEst.setBounds(20, 29, 41, 23);
		btnSubEst.addActionListener(new ctrlEst());
		panel_1.add(btnSubEst);
		
		btnBajEst = new JButton("-");
		btnBajEst.setBounds(19, 50, 42, 23);
		btnBajEst.addActionListener(new ctrlEst());
		panel_1.add(btnBajEst);
		
		panelRad = new JPanel();
		panelRad.setBackground(SystemColor.text);
		panelRad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelRad.setBounds(121, 11, 186, 84);
		
		frame.getContentPane().add(panelRad);
		panelRad.setLayout(null);
		
		lblestacion = new JLabel("0.0");
		lblestacion.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 32));
		lblestacion.setBounds(50, 11, 126, 62);
		panelRad.add(lblestacion);
		/* Seteo de todos los componentes en false*/
		panelRad.setEnabled(false);
		btnE1.setEnabled(false);
		btnE2.setEnabled(false);
		btnE3.setEnabled(false);
		btnE4.setEnabled(false);
		btnE5.setEnabled(false);
		btnE6.setEnabled(false);
		btnE7.setEnabled(false);
		btnE8.setEnabled(false);
		btnE9.setEnabled(false);
		btnE10.setEnabled(false);
		btnE11.setEnabled(false);
		btnE12.setEnabled(false);
		btnSubEst.setEnabled(false);
		btnBajEst.setEnabled(false);
		btnBajarV.setEnabled(false);
		btnSubirV.setEnabled(false);
		rdbtnLoad.setEnabled(false);
		rdbtnAm.setEnabled(false);
		rdnbtnFm.setEnabled(false);
		rdbtnAlm.setEnabled(false);
		panelRad.setEnabled(false);
		lblestacion.setEnabled(false);
		
		btnCtrlRad = new JButton("Encender");
		btnCtrlRad.setBounds(10, 24, 89, 23);
		frame.getContentPane().add(btnCtrlRad);
		btnCtrlRad.addActionListener(new ctrlRad());
	}
	/**
	 * Listener: ctrlRad
	 * Este Listener es el encargado de habilidad o inhabilitar los componentes
	 * de la interfaz, con la finalidad de simular el encendido y el apagado de la
	 * radio. Cumplirá con su cometido empleando el botón Encender.
	 */
	private class ctrlRad implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnCtrlRad){ /*Si el evento se da en el boton de encendido*/
				radio.encenderApagar(); /*Emplea el método encender Apagar para gestionar el encendido*/
				if (radio.getEncendido()== true){ /*Si esta encendida*/
					/*Habilita todos los componentes */
					panelRad.setEnabled(true);
					btnE1.setEnabled(true);
					btnE2.setEnabled(true);
					btnE3.setEnabled(true);
					btnE4.setEnabled(true);
					btnE5.setEnabled(true);
					btnE6.setEnabled(true);
					btnE7.setEnabled(true);
					btnE8.setEnabled(true);
					btnE9.setEnabled(true);
					btnE10.setEnabled(true);
					btnE11.setEnabled(true);
					btnE12.setEnabled(true);
					btnSubEst.setEnabled(true);
					btnBajEst.setEnabled(true);
					btnBajarV.setEnabled(true);
					btnSubirV.setEnabled(true);
					rdbtnLoad.setEnabled(true);
					rdbtnAm.setEnabled(true);
					rdnbtnFm.setEnabled(true);
					rdbtnAlm.setEnabled(true);
					panelRad.setEnabled(true);
					lblestacion.setEnabled(true);
				

				}
				if (radio.getEncendido() == false){ /*Si la radio va apagarse*/
				/*Inhabilita todos los componentes*/
					panelRad.setEnabled(false);
					btnE1.setEnabled(false);
					btnE2.setEnabled(false);
					btnE3.setEnabled(false);
					btnE4.setEnabled(false);
					btnE5.setEnabled(false);
					btnE6.setEnabled(false);
					btnE7.setEnabled(false);
					btnE8.setEnabled(false);
					btnE9.setEnabled(false);
					btnE10.setEnabled(false);
					btnE11.setEnabled(false);
					btnE12.setEnabled(false);
					btnSubEst.setEnabled(false);
					btnBajEst.setEnabled(false);
					btnBajarV.setEnabled(false);
					btnSubirV.setEnabled(false);
					rdbtnLoad.setEnabled(false);
					rdbtnAm.setEnabled(false);
					rdnbtnFm.setEnabled(false);
					rdbtnAlm.setEnabled(false);
					panelRad.setEnabled(false);
					lblestacion.setEnabled(false);
				}
			}
		}

		}/*Cierra el listener ctrlradio*/
		
	/**
	 * Listener: crtlEst
	 * Este listener está encargado de subir y bajar la estación con cierto dependiendo
	 * aumento definido si la frecuencia es AM/FM. Cumplirá con su cometido mediante
	 * el uso de los botones: subEst y bajEst.
	 */
	private class ctrlEst implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double est=0;
			if (e.getSource()== btnSubEst ){ 				/*Si se presiona el boton subir estacion (+)*/
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){ 					/* y LA ESTACION ES AM*/
					radio.adelantarEmisora(); 				/*Emplea el método adelantar emisora*/
					est= radio.getEmisora(); 				/*Obtiene la emisora actual*/
					lblestacion.setText(""+est); 			/*La coloca en la label que la muestra*/
				}
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){						/* Si LA ESTACION ES FM*/
				
					radio.adelantarEmisora();					/*Emplea el método adelantar emisora*/
					est= radio.getEmisora();					/*Obtiene la emisora actual*/
					lblestacion.setText(""+est);				/*La coloca en la label que la muestra*/
				}
				
				
			}
			if (e.getSource()== btnBajEst  ){ /*Si se presiona el boton bajar estacion (-)*/
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){ /* y LA ESTACION ES AM*/
					
					radio.atrasarEmisora();/*Emplea el método atrasarEmisora*/
					est= radio.getEmisora();/*Obtiene la emisora actual*/
					lblestacion.setText(""+est);/*La coloca en la label que la muestra*/
				}
				if (rdnbtnFm.isSelected()&& (radio.getFrecuencia() == true)){ /* Si LA ESTACION ES FM*/
					radio.setFrecuencia(true);	/*Se setea la frecuencia en Fm=true*/
					radio.atrasarEmisora();/*Emplea el método atrasarEmisora*/
					est= radio.getEmisora();/*Obtiene la emisora actual*/
					lblestacion.setText(""+est);/*La coloca en la label que la muestra*/
				}
				
			}
			
		}
	}
	/**
	 * Listener: ctrlVol
	 * Botones utilizados: btnSubirV y btnBajarV
	 * La funcionalidad de este listener es simular la subida y bajada del
	 * volumen del radio. Mostrando el valor en una label.
	 */
	private class ctrlVol implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int vol=0; 
			/*Metodo encargado de subir el volumen cuando es presionado el boton (+) mostrandolo en la label de volumen*/
			if (e.getSource()== btnSubirV){
				radio.subirVolumen(); 
				vol=radio.getVolumen(); /*Obtiene el volumen actual*/
				lblVolumen.setText("Vol: "+vol); /*Lo setea en la label de volumen*/
			}
			/*Metodo encargado de bajar el volumen cuando es presionado el boton (-) mostrandolo en la label de volumen*/
			if (e.getSource()== btnBajarV){
				radio.bajarVolumen();
				vol=radio.getVolumen();/*Obtiene el volumen actual*/
				lblVolumen.setText("Vol: "+vol); /*Lo setea en la label de volumen*/
			}
			
		}
	}
	
	/**
	 * Listener: ctrlBtn
	 * Botones: rdbtnAm, rdbtnFm, rdbtnAlm, rdbtnLoad, btnE1...... E12
	 * La funcionalidad de este listener es múltiple ya que para los radiobuttons
	 * AM y FM es empleado para colocar el valor inical de la frecuencia. Ahora bien
	 * para el resto de botones, sirve para guardar y cargar estaciones, alternando
	 * el radio button seleccionado (Almacenar, Guardar). En el caso de almacenar
	 * al presionar uno de los botones guarda el valor en un array y en caso
	 * de cargar obtiene el valor guardado en el boton seleccionado.
	 */
	private class ctrlBtn implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()== rdbtnAm){/*Al ser presionado el radio button Am*/
				if (radio.getFrecuencia()== false){
					lblestacion.setText(""+ radio.getEmisora()); /*Setea la emisora en la label emisora*/
				}
				else{
				radio.cambiarFrec(); /*Luego hace el cambio de frecuencia*/
				}
				
				}
					

			if (e.getSource()== rdnbtnFm){/*Al ser presionado el radio button FM*/
				if (radio.getFrecuencia()== true){
					
					lblestacion.setText(""+radio.getEmisora());/*Setea la emisora en la label emisora*/
				}
				else
				{
				radio.cambiarFrec();/*Luego hace el cambio de frecuencia*/
				}
				
			}
			
			if (e.getSource()==btnE1) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){ /*Si el boton Am esta seleccionadio y la frecuencia es Am*/
					if (rdbtnAlm.isSelected()){ /*Si el boton almacenar esta seleccionado*/
							emis=radio.getEmisora(); /*Obtiene la emisora actual*/
	
							radio.guardarEmisora(emis, 1); /*Guarda la emisora*/
							
							/*btnE1.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){ /*Si el boton cargar esta seleccioando*/
					 radio.cargarEmisora(1); /*Carga la emisora*/
					
					 lblestacion.setText(""+ radio.getEmisora()); /*Coloca la emisora en la label emisora*/
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){/*Si el boton Fm esta seleccionadio y la frecuencia es Fm*/
					 if (rdbtnAlm.isSelected()){/*Si el boton almacenar esta seleccionado*/
						emis=radio.getEmisora();/*Obtiene la emisora actual*/
						radio.guardarEmisora(emis, 1);/*Guarda la emisora*/
						/*btnE1.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){ /*Si el boton cargar esta seleccioando*/
						 radio.cargarEmisora(1); /*Carga la emisora*/
						 lblestacion.setText(""+ radio.getEmisora());/*Coloca la emisora en la label emisora*/
					 }
				}/*Cierra el fm*/
			}/*Cierre del primer botón*/	
			/***********************NOTAAAAAAAA********************************************/
			/*LA MISMA ESTRUCTURA DE CODIGO SE UTILIZAN EN LOS DOCE BOTONES, POR LOS CUAL NO SE COLOCARAN COMENTARIOS EN LOS OTROS BOTONES*/
			/*SUFICIENTE CON LA EXPLICACION DE UN SOLO BOTON */
			
			if (e.getSource()==btnE2) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							
							radio.guardarEmisora(emis, 2);
							
							/*btnE2.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(2);
					 
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 2);
						/*btnE2.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(2);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 2do botón*/
			
			if (e.getSource()==btnE3) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							
							radio.guardarEmisora(emis, 3);
							
							/*btnE3.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(3);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 3);
						/*btnE3.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(3);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 3ero botón*/
			
			if (e.getSource()==btnE4) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							radio.guardarEmisora(emis, 4);
							
							/*btnE4.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(4);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 4);
						/*btnE4.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(4);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 4to botón*/
			
			if (e.getSource()==btnE5) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							
							radio.guardarEmisora(emis, 5);
							
							/*btnE5.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(5);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 5);
						/*btnE5.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(5);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 5to botón*/
			
			if (e.getSource()==btnE6) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 6);
							
							/*btnE6.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(6);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 6);
						/*btnE6.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(6);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 6to botón*/
			
			
			if (e.getSource()==btnE7) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 7);
							
							/*btnE7.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(1);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 7);
						/*btnE7.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(7);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 7to botón*/
			
			if (e.getSource()==btnE8) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 8);
							
							/*btnE8.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(8);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 8);
						/*btnE8.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(8);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 8tavo botón*/
			
			if (e.getSource()==btnE9) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 9);
							
							/*btnE9.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(9);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 9);
						/*btnE9.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(9);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 9veno botón*/
			if (e.getSource()==btnE10) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 10);
							
							/*btnE10.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(10);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 10);
						/*btnE10.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(10);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del decimo botón*/
			
			if (e.getSource()==btnE11) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 11);
							
							/*btnE11.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(11);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 11);
						/*btnE11.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(11);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 11vo botón*/
			if (e.getSource()==btnE12) {
				double emis=0;
				if (rdbtnAm.isSelected() && (radio.getFrecuencia() == false)){
					if (rdbtnAlm.isSelected()){
							emis=radio.getEmisora();
							 
							radio.guardarEmisora(emis, 12);
							
							/*btnE12.setText(""+emis);*/
				 }/*Comportamiento segun Alm*/
				 if (rdbtnLoad.isSelected()){
					 radio.cargarEmisora(12);
					 System.out.println(radio.getEmisora());
					 lblestacion.setText(""+ radio.getEmisora());
				 }
				}/*Cierra el Am*/
				
				if (rdnbtnFm.isSelected() && (radio.getFrecuencia() == true)){
					 if (rdbtnAlm.isSelected()){
						emis=radio.getEmisora();
						radio.guardarEmisora(emis, 12);
						/*btnE12.setText(""+emis);*/
					 }
					 if (rdbtnLoad.isSelected()){
						 radio.cargarEmisora(12);
						 lblestacion.setText(""+ radio.getEmisora());
					 }
				}/*Cierra el fm*/
			}/*Cierre del 12 botón*/
		}
	}/*Cierre del Listener controlradio buttons */
	}




	
	
