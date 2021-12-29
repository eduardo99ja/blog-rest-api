package com.apodaca.blog.service;

import com.apodaca.blog.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);


}
