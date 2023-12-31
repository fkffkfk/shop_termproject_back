package com.example.demo.dto;

import com.example.demo.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
    private String id;
    private String title;
    private String author;
    private String publisher;
    private String userId;


    public TodoDTO(final TodoEntity entity){
        this.id=entity.getId();
        this.title= entity.getTitle();
        this.author=entity.getAuthor();
        this.publisher=entity.getPublisher();
        this.userId= entity.getUserId();
    }
    public static TodoEntity toEntity(final TodoDTO dto){
        return TodoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .publisher(dto.getPublisher())
                .userId(dto.getUserId())
                .build();
    }

}
