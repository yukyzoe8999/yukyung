package com.home_work.app.console;

import java.util.*;
import com.home_work.app.service.WeatherService;
import com.home_work.app.entity.*;


public class WeatherConsole {
	private Scanner scan = new Scanner(System.in);
	private WeatherService ws;
	
	public WeatherConsole() {
		ws = new WeatherService();
	}
	
	public int choice_menu() {	//최상위 메뉴
		System.out.println("[1]온도 관리 [2] 온도 조회 [3] 지역 관리 [4] 지역 조회 [5] 사용자 관리 [6] 우수사원 조회 [7]종료");
		int menu = scan.nextInt();
		return menu;
	}
	
	public void temp_management() {	//[1]온도 관리 메뉴

	}
	public void input_temp_insert() {

	}
	
	public void temp_search() {
		
	}
	
	public void location_management() {
		
	}
	
	public void location_search() {
		
	}
	
	public void user_management() {
		
	}
	public void user_ranking() {
		
	}
}
