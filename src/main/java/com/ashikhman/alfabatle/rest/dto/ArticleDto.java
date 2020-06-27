package com.ashikhman.alfabatle.rest.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class ArticleDto {

    private String title;

    private List<AuthorDto> authors;

    public ArticleDto addAuthor(AuthorDto author) {
        if (null == authors) {
            authors = new ArrayList<>();
        }

        authors.add(author);

        return this;
    }
}
