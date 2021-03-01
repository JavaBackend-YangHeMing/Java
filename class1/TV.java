package class1;
//最大的概念就是类
/**
 * channel:int
 * setChannel(int):void
 * getChannel():int
 * showProgram():void
 * @author 胡根深
 *
 */
public class TV {
	private int Channel;

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		Channel = channel;
	}
public void showProgram() {
	switch(Channel) {
	case 1:
		System.out.println("综合频道");
		break;
	case 2:
		System.out.println("电影频道");
		break;
	}
}
}

			



