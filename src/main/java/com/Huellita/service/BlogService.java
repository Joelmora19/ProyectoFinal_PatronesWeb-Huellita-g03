package com.Huellita.service;

import com.Huellita.domain.Blog;
import java.util.List;

public interface BlogService {

    public List<Blog> getBlog();

    public Blog getBlog(Blog blog);

    public void deleteBlog(Blog blog);

    public void saveBlog(Blog blog);
}
