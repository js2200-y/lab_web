package com.itwill.spring2.stream;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

// 스프링 컨텍스트(application-context.xml 또는 servlet-context.xml)를 사용하지 않는
// 단위 테스트에서는 @ExtendWith, @ContextConfiguration 애너테이션을 사용할 필요가 없음.
public class StreanTest {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(numbers);

        // numbers에서 홀수들만 필터링한 결과:
        List<Integer> odds = numbers.stream().filter((x) -> x % 2 == 1).toList();

        System.out.println(odds);

        
        // numbers의 원소들의 제곱으로 이루어진 리스트
        List<Integer> squares = numbers.stream()
                .map((x) -> {return x * x;}) // 문장이 한개일 경우 중괄호와 세미콜로노 생략 가능!
                .toList();
        System.out.println(squares);
        
        
        // numbers의 원소들 중 홀수들의 제곱
        List<Integer> oddSquares = numbers.stream()
                .filter((x) -> x % 2 == 1)
                .map((x) -> x * x)
                .toList();
        System.out.println(oddSquares);
        
        List<String> languages = Arrays.asList("Java", "SQL", "JavaScript");
        System.out.println(languages);
        
        // languages가 가지고 있는 문자열들의 길이를 원소로 갖는 리스트
        List<Integer> lengths = languages.stream()
                .map((x) -> x.length())
                // .map(String::length) (x) -> x.length()
                // 문장이 한개일때 바꿔서 사용가능~!
                .toList();
        System.out.println(lengths);
                
        List<LocalDateTime> times = Arrays.asList(
                
                LocalDateTime.of(2023, 5, 23, 11, 30, 0),
                LocalDateTime.of(2023, 5, 24, 12, 30, 0),
                LocalDateTime.of(2023, 5, 25, 18, 00, 0)
        );
        
        System.out.println(times);
        
        // LocalDateTime 타입을 Timestamp 타입으로 변환
        List<Timestamp> timestamps = times.stream()
                .map(Timestamp::valueOf) // .map((x) -> Timestamp.valueOf(x))
                // 아규먼트를 그대로 전달받아 사용할 경우에만 사용가능함~~~!!
                .toList();
        System.out.println(timestamps);
        
        
    }

}
