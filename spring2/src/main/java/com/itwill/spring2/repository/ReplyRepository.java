package com.itwill.spring2.repository;

import java.util.List;

import com.itwill.spring2.domain.Reply;

public interface ReplyRepository {

        List<Reply> selectByPostId(long postId);
        
        Reply selectById(long id); // 댓글 한개를 리턴한는 메서드
        
        int insert(Reply reply);
        
        int update(Reply reply); // 메서드의 이름은 mapper의 아이디와 같아야함.
        
        int delete(long id);
        
        // 포스트에 달린 댓글의 개수를 리턴하는 메서드
        long selectReplyConutWithPostId(long postId);
}
