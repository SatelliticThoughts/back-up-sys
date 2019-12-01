import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowMain extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem iNew;
	
	public WindowMain() {
		setTitle("Back Up System");
		setSize(800, 800);
		setLayout(null);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		
		iNew = addItem("New");
		
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
	}
	
	private JMenuItem addItem(String n) {
		JMenuItem i = new JMenuItem(n);
		fileMenu.add(i);
		i.addActionListener(this);
		return i;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == iNew) {
			System.out.println("New");
		}
	}
}
