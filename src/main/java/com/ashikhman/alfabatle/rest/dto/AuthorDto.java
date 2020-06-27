package com.ashikhman.alfabatle.rest.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthorDto {

    private String fullName;
}
