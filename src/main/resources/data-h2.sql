INSERT INTO TICKET (ID,
                    USER_ID,
                    PERFORMANCE_ID,
                    FACILITY_NAME,
                    PERFORMANCE_NAME,
                    PERFORMANCE_RUNTIME,
                    PERFORMANCE_AGE,
                    PERFORMANCE_CAST,
                    PERFORMANCE_CREW,
                    SCORE)
VALUES (1,
        'plic@naver.com',
        'PF131819',
        '샘터파랑새극장',
        '종이아빠',
        '2시간 15분',
        '만 12세 이상',
        '박유덕, 김종구, 김성철, 손승원, 김히어라, 문성일, 윤나무, 손유동, 박시환, 고유정 등',
        '강병진, 정태진, 김태형 등',
        '5.0');
INSERT INTO TICKET (ID,
                    USER_ID,
                    PERFORMANCE_ID,
                    FACILITY_NAME,
                    PERFORMANCE_NAME,
                    PERFORMANCE_RUNTIME,
                    PERFORMANCE_AGE,
                    PERFORMANCE_CAST,
                    PERFORMANCE_CREW)
VALUES (2,
        'plic@naver.com',
        'PF131795',
        '샘터파랑새극장',
        '엄마는 안가르쳐줘',
        '2시간 15분',
        '만 12세 이상',
        '김히어라, 문성일, 윤나무, 손유동, 박시환, 고유정 등',
        '강병진, 정태진, 김태형 등');
INSERT INTO TICKET (ID,
                    USER_ID,
                    PERFORMANCE_ID,
                    FACILITY_NAME,
                    PERFORMANCE_NAME,
                    PERFORMANCE_RUNTIME,
                    PERFORMANCE_AGE,
                    PERFORMANCE_CAST,
                    PERFORMANCE_CREW,
                    SCORE,
                    COMMENT)
VALUES (3,
        'plic@naver.com',
        'PF131595',
        '울시어터',
        '눈의여왕',
        '2시간 15분',
        '만 12세 이상',
        '박유덕, 김종구, 김성철, 손승원, 박시환, 고유정 등',
        '강병진, 정태진, 김태형 등',
        '4.0',
        '재밌어요');
INSERT INTO TICKET (ID,
                    USER_ID,
                    PERFORMANCE_ID,
                    FACILITY_NAME,
                    PERFORMANCE_NAME,
                    PERFORMANCE_RUNTIME,
                    PERFORMANCE_AGE,
                    PERFORMANCE_CAST,
                    PERFORMANCE_CREW,
                    SCORE,
                    COMMENT)
VALUES (4,
        'plic@naver.com',
        'PF128899',
        '우리네극장',
        '어린왕자의 꿈',
        '2시간 15분',
        '만 12세 이상',
        '박유덕',
        '강병진, 정태진, 김태형 등',
        '2.5',
        '최악이었어요');
INSERT INTO TICKET (ID,
                    USER_ID,
                    PERFORMANCE_ID,
                    FACILITY_NAME,
                    PERFORMANCE_NAME,
                    PERFORMANCE_RUNTIME,
                    PERFORMANCE_AGE,
                    PERFORMANCE_CAST,
                    PERFORMANCE_CREW)
VALUES (5,
        'plic@naver.com',
        'PF123206',
        '예술극장 나무와물',
        '구름빵 (동요콘서트)',
        '2시간 15분',
        '만 12세 이상',
        '박유덕, 김종구, 손유동, 박시환, 고유정 등',
        '강병진, 정태진, 김태형 등');

INSERT INTO WISHLIST(USER_ID, FACILITY_NAME, PERFORMANCE_NAME, PERFORMANCE_START_DATE, PERFORMANCE_END_DATE) values (1, 'CJ아지트 대학로', '마이버킷리스트', '2018/06/01', '2018/06/30');

INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (1, 'asd', '1', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (2, 'asd', '2', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (3, 'asd', '3', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (4, 'asd', '4', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (5, 'asd', '5', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (6, 'asd', '6', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (7, 'asd', '7', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (8, 'asd', '8', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (9, 'asd', '9', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (10, 'asd', '10', now());
INSERT INTO KEYWORD (ID, USER_ID, WORD, NOW_DATE)
VALUES (11, 'asd', '11', now());