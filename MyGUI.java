
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * @ your_name
 * 2014
 *
 */
 
 class MyGUI extends JFrame{
 private Dimension dimFrame;
 private JMenuBar menu;
 private JMenu archive;
 private JMenuItem terminate;
 private JMenu about;
 private JMenuItem help;
 private JMenuItem om;
 
 public MyGUI(){
     this.initGUI();
 }
 
 private void initGUI(){
       
        this.dimFrame = new Dimension(300, 400);
  
        
        this.setTitle("MyGUI");
        this.setSize( dimFrame);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
       
        
        this.menu = new JMenuBar();
        this.archive = new JMenu("Arkiv");
        this.terminate = new JMenuItem("Avsluta programmet");
        this.about = new JMenu("Om");
        this.help = new JMenuItem("Hjälp");
        this.om = new JMenuItem("Om");
        this.setJMenuBar(menu);
        this.menu.add(archive);
        this.archive.add(terminate);
        this.menu.add(about);
        this.about.add(help);
        this.about.add(om);
        
        
        this.help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(rootPane, " ");
            }
        });
        this.om.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(rootPane, "copyright: Daniel Medeström " + "2014");
            }
        });
        
        this.terminate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
 
    }
 public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run() {
               new MyGUI().setVisible(true);
           }
       });
 }
 }