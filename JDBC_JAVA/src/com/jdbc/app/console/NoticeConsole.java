package com.jdbc.app.console;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.sevice.NoticeService;

public class NoticeConsole {
	private NoticeService ns;
	private int page;
	private int count;

	public NoticeConsole() {
		ns = new NoticeService();
		page = 1;
		count =0;
	}

	public void printNoticeList() { // 글 목록
		List<Notice> list = ns.getList(page);
		count = ns.getCount();
		System.out.println("---------------------------------------------------");
		System.out.println("<공지사항> 총 "+count+"건의 게시글");
		System.out.println("---------------------------------------------------");

		for (Notice n : list) {
			int id = n.getId();
			String title = n.getTitle();
			String writerId = n.getWrite_id();
			Date date = n.getRegdate();

			System.out.println(id + " . " + title + " / " + writerId + " /" + date);
			System.out.println("---------------------------------------------------");
		}

	}

	public int inputMenu() { // 메뉴
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 상세조회 ||2. 이전 ||3. 다음 ||4. 글쓰기 ||5. 종료");
		String menu_ = sc.nextLine();
		int menu = Integer.parseInt(menu_);
		return menu;
	}

	public void movePrevList() { //이전
		if(page==1) {
			System.out.println("페이지가 존재하지 않습니다.");
			return;
		}
		page--;

	}

	public void moveNextList() { //다음
		page++;

	}

}
