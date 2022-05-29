package com.jbest.interfaces.assembler;

import com.jbest.domain.comment.entity.Comment;
import com.jbest.interfaces.dto.CommentDto;

public class CommentAssembler {
    
    public static CommentDto toDto(Comment comment){
        return new CommentDto();
    }

    public static CommentDto toTarget(String memo){
        return new CommentDto();
    }
}
