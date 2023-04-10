
package com.Huellita.impl;

import com.Huellita.dao.BlogDao;
import com.Huellita.domain.Blog;
import com.Huellita.service.BlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BlogServiceImpl implements BlogService {
    
    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> getBlog() {
        return(List<Blog>) blogDao.findAll();
    }

    @Override
    public Blog getBlog(Blog blog) {
         return blogDao.findById(blog.getId_Blog()).orElse(null);
    }

    @Override
    public void deleteBlog(Blog blog) {
       blogDao.delete(blog);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogDao.save(blog);
    }
}
