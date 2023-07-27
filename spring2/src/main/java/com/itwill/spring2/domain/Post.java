package com.itwill.spring2.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Post {

    private long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime created_time; // mybatis사용을 위해 자바처럼 설정하지 않음.
    private LocalDateTime modified_time;
    
    
    
    
    
}
