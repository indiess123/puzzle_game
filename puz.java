package javaa;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;  

public class puz
{
	public static void main(String[] args)
	{
		puzl2 obj = new puzl2();
		
	}
}
     class puzl2 extends JFrame implements ActionListener
{

// Initialization of components
  
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JLabel lab;
    JLabel label2;
   JLabel l,l2;
   Timer timer;
   int count;
 
    public puzl2()
{  

// Main frame 
 
    	 l2= new JLabel("PUZZLE WORLD");
    	l2.setBounds(40,20,350,40);
    	l2.setForeground(Color.magenta);
    	l2.setFont(new Font("Serif",Font.BOLD,40));
           b1=new Button("1");  
           b1.setBounds(50,100,40,40);  
           b1.setBackground(Color.blue);
           b2=new Button("2");  
        b2.setBounds(100,100,40,40); 
        b2.setBackground(Color.yellow);
        b3=new Button("3");  
        b3.setBounds(150,100,40,40);  
        b3.setBackground(Color.blue);
        b4=new Button("4");  
        b4.setBounds(50,150,40,40);  
        b4.setBackground(Color.yellow);
        b5=new Button("5");  
        b5.setBounds(100,150,40,40);  
        b5.setBackground(Color.blue);
        b6=new Button("6");  
        b6.setBounds(150,150,40,40);
        b6.setBackground(Color.yellow);
        b7=new Button("7");  
        b7.setBounds(50,200,40,40); 
        b7.setBackground(Color.blue);
        b8=new Button("");  
        b8.setBounds(100,200,40,40);  
        b8.setBackground(Color.yellow);
        b9=new Button("8");  
        b9.setBounds(150,200,40,40);  
        b9.setBackground(Color.blue);
        b10= new Button("Start Timer");
        b10.setBounds(300,320,40,40);
        b10.setSize(90, 40);
        l= new JLabel("Timmer");
        l.setFont(new Font("arial",Font.ITALIC,25));
        l.setForeground(Color.red);
        l.setBounds(200,300,100,100);
// Adding action listeners to the buttons
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  
        b6.addActionListener(this);  
        b7.addActionListener(this);  
        b8.addActionListener(this);  
        b9.addActionListener(this);  
        b10.addActionListener(this);
// Adding components to the frame
        add(l2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(l);
        add(b10);
        setTitle("Puzzle");
        setSize(500,500);  
        setLayout(null);  
        setVisible(true); 
        setDefaultCloseOperation(3);
       }
      public void actionPerformed(ActionEvent e){ 

//Timer Code
    	timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            { 
              if (count<250) 
             { 
               l.setText(Integer.toString(count++));
              } else
            	  
              {
            	// Alert message box  
            	  
                ((Timer) (e.getSource())).stop();
                JOptionPane.showMessageDialog(null,"TIME UP!!");
              }
            }
          });
          timer.setInitialDelay(0);
          timer.setDelay(1000);
          timer.start();
          if(e.getSource()==b10)
    	 {
    	              JFrame frame = new JFrame();
    		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		    frame.setLayout(new BorderLayout());
            }
// Working of puzzle
            if(e.getSource()==b1){  
            String label=b1.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b1.setLabel("");  
            }  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b1.setLabel("");  
            }  
        }  
        if(e.getSource()==b2){  
            String label=b2.getLabel();  
            if(b1.getLabel().equals("")){  
                b1.setLabel(label);  
                b2.setLabel("");  
            }  
            if(b3.getLabel().equals("")){  
                b3.setLabel(label);  
                b2.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b2.setLabel("");  
            }  
        }  
        if(e.getSource()==b3){  
            String label=b3.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b3.setLabel("");  
            }  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b3.setLabel("");  
            }  
        }  
        if(e.getSource()==b4){  
            String label=b4.getLabel();  
            if(b1.getLabel().equals("")){  
                b1.setLabel(label);  
                b4.setLabel("");  
            }  
            if(b7.getLabel().equals("")){  
                b7.setLabel(label);  
                b4.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b4.setLabel("");  
            }  
        }  
        if(e.getSource()==b5){  
            String label=b5.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b5.setLabel("");  
            }  
        }  
        if(e.getSource()==b6){  
            String label=b6.getLabel();  
            if(b9.getLabel().equals("")){  
                b9.setLabel(label);  
                b6.setLabel("");  
            }  
            if(b3.getLabel().equals("")){  
                b3.setLabel(label);  
                b6.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b6.setLabel("");  
            }  
        }  
        if(e.getSource()==b7){  
            String label=b7.getLabel();  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b7.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b7.setLabel("");  
            }  
        }  
        if(e.getSource()==b8){  
            String label=b8.getLabel();  
            if(b9.getLabel().equals("")){  
                b9.setLabel(label);  
                b8.setLabel("");  
            }  
            if(b7.getLabel().equals("")){  
                b7.setLabel(label);  
                b8.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b8.setLabel("");  
            }  
        }  
        if(e.getSource()==b9){  
            String label=b9.getLabel();  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b9.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b9.setLabel("");  
            }  
        }  
          
        //Congrats code  
        if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
                .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
                &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
                .equals("8")&&b9.getLabel().equals("")){  
        	 
                JOptionPane.showMessageDialog(this,"Congratulations! You won."); 
                }    
        }  
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
      }
    }
