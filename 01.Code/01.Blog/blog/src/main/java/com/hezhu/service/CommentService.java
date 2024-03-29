package com.hezhu.service;

import com.hezhu.po.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
