package com.sorune.gttapiserver.comment.repository;

import com.sorune.gttapiserver.comment.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByNewsNo(Long newsNo, Pageable pageable);
    Page<Comment> findAllByNotiNo(Long notiNo, Pageable pageable);

}
