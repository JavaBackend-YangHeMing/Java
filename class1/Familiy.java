package class1;

public class Familiy {
private TV homeTV;//引用类型：类、接口、数组

public Familiy(TV homeTV) {
	this.homeTV = homeTV;
}
public void remoteControl(int channel) {
	homeTV.setChannel(channel);
}
public void seeTV() {
	homeTV.showProgram();
}
}
