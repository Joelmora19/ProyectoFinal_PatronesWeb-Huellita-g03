package com.Huellita.controller;

import com.Huellita.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Huellita.service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    //------LISTADO-----
    @GetMapping("/listado")
    public String inicioBlog(Model model) {
        var blog = blogService.getBlog();
        model.addAttribute("blog", blog);
        return "/blog/listado";
    }

    //------ELIMINAR------
    @GetMapping("/eliminar/{id_Blog}")
    public String eliminarBlog(Blog blog) {
        blogService.deleteBlog(blog);
        return "redirect:/blog/listado";
    }
    //------NUEVO-----

    @GetMapping("/nuevo")
    public String nuevoBlog(Blog blog) {
        return "/blog/modifica";

    }

    //-----GUARDAR----
    @PostMapping("guardar")
    public String guardarBlog(Blog blog) {
        blogService.saveBlog(blog);
        return "redirect:/blog/listado";
    }
    //---------MODIFICAR-------------

    @GetMapping("/editar/{id_Blog}")
    public String editaBlog(Blog blog) {
        blog = blogService.getBlog(blog);
        return "/blog/modifica";
    }
}
