package com.truefriend.link.dao;

import com.truefriend.link.entity.FriendGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendGroupDAO extends JpaRepository<FriendGroup, Long> {
}
