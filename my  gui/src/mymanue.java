import java.awt.*;
import java.awt.event.*;
public class mymanue {
	private Frame f;
	private MenuBar bar;
	private Menu fileme;
	private MenuItem open,save,close;
	private FileDialog opendia,savedia;
	
	/*private MenuBar mb;
	private Menu m1,m2;
	private MenuItem mi1,mi2;
	*/
	mymanue()
	{
		init();
	}
	 public void init()
	 {
		 
		 f=new Frame("我的菜单");
		 f.setBounds(200,200,400,350);
		 f.setLayout(new FlowLayout());
		 bar=new MenuBar();
		 
		 fileme=new Menu("文件");
		 open=new MenuItem ("打开");
		 save=new MenuItem("保存");
		 close=new MenuItem("关闭");
		 fileme.add(open);
		 fileme.add(save);
		 fileme.add(close);
		 bar.add(fileme);
		 f.setMenuBar(bar);
		 
		 opendia=new FileDialog(f,"我要打开",FileDialog.LOAD);
		 savedia=new FileDialog(f,"我要保存",FileDialog.SAVE);
		 
		/*mb=new MenuBar();
		 m1=new Menu("文件");
		 m2=new Menu("子菜单");
		 mi1=new MenuItem("退出");
		 mi2=new MenuItem("开始");
		 m1.add(m2);
		 m2.add(mi1);
		 m1.add(mi2);
		 mb.add(m1);*/
		 
		
		 event();
		 f.setVisible(true);
	 }
	
	 private void event()
	 
	 {
		 open.addActionListener(new ActionListener()
				 {
			 public void actionPerformed(ActionEvent e)
			 {
				 opendia.setVisible(true);
			 }
			 
				 });
		 
		 
		 save.addActionListener(new ActionListener()
				 {
			 public void actionPerformed(ActionEvent e)
			 {
				 savedia.setVisible(true);
			 }
				 });
		 
		 
		close.addActionListener(new ActionListener()
			 {
		 public void actionPerformed(ActionEvent e)
		 {
			 System.exit(0);
		 }
			 });
		 
		 
		 
		 
		 f.addWindowListener(new WindowAdapter()
			 {
		 public void windowClosing(WindowEvent e)
		 {
			 System.exit(0);
		 }
			 });
		 
	 }
	
	
	public static void main(String args[]){
		new mymanue();
	}

}
