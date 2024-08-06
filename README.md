# kotlin-racingcar

초간단 자동차 경주 게임을 구현한다.

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.
---
# 실행결과
```kotlin
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
hoon,seong,choi
시도할 횟수는 몇 회인가요?
5

실행 결과
hoon : -
seong : 
choi : -

hoon : --
seong : -
choi : --

hoon : ---
seong : --
choi : ---

hoon : ----
seong : ---
choi : ----

hoon : -----
seong : ----
choi : -----

최종 우승자: hoon, choi
```
---
# 기능 명세
### 주요 기능

1. 사용자가 자동차 이름 입력
2. 시도할 횟수 입력
3. 입력된 횟수만큼 각 자동차를 이동
4. 이동 종료 후 최종 우승자 출력

### 자동차 이름 입력

- [x]  이름 입력 안내 문구 출력
- [x]  사용자로부터 자동차 이름들 입력받는 기능
- [x]  이름을 쉼표 기준으로 구분하여 저장하는 기능

### 시도할 횟수 입력

- [x]  횟수 입력 안내 문구를 출력
- [x]  사용자로부터 라운드 횟수를 입력받는 기능

### 자동차 이동(게임 진행)

- [ ]  "실행 결과" 문구 출력
- [ ]  각 자동차별 1자리 난수 생성 기능
- [ ]  난수값이 4 이상인지 확인하는 기능
- [ ]  난수값이 4 이상인 자동차의 위치를 1 증가시키는 기능
- [ ]  각 라운드 별 실행 결과(자동차 위치) 출력하는 기능
- [ ]  입력된 횟수만큼 라운드를 반복하는 기능

### 우승자 출력

- [ ]  우승자(가장 멀리 이동한 자동차)를 판별하는 기능
- [ ]  우승자 출력 기능
    - [ ]  공동 우승자의 경우 ","로 구분하여 출력해야 함

---

# 예외처리

- 자동차 이름 입력 시 유효한 입력이 아니라면 재 시도
    - 입력된 이름들의 유효성 검증
        - [ ]  이름은 5자 이하만 가능
        - [ ]  중복된 이름 설정 불가
        - [ ]  [a-zA-Z]+