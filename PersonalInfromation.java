
public class PersonalInfromation {

	public static void main(String[] args) {
		String info="姓名：张三 出生时间：1989.10.16。个人网站：http://www.zhang.com。身高：185cm，体重：72kg";
		int index= info.indexOf("："); //返回字符串中首次出现冒号的位置
		String name=info.substring(index+1);
		if(name.startsWith("张")){	
			System.out.println("简历中的姓名是否姓张：是");
		}
		else {
			System.out.println("简历中的姓名是否姓张：否");
		}
		index= info.indexOf("：",index+1);  //返回字符串中第2次出现冒号的位置
		String date=info.substring(index+1,index+11);
		System.out.println("出生时间："+date);
		index=info.indexOf("：",index+1);
		int heightPosition= info.indexOf("身高"); //返回字符串中首次出现身高的位置
		String Web=info.substring(index+1,heightPosition-1);
		System.out.println("个人网站："+Web);
		index=info.indexOf("：",index+1); //返回字符串中身高后面的冒号位置
		int cmposition=info.indexOf("cm");
		String height=info.substring(index+1,cmposition);
		height=height.trim();
		int h=Integer.parseInt(height);
		if(h>=180){
			System.out.println("简历中身高是否大于180cm：是     身高为："+height+"cm");
		}
		else {
			System.out.println("简历中身高是否大于180cm：否     身高为："+height+"cm");
		}
		index=info.indexOf("：",index+1);//返回字符串中最后一个冒号的位置
		int kgPosition=info.indexOf("kg");
		String weight=info.substring(index+1,kgPosition);
		weight=weight.trim();
		int w=Integer.parseInt(weight);
		if(w>=75){
			System.out.println("体重是否小于75kg：是   体重为："+weight+"kg");
		}
		else{
            System.out.println("体重是否小于75kg：否   体重为："+weight+"kg");
        }
	}
}