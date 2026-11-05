package com.office.diary;

import java.util.Scanner;

public class DiaryController implements IDiaryConfig{

	
	final private DiaryService diaryService;
	
	public DiaryController( DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systmFlag = true;
		
		while (systmFlag) {
			System.out.println("1. Write   2. Read   99.SyStem-out");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case DIARY_WREITE:
				
				scanner.nextLine();
				
				System.out.println("INPUT NEW DIARY TXT");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.writeNewDiary(diaryDto);
				
				break;
				
            case DIARY_READ:
				
            	diaryService.readDiaries();
            	
				break;
				
            case SYSTEM_OUT:
            	
            	systmFlag = false;
	
	          break;
	
	

			
			}
		}
		
		scanner.close();
		
	}
}

//DAO먼저 작업하기 뒤에서 부터 작업하자
