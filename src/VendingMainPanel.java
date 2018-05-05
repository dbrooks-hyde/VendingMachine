import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JPanel;


public class VendingMainPanel extends JPanel {

	private final int preferredWidth = 300;
	private final int preferredHeight = 500;
	
	private final int controlPanelX = 200;
	private final int controlPanelY = 300;
	
	private ControlPanelEmbedded controlPanel;
	
	public void init()
	{
		// turn off the layout manager - we are going to be doing all of our control placement by pixel.
		this.setLayout(null);
		
		controlPanel = new ControlPanelEmbedded();
		this.add(controlPanel);

		Dimension controlPanelSize = controlPanel.getPreferredSize();
		controlPanel.setBounds(controlPanelX, controlPanelY, controlPanelSize.width, controlPanelSize.height);
		controlPanel.setVisible(true);
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(preferredWidth, preferredHeight);
	}
	
	public VendingMainPanel() 
	{
		init();
	}

	public VendingMainPanel(LayoutManager layout) 
	{
		super(layout);
		init();
	}

	public VendingMainPanel(boolean isDoubleBuffered) 
	{
		super(isDoubleBuffered);
		init();
	}

	public VendingMainPanel(LayoutManager layout, boolean isDoubleBuffered) 
	{
		super(layout, isDoubleBuffered);
		init();
	}
}
