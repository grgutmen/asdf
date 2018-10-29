package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

import javafx.scene.layout.Border;






public class GlavniFrame extends JFrame{
	public GlavniFrame () {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenHeight / 2, screenWidth / 2);
		setTitle ("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				JFrame frame= (JFrame) e.getComponent();
				int code=JOptionPane.showConfirmDialog(frame, "Da li ste sigurni da �elite da zatvorite aplikaciju?","Zatvaranje aplikacije?",JOptionPane.YES_NO_OPTION);
				if (code!=JOptionPane.YES_OPTION){
				
					frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				}
				else{
					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				}
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		gui.Menu menu = new gui.Menu(this);
		setJMenuBar(menu);
		Toolbar toolbar = new Toolbar();
		
		
		JTextArea textArea = new JTextArea("sample", 10, 10);
		JTextArea textArea2 = new JTextArea("Bla", 10, 10);
		JLabel lbl = new JLabel("Ovo je labela");
		JLabel lbl2 = new JLabel ("Ovo je isto labela");
		
		lbl2.setVerticalAlignment(SwingConstants.CENTER);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setVerticalAlignment(SwingConstants.CENTER);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panCentar = new JPanel(new GridLayout(2, 2));
		JPanel panLevi = new JPanel();
		JScrollPane scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, scrollPane2);
		JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, toolbar, lbl2);
		
		
		
		sp.setOneTouchExpandable(true);
		sp.setDividerLocation(400);
		
		add(sp2, BorderLayout.NORTH);
		add(sp, BorderLayout.CENTER);
		add(lbl, BorderLayout.SOUTH);
		
		
		

	}
}
