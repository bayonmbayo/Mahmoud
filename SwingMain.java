package mahmoud;

import java.awt.Component;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SwingMain extends javax.swing.JFrame{
		private static final long serialVersionUID=2479348283207711881L;
		
		private JTextArea Text;
		private Toolkit t;
		JPanel jp= new JPanel();
		TextField txtZahl=new TextField(30);
		TextField txtZahl2=new TextField(30);
		JButton btnadd= new JButton();
		TextField Lösung=new TextField(30);
		JButton btnadd2=new JButton();
		public SwingMain(){

			t= Toolkit.getDefaultToolkit();
			
	      setTitle("Taschenrechner");
			setBounds(600,50,800,900);
		

		
		
			setVisible(true);
			

			
		
			
			jp.setBounds(0,0,300,300);
			add(jp);
		
			txtZahl.setBounds(0,0,200,200);
		      txtZahl.setText("0");
		      jp.add(txtZahl);
		
		      txtZahl2.setBounds(0,0,200,200);
		      txtZahl2.setText("0");
		      jp.add(txtZahl2);
		      
		      btnadd.setBounds(80, 88, 89, 300);
		      btnadd.setLabel("Addieren");
		  jp.add(btnadd);
		     
			btnadd2.setBounds(90, 100, 105, 250);
		      btnadd2.setLabel("Subtrahieren");
		      jp.add(btnadd2);
			
//		      btnadd.addActionListener(new ActionListener(){
//		      public void actionPerformed(ActionEvent evt){
//		      
//		      btnadd_ActionPerformed(evt);{
//		    
//		      
//		      }}} ;
		Lösung.setBounds(85,60,250,100);
	      Lösung.setText("0");
	      jp.add(Lösung);
		
		      
		
		
		btnadd.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent evt){
			
			int zahl1;
			int zahl2;
			int Ergebnis;
			zahl1=Integer.parseInt(txtZahl.getText());
			zahl2=Integer.parseInt(txtZahl2.getText());
			Ergebnis= zahl1+zahl2;
			
			Lösung.setText(String.valueOf(Ergebnis));
		 }
		
		});
//		 btnadd.addActionListener(new ActionListener(){ |
//		  public void actionPerformed(ActionEvent evt){ |
//		  												|---->	Ein Event kann nicht in einem anderen Event sein 
//		      btnadd_ActionPerformed(evt);{				|
//		   												|		
//		      }}}										|
		
		btnadd2.addActionListener(new ActionListener(){     //|
			public void actionPerformed(ActionEvent evt){	//|	
			int zahl1;										//|
			int zahl2;										//|
			int Ergebnis;									//|	
			zahl1=Integer.parseInt(txtZahl.getText());		//|
			zahl2=Integer.parseInt(txtZahl2.getText());		//|-----> So ist richtig, der Event implementiert 	
			Ergebnis= zahl1-zahl2;							//|
															//|
			Lösung.setText(String.valueOf(Ergebnis));		//|			Mach weg danach meine Kommentare,
															//|			Du kannst noch mal dein Frame gut einstellen,
			}												//|			damit das gut aussieht, ich schicke dir auch mein Code (Guckst du nur die Dimension meines Frames)
		});													//|			Sonst ich habe korrigiert im Moment funktionniert dein Code gut.
}
		
			public static void main (String []args){
					new SwingMain();
			}





	}

