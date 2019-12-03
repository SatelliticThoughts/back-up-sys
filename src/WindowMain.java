import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowMain extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem iNew;
	private JTabbedPane tabs;
	private JPanel pSchedule, pLogs;
	private JTextArea txtArea;
	
	public WindowMain() {
		setTitle("Back Up System");
		setSize(800, 800);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		
		iNew = addItem("New");
		
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		tabs = new JTabbedPane();
		
		pSchedule = new JPanel();
		pSchedule.setLayout(new BoxLayout(pSchedule, BoxLayout.PAGE_AXIS));
		JScrollPane scroll = new JScrollPane(pSchedule);
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 20 min"));
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 10 min"));
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 20 min"));
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 10 min"));
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 20 min"));
		pSchedule.add(createSchedule("Source: /qwe/asd", "Destination: /ert/asd", "Begins: 09:00", "Est: 10 min"));
		
		tabs.add("Schedule", scroll);
		
			
		txtArea = new JTextArea();
		JScrollPane scroll2 = new JScrollPane(txtArea);
		tabs.add("Logs", scroll2);
		
		add(tabs);
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
	
	public JPanel createSchedule(String src, String dest, String time, String est) {
		JPanel pane = new JPanel();
		pane.setLayout(new FlowLayout());
		pane.add(new JLabel(src));
		pane.add(new JLabel(dest));
		pane.add(new JLabel(time));
		pane.add(new JLabel(est));
		
		return pane;
	}
}
