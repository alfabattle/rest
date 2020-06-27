package com.ashikhman.alfabatle.rest.service;

import com.ashikhman.alfabatle.rest.dto.ArticleDto;
import com.ashikhman.alfabatle.rest.dto.AuthorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    public List<ArticleDto> getAll() {
        return Arrays.asList(createArticle(), createArticle());
    }

    public ArticleDto getById(Long id) {
        return createArticle();
    }

    private ArticleDto createArticle() {
        return new ArticleDto()
                .setTitle("Article title")
                .addAuthor(new AuthorDto().setFullName("Author1"))
                .addAuthor(new AuthorDto().setFullName("Author2"));
    }
}
