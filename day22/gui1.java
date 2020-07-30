import java.awt.*;
class  Gui
{
public  static void main(String[] args)
{
Frame f=new Frame();
f.setSize(500,300);
f.setLocation(200,300);
Button b=new Button("我是一个按钮");

f.add(b);
f.setVisible(true);

}



}