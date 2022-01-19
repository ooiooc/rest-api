package com.project.restapi.service;

import com.project.restapi.domain.Author;
import com.project.restapi.domain.Book;
import com.project.restapi.dto.BookRequestDto;
import com.project.restapi.repository.AuthorRepository;
import com.project.restapi.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    // 도서 등록
    @Transactional
    public Book saveBook(BookRequestDto requestDto) {
        /*Optional<Author> author = authorRepository.findById(requestDto.getAuthorId().getId());
        if(!author.isPresent()) {
            throw new EntityNotFoundException("Author Not Found");
        }*/
        return bookRepository.save(requestDto.toEntity());
    }

    //

}
