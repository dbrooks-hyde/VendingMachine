import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ControlPanelEmbedded extends JPanel implements MouseListener, WindowStateListener
{
	private final int preferredWidth = 100;
	private final int preferredHeight = 100;

	private ControlPanelFrame controlFrame = null;
	
	protected String [][] buttons = {
			{ "1", "2", "3", "A" },
			{ "4", "5", "6", "B" },
			{ "7", "8", "9", "C" },
			{ "*", "0", "#", "D" }
  		};
	
	//////////////////////////////////////////////////////////
	// MouseListener Interface Methods
	public void windowStateChanged(WindowEvent e)
	{
		if (e.getNewState() == WindowEvent.WINDOW_CLOSED)
			controlFrame = null;
	}
	//////////////////////////////////////////////////////////
	
	
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

    	 if (null == controlFrame)
    	 {
	         controlFrame = new ControlPanelFrame("Control Panel");
	         controlFrame.addWindowStateListener(this);
	         controlFrame.setVisible(true);
    	 }
    	 else
    	 {
    		 controlFrame.toFront();
    		 controlFrame.repaint();
    	 }
     }
	//////////////////////////////////////////////////////////
	
	
	
	public void init()
	{
		this.setBackground(Color.BLUE);
		this.setForeground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
		
		this.setFont(new Font("Dialog", Font.BOLD, 18));
		
		addMouseListener(this);
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(preferredWidth, preferredHeight);
	}
	
	public ControlPanelEmbedded() 
	{
		init();
	}

	public ControlPanelEmbedded(LayoutManager layout) 
	{
		super(layout);
		init();
	}

	public ControlPanelEmbedded(boolean isDoubleBuffered) 
	{
		super(isDoubleBuffered);
		init();
	}

	public ControlPanelEmbedded(LayoutManager layout, boolean isDoubleBuffered) 
	{
		super(layout, isDoubleBuffered);
		init();
	}
	
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
