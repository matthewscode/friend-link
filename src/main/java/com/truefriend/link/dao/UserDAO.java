package com.truefriend.link.dao;

import com.truefriend.link.entity.LinkUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<LinkUser, Long> {
}
