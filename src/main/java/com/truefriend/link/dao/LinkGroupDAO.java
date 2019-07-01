package com.truefriend.link.dao;

import com.truefriend.link.entity.LinkGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkGroupDAO extends JpaRepository<LinkGroup, Long> {
}
