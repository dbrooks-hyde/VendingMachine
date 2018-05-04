import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class ControlPanel extends JPanel implements MouseListener
{
	protected String [][] buttons = {
			{ "1", "2", "3", "A" },
			{ "4", "5", "6", "B" },
			{ "7", "8", "9", "C" },
			{ "*", "0", "#", "D" }
  		};
	

	public Dimension getPreferredSize()
	{
		return new Dimension(300, 300);
	}
	
	protected void init()
	{
		this.setBackground(Color.BLUE);
		this.setForeground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
		
		this.setFont(new Font("Dialog", Font.BOLD, 18));
		
		addMouseListener(this);	}
	
	public ControlPanel() 
	{
		init();
	}

	public ControlPanel(LayoutManager layout) 
	{
		super(layout);
		init();
	}

	public ControlPanel(boolean isDoubleBuffered) 
	{
		super(isDoubleBuffered);
		init();
	}

	public ControlPanel(LayoutManager layout, boolean isDoubleBuffered) 
	{
		super(layout, isDoubleBuffered);
		init();
	}

	//////////////////////////////////////////////////////////
	// MouseListener Interface Methods
    public void mousePressed(MouseEvent e) {
     }

     public void mouseReleased(MouseEvent e) {
     }

     public void mouseEntered(MouseEvent e) {
     }

     public void mouseExited(MouseEvent e) {
     }

     public void mouseClicked(MouseEvent e) 
     {
    	 System.out.println("Mouse clicked in control panel!");
    	 // See if it landed in one of the 'buttons'
    	 
     }
	//////////////////////////////////////////////////////////
	
 	public void paintComponent(Graphics g)
 	{
 		super.paintComponent(g);
 		
 		// Now paint the buttons...
 		for (int col = 0; col < buttons.length; col++)
 			for (int row = 0; row < buttons[0].length; row++)
 			{
 				// Draw each button in a square...
 				g.drawString(buttons[row][col], 15 + col*15, 15 + row*20);
 			}
 	}
	
}
