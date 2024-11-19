package dev.heimao.demo.service;

import dev.heimao.demo.entity.Comment;

import java.util.List;

public interface CommentService {
     Comment findById(Integer id);

     List<Comment> findAll();

     boolean setComment(Comment newcomment);
     boolean setAdminComment(Comment newcomment);

     Comment getNewComment(String Content, Integer authorId, boolean fromAdmin);
}