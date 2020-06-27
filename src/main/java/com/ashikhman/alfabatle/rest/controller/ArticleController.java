package com.ashikhman.alfabatle.rest.controller;

import com.ashikhman.alfabatle.rest.dto.ArticleDto;
import com.ashikhman.alfabatle.rest.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping()
    public List<ArticleDto> articles() {
        return articleService.getAll();
    }

    @GetMapping("/{id}")
    public ArticleDto article(@Valid @PathVariable() Long id) {
        return articleService.getById(id);
    }
}
