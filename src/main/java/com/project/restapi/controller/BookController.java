package com.project.restapi.controller;

import com.project.restapi.domain.Book;
import com.project.restapi.dto.BookRequestDto;
import com.project.restapi.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class BookController {

    private final BookService bookService;

    @PostMapping("/book")
    public Book save(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.saveBook(bookRequestDto);
    }

}
