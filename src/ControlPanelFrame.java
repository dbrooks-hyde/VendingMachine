import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;


public class ControlPanelFrame extends JFrame {

	
	protected void init()
	{
		ControlPanel c = new ControlPanel();
		c.setVisible(true);
		this.add(c);
		this.pack();
	}
	
	public ControlPanelFrame() throws HeadlessException 
	{
		init();
	}

	public ControlPanelFrame(GraphicsConfiguration arg0) 
	{
		super(arg0);
		init();
	}

	public ControlPanelFrame(String arg0) throws HeadlessException 
	{
		super(arg0);
		init();
	}

	public ControlPanelFrame(String arg0, GraphicsConfiguration arg1) 
	{
		super(arg0, arg1);
		init();
	}
}
