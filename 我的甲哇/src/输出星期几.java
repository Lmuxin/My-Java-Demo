
public class 输出星期几 {
	public static void main(String arg[]){
		int year=2016,month=10, day=24;
		boolean leap=year%400==0||year%4==0&&year%100!=0;
		int total=year-1980+(year-1980+3)/4;
		for(int i=month-1;i>0;i--)
		switch(i)
		{
		case 1:
			case 3:
				case 5:
					case 7:
						case 8:
							case 10:total+=31;break;
							case 4:
							case 6:
							case 9:
							case 11:total+=30;break;
							case 2:total+=leap?29:28;
							
								}
		
		total+=day;
		int week=1;
		week=(week+total)%7;
		System.out.println(year+"年"+month+"月"+day+"日   星期");
		switch(week){
		case 0:System.out.println("日");break;
		case 1:System.out.println("一");break;
		case 2:System.out.println("二");break;
		case 3:System.out.println("三");break;
		case 4:System.out.println("四");break;
		case 5:System.out.println("五");break;
		case 6:System.out.println("六");break;
		}
		
		
	}

}

