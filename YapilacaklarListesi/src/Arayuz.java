
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Font;
public class Arayuz extends JFrame{
	

		private final Action action = new SwingAction();
		
		Arayuz() throws IOException{

			JFrame bum = new JFrame("Yapılacaklar Listesi");
			bum.getContentPane().setBackground(new Color(217,206,197));
			bum.getContentPane().setLayout(null);
			
	

			ImageIcon yap  = new ImageIcon("yap.png");
			ImageIcon yapma = new ImageIcon("yapma.png");
			JLabel yap2Buton = new JLabel(yap);
			JLabel yap3Buton = new JLabel(yap);
			JTextField yazi1 = new JTextField();
			
			ImageIcon pencere = new ImageIcon("yap.png");
			bum.setIconImage(pencere.getImage());
			
			
			yazi1.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if (yazi1.getText().length() >= 25 ) 
			            e.consume(); 
			    }  
			});
			

			yazi1.setBounds(50, 25, 190, 35);
			yazi1.setLayout(null);
			yazi1.setBackground(new Color(84,210,220,255));
	        yazi1.setBorder(null);
			yazi1.setVisible(false);
			JTextField yazi2 = new JTextField();
			yazi2.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if (yazi2.getText().length() >= 25 ) 
			            e.consume(); 
			    }  
			});
		
			yap2Buton.setLayout(null);
			yap2Buton.setBounds(10, 25, 30, 30);
			yap2Buton.setBackground(new Color(240,200,50,0));
			yap2Buton.setVisible(false);
			

			
			yazi2.setBounds(50, 75, 190, 35);
			yazi2.setLayout(null);
			yazi2.setBackground(new Color(48,150,225,255));
	        yazi2.setBorder(null);
			yazi2.setVisible(false);
			JTextField yazi3 = new JTextField();
			yazi3.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if (yazi3.getText().length() >= 25 ) 
			            e.consume(); 
			    }  
			});
			

			yap3Buton.setLayout(null);
			yap3Buton.setBounds(10, 25, 30, 30);
			yap3Buton.setBackground(new Color(240,200,50,0));
			yap3Buton.setVisible(false);
			
			

			
			yazi3.setBounds(50, 125, 190, 35);
			yazi3.setLayout(null);
			yazi3.setBackground(new Color(255,130,111,255));
	        yazi3.setBorder(null);
			yazi3.setVisible(false);
			JTextField yazi4 = new JTextField();
			yazi4.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if (yazi4.getText().length() >= 25 ) 
			            e.consume(); 
			    }  
			});
			
			
			yazi4.setBounds(50, 175, 190, 35);
			yazi4.setLayout(null);
			yazi4.setBackground(new Color(255, 193, 97,255));
	        yazi4.setBorder(null);
			yazi4.setVisible(false);
			
			
			
			
			JTextField yazi5 = new JTextField();
			yazi5.addKeyListener(new KeyAdapter() {
			    public void keyTyped(KeyEvent e) { 
			        if (yazi5.getText().length() >= 25 ) 
			            e.consume(); 
			    }  
			});
			
			
			yazi5.setBounds(50, 225, 190, 35);
			yazi5.setLayout(null);
			yazi5.setBackground(new Color(153, 110, 255,255));
	        yazi5.setBorder(null);
			yazi5.setVisible(false);
			

			
			bum.getContentPane().add(yazi1);
			bum.getContentPane().add(yazi2);
			bum.getContentPane().add(yazi3);
			bum.getContentPane().add(yazi4);
			bum.getContentPane().add(yazi5);


			
			bum.setSize(300,400);
			bum.setBackground( Color.BLACK);

			bum.setResizable(false);
			bum.setLocationRelativeTo(null);
			bum.getContentPane().setBackground(new java.awt.Color(193,160,240,255));

			bum.setVisible(true);
			bum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

			JButton ekle = new JButton("Ekle");		
			ekle.setBounds(20, 300, 70, 35);
			ekle.setText("EKLE");
			ekle.setBackground(new Color(255,239,174,255));
			ekle.setForeground(new Color(74,170,165,255));

			ekle.setSelected(true);
			ekle.setSelectedIcon(new ImageIcon("yapma.png"));
			bum.getContentPane().add(ekle);
			
			ekle.addMouseListener(new MouseAdapter(){
 
			    public void mouseReleased(MouseEvent e) {
			    	 
					ekle.setBackground(new Color(153, 110, 255,255));

					ekle.setForeground(new Color(77, 193, 255,255));


			    }

			});
			bum.getContentPane().add(ekle);

		
			
			JToggleButton tglbtnNewToggleButton = new JToggleButton("");
			tglbtnNewToggleButton.setSelected(true);
			tglbtnNewToggleButton.setToolTipText("");
			tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			tglbtnNewToggleButton.setSelectedIcon(new ImageIcon("yapma.png"));
			tglbtnNewToggleButton.setAction(action);
			tglbtnNewToggleButton.setIcon(new ImageIcon("yap.png"));
			tglbtnNewToggleButton.setBounds(10, 28, 30, 30);
			bum.getContentPane().add(tglbtnNewToggleButton);
			tglbtnNewToggleButton.setVisible(false);
			
			JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
			tglbtnNewToggleButton_1.setSelected(true);
			tglbtnNewToggleButton_1.setSelectedIcon(new ImageIcon("yapma.png"));
			tglbtnNewToggleButton_1.setIcon(new ImageIcon("yap.png"));
			tglbtnNewToggleButton_1.setBounds(10, 78, 30, 30);
			bum.getContentPane().add(tglbtnNewToggleButton_1);
			tglbtnNewToggleButton_1.setVisible(false);
			
			JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("");
			tglbtnNewToggleButton_1_1.setSelected(true);
			tglbtnNewToggleButton_1_1.setSelectedIcon(new ImageIcon("yapma.png"));
			tglbtnNewToggleButton_1_1.setIcon(new ImageIcon("yap.png"));
			tglbtnNewToggleButton_1_1.setBounds(10, 128, 30, 30);
			bum.getContentPane().add(tglbtnNewToggleButton_1_1);
			tglbtnNewToggleButton_1_1.setVisible(false);
			
			JToggleButton tglbtnNewToggleButton_1_2 = new JToggleButton("");
			tglbtnNewToggleButton_1_2.setSelected(true);
			tglbtnNewToggleButton_1_2.setSelectedIcon(new ImageIcon("yapma.png"));
			tglbtnNewToggleButton_1_2.setIcon(new ImageIcon("yap.png"));
			tglbtnNewToggleButton_1_2.setBounds(10, 178, 30, 30);
			bum.getContentPane().add(tglbtnNewToggleButton_1_2);
			tglbtnNewToggleButton_1_2.setVisible(false);
			
			
			JToggleButton tglbtnNewToggleButton_1_3 = new JToggleButton("");
			tglbtnNewToggleButton_1_3.setSelected(true);
			tglbtnNewToggleButton_1_3.setSelectedIcon(new ImageIcon("yapma.png"));
			tglbtnNewToggleButton_1_3.setIcon(new ImageIcon("yap.png"));
			tglbtnNewToggleButton_1_3.setBounds(10, 228, 30, 30);
			bum.getContentPane().add(tglbtnNewToggleButton_1_3);
			tglbtnNewToggleButton_1_3.setVisible(false);
			

			ekle.addActionListener(new ActionListener() {
				int x=0;

				public void actionPerformed(ActionEvent e) {
					switch(x) {
					

					case 0:

					tglbtnNewToggleButton.setVisible(true);
					yazi1.setVisible(true);
					
					

					x+=1;
					System.out.println(x); 
					break;
					
					

					case 1:
					tglbtnNewToggleButton_1.setVisible(true);
					yazi2.setVisible(true);

					x+=1;
					System.out.println(x);
					break;
					

					case 2:

					tglbtnNewToggleButton_1_1.setVisible(true);
					yazi3.setVisible(true);
					
					x+=1;
					System.out.println(x);
					break;
					

					case 3:

					tglbtnNewToggleButton_1_2.setVisible(true);
					yazi4.setVisible(true);
					x+=1;
					System.out.println(x);
					break;
					
					case 4:

					tglbtnNewToggleButton_1_3.setVisible(true);
					yazi5.setVisible(true);
					System.out.println(x);
					break;

					
					}

				}
			});
			
	
			
		}
		private class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
			}
			
			
		}
	}