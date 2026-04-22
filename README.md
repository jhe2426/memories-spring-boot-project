# Memories SpringBoot Project <br/>
사용자의 기억력 및 집중력 향상을 위한 검사 및 기록 관리 웹 서비스 <br/>

## 개발 기간
* 2025.08.05 ~ 2025.11.12(약 3개월) <br/>

## 시연 영상
[시연 영상 링크](https://youtu.be/4rnBHSCdIe0) <br/>

## 주요 기능
#### 인증 / 로그인 페이지
* JWT 기반 로그인 기능 구현 (Access Token 발급 및 인증 처리)
* 카카오 / 네이버 OAuth2 로그인 연동

#### 회원가입 페이지
* 아이디 중복 확인 및 유효성 검증 로직 구현
* 비밀번호 패턴 및 일치 여부 검증 기능 구현

#### 메인 페이지
* 사용자 정보 조회 및 수정 기능 구현
* 기억력 / 집중력 검사 기록 조회 기능 구현
* OpenAI API를 활용한 개인 맞춤형 인지 향상 방법 제공 기능 구현
  
#### 기억력 검사 페이지
* 카드 매칭 기반 기억력 테스트 기능 구현
* 검사 시간 측정 및 결과 저장 기능 구현
* 검사 기록 조회 및 페이징 처리 구현
  
#### 집중력 검사 페이지
* 시간 기반 반응 테스트 기능 구현 (성공 / 오류 횟수 측정)
* 검사 결과 저장 및 기록 관리 기능 구현
* 검사 기록 조회 기능 구현
  
#### 일기 기능 페이지
* 일기 작성 / 조회 / 수정 / 삭제 기능 구현
* 일기 작성 기능 구현
* 일기 댓글 작성 및 조회 기능 구현
* 일기 목록 조회 기능 구현 <br/>

## 기술 스택
- Spring boot 3.5.5
- Java 23
- Lombok
- Spring web
- Spring validation
- Spring data JPA
- Spring security
- Spring oauth2 client
- JJWT 0.11.2
- MySQL Connector <br/>

## 개발 문서
 [개발 문서 링크](https://github.com/jhe2426/memories-document) <br/>
