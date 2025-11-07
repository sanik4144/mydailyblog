package com.sanik.mydailyblog.Repositories;

import com.sanik.mydailyblog.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
