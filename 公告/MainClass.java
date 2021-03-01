package 公告;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Notice notice1 = new Notice(1,"你好","朋友",new Date());
		Notice notice2 = new Notice(2,"hello","friends",new Date());
		List<Notice> NoticeList = new ArrayList<Notice>();
		NoticeList.add(notice1);
		NoticeList.add(notice2);
		System.out.println("公告：");
		for(int i =0;i<NoticeList.size();i++) {
			Notice notice = NoticeList.get(i);
			System.out.println((i+1)+":"+((Notice)(NoticeList.get(i))).getTitle());
		}
		System.out.println("***********************");
		Notice notice3=new Notice(3,"你好2","朋友2",new Date());
		NoticeList.add(1,notice3);
		System.out.println("添加后：");
		for(int i =0;i<NoticeList.size();i++) {
			System.out.println((i+1)+":"+((Notice)(NoticeList.get(i))).getTitle()+((Notice)(NoticeList.get(i))));
		}
		System.out.println("***********************");
		NoticeList.remove(2);
		System.out.println("删除后：");
		for(int i =0;i<NoticeList.size();i++) {
			System.out.println((i+1)+":"+((Notice)(NoticeList.get(i))).getTitle()+((Notice)(NoticeList.get(i))));
		}
		System.out.println("**********************");
		notice3.setTitle("修改");
		NoticeList.set(1, notice3);
		System.out.println("修改后：");
		for(int i =0;i<NoticeList.size();i++) {
			System.out.println((i+1)+":"+((Notice)(NoticeList.get(i))).getTitle()+((Notice)(NoticeList.get(i))));
		}
		
		

	}

}
