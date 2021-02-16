package Java_0106;
import java.util.ArrayList;
import java.util.Scanner;

import Java_0108.Field_val;

public class Exam_list {
	    
		Exam[] exams;
		int current;

		// init 함수를 생성자로 대체
		public Exam_list() {
			this.current = 0;
			this.exams = new Exam[3];
		}

		public Exam get(int i) {
			return exams[i];
		}

		public void add(int kor, int eng, int math) {
			Exam exam = new Exam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
		
			if (exams.length == current) {
				Exam[] temp = new Exam[exams.length + 5];
				for (int i = 0; i < exams.length; i++) {
					temp[i] = exams[i];
				}
				exams = temp; // 주석 추가
			}
			exams[current] = exam;
			current++;
			System.out.println(exams[current]);
		}
		
		public int size() {
			return current;
		}
	}

