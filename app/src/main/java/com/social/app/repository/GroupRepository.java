package com.social.app.repository;

import com.social.app.model.Groups;
import com.social.app.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface GroupRepository  extends JpaRepository<Groups, Long> {
    Groups findByGroupId(long groupId);
}