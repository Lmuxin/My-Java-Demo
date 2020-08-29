package 四叶玫瑰;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoseJFrame extends JFrame implements ActionListener {
	private RoseCanvas canvas;
	public RoseJFrame()
	{
		super("四叶玫瑰");
		Dimension dim=getToolkit().getScreenSize();
		this.setBounds(dim.width/4,dim.height/4,dim.width/2,dim.height/2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel jpanel=new JPanel();
		this.getContentPane().add(jpanel,"North");
		JButton button_color=new JButton("选择颜色");
				jpanel.add(button_color);
				button_color.addActionListener(this);
				this.canvas=new RoseCanvas(Color.red);
		this.getContentPane().add(this.canvas,"Center");
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		Color c=JColorChooser.showDialog(this, "选择颜色", Color.blue);
		this.canvas.setColor(c);
		this.canvas.repaint();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoseJFrame();
		
}
}
 class RoseCanvas extends Canvas
 {
      private Color color; 
      public RoseCanvas(Color color)
      {
    	  this.setColor(color);
      }
      
	void setColor(Color color2) {
		// TODO Auto-generated method stub
		this.color=color;
		
	}
		
		public void paint(Graphics g)
		{
			int x0=this.getWidth()/2;
			int y0=this.getHeight()/2;
			g.setColor(this.color);
			g.drawLine(x0,0,x0,y0*2);
			g.drawLine(0, y0, x0*2, y0);
	for(int j=40;j<200;j+=20)
		for(int i=0;i<1023;i++)
	{
		double angle=i*Math.PI/521;
		double radius=j*Math.sin(2*angle);
		int x=(int )Math.round(radius*Math.cos(angle)*2);
		int y=(int)Math.round(radius*Math.sin(angle));
		g.fillOval(x0+x, y0+y, 2,2);
	}
			
		}
		
		
		
		
}
	