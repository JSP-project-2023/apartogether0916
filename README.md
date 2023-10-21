## AparTogether0916 프로젝트

AparTogether0916 프로젝트는 배달 서비스와 커뮤니티 기능을 결합하여 배달비를 절약하고 커뮤니티 활성화를 촉진하는 목적으로 개발되었습니다.

### 개발 목적

최근 배달의 민족, 요기요와 같은 배달 서비스 플랫폼에서 배달비가 높아지는 경향이 있습니다. AparTogether0916 프로젝트는 이러한 문제점을 해결하고자 하며, 이 프로젝트의 주요 목적은 다음과 같습니다.

1. **배달비 절감**: AparTogether0916는 사용자들이 주문한 음식을 함께 배달받아 배달비를 공동 부담함으로써, 개인이 부담하는 배달비를 절약할 수 있도록 합니다.

2. **커뮤니티 활성화**: AparTogether0916는 주변 아파트 단지나 동네 커뮤니티를 활성화시킵니다. 사용자들은 함께 주문하고 소통하며, 이로써 지역 사회와 이웃들 간의 활발한 상호 작용을 촉진할 수 있습니다.

3. **차별화**: 몇몇 배달 서비스 플랫폼에서 이미 함께 배달 기능을 제공하지만, 대체로 활용이 어렵고 효과가 미미하다고 판단됩니다. AparTogether0916는 사용자들에게 보다 효과적인 배달비 공유 기능과 커뮤니티 기능을 제공함으로써 이러한 문제를 극복하고자 합니다.

### 기능

#### 공통기능 
* 로그인 기능
* 회원 가입 기능
* 투표 등록 (비회원은 제외)
* 투표 마감 (비회원은 제외)
* 투표 하기 (비회원은 제외)
* 회원 정보 관리 (비회원은 제외)
* 가게 목록 보기

#### 업주기능
* 가게 등록
* 가게 매출 확인
* 메뉴별 매출 확인
* 가게 오픈/마감
* 가게 정보 관리
* 가게별 주문 내역 확인

#### 관리자 기능

#### 회원 기능
* 주문하기
* 주문내역 확인

#### 비회원 기능
* (공통 기능 참조)

### 비기능
* 회원 비밀번호 AES암호화
* 랜덤 닉네임 생성

### 웹사이트 구동 방법
1. Github에서 프로젝트 Clone 또는 DownloadZip 클릭
1. 카페에 업로드 된 Apartogether0916.sql파일로 DDL문 생성.
3. \src\main\webapp\start.jsp 실행
