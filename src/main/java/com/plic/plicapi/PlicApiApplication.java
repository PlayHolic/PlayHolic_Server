package com.plic.plicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlicApiApplication.class, args);
	}
}

/*
 * TODO
 * - 로그인: [프론트와 상의하기]
 * - 메인 페이지: 앞으로 관람할 공연 리스트 (2주, 최대 10개) [가인]
 *            + 티켓 리스트 (작성된 순서? 10개씩), 클릭하면 상세 펼치기, 티켓 삭제 [가인]
 * - 메인 (팝업) -> 별점: 작성, 조회, 수정 / 코멘트: 작성, 조회, 수정, 삭제 [가인]
 * - 밀린 별점 리스트 페이지 [가인]
 * - 밀린 코멘트 리스트 페이지 (삭제 가능) [가인]
 * - 작성된 별점 리스트 페이지 [가인]
 * - 작성된 코멘트 리스트 페이지 [가인]
 * - 위시리스트 페이지 <완료>
 * - 히스토리 페이지: 유저 정보 조회, 가장 많이 본 작품(최대 10개), 많이 간 공연장(최대 10개), 선호하는 배우(최대 10개), 선호하는 제작진(최대 10개)
 *               (하루에 한 번, Spring batch) [수재]
 * - 검색 후 작품 상세 페이지: 상세 정보<완료>, 관람 내역<완료>, 티켓 추가<완료>
 *                       -> 관람 내역 리스트 페이지<완료>
 * - 검색 페이지: 결과 리스트 <완료>, 최근 검색어 [수재], 인기 검색어(한 달, firebase 사용?) [가인]
 *
 * batch 프로세스
 * 1. db에서 상영중 / 상영 예정인 모든 데이터를 리스트업
 * 2. 현재 상영중 / 상영 예정인 연극에 대하여 performance, detail 갱신
 * 3. 새로 추가된 데이터는 어떻게 받아올 것인가? - 일정 기간을 (i.e. 오늘로부터 6개월?) 시작 날짜로 하여 performanceName(unique)가 if not exists, 추가
 *
 * */
