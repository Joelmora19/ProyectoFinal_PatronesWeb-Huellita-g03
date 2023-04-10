
package com.Huellita.dao;

import com.Huellita.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogDao extends JpaRepository<Blog, Long>{
    
}
