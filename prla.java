 import javax.swing.*; import java.awt.event.*; import java.awt.*;
  class BorderDemo   extends  JFrame
     {     JButton b1;      JTextArea ta; JTextField tf; JScrollPane jp;
       public BorderDemo()
           {   b1=new JButton("Open");            b1.setFont(new Font("courier",Font.BOLD,20));
                jp = new JScrollPane(ta);
				tf = new JTextField();  tf.setFont(new Font("courier",Font.BOLD,20));tf.setBackground(Color.BLACK);
                tf.setForeground(Color.YELLOW);
				ta=new JTextArea(2,2);              ta.setFont(new Font("courier",Font.BOLD,20));
                setLayout( new BorderLayout( 10,10 ) );             
                add(tf,BorderLayout.NORTH);
                add(jp,BorderLayout.CENTER);
				add(ta);
				add(b1, BorderLayout.SOUTH);    
                
                setSize(200,200); setVisible(true);  setBackground( Color.RED  );
           }
           public static void main(String args[])         {          new BorderDemo();       }
        }
