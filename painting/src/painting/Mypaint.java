package painting;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Mypaint extends JFrame{
	
	public Mypaint()
	{
		super("使用鼠标画直线");
		this.setBounds(400,300,400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(new MypaintCanvas());
		this.setVisible(true);
		
	}
	
	class MypaintCanvas extends Canvas implements MouseListener,MouseMotionListener
	{
		Point start,end,lasted;
		public MypaintCanvas()
		{
			start=end=lasted=null;
			this.addMouseMotionListener(this);
			this.addMouseListeber(this);
			
		}
		private void addMouseListeber(MypaintCanvas mypaintCanvas) {
			
			// TODO Auto-generated method stub
			
		}
		private void addMouseMotionListener(MypaintCanvas mypaintCanvas) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseDragged(MouseEvent me) {
			lasted=end;
			end=new Point(me.getX(),me.getY());
			repaint();
			
			
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent me) {
			start=new Point(me.getX(),me.getY());
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent me) {
			end=new Point(me.getX(),me.getY());
			repaint();
			
			// TODO Auto-generated method stub
			
		}
		public void paint(Graphics g)
		{
			if(start!=null&&lasted!=null)
			{
				g.setColor(this.getBackground());
				g.drawLine(start.x,start.y,lasted.x,lasted.y);
				g.setColor(Color.blue);
				g.drawLine(start.x, start.y, end.x, end.y);
				
			}
			
		}
		
		
		public void update(Graphics g)
		{
			paint(g);
		}
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			new Mypaint();
	}

}
