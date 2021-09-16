
       import javax.swing.*;
       import java.awt.*;
	   import java.awt.event.*;
       class  MyFrame  extends JFrame implements ActionListener
             {
                 JTextField tf;
                 JButton   btn;
                 MyFrame()
                      {
                          tf = new JTextField(20);
                          btn = new JButton("ok");
                          setLayout( new FlowLayout() );
                          add(tf); add(btn);
                          btn.addActionListener( this );
                          setSize(200,200); setVisible(true);
                       }
                   public static void main(String args[] )
                       {
                             new MyFrame();
                       }
                   public void  actionPerformed( ActionEvent e )
                         {
                 int  x;
                 double y;
                             
                    x  =   Integer.parseInt (  tf.getText() );
                    y  =   Double.parseDouble( tf.getText() );
                            
                            System.out.println( " x  =  "  +  x );
                            System.out.println( " y  =  "  +  y );                                                                                                               
                         }                         
             } 