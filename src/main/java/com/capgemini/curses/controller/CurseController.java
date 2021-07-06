package com.capgemini.curses.controller;

import com.capgemini.curses.model.Curse;
import com.capgemini.curses.repository.CurseReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CurseController {

    @RestController
    @RequestMapping("api/curses/")
    public class JavaCursuseController {

        @Autowired
        private CurseReposetory bookRepository;
        private CurseReposetory CurseRepository;

        @GetMapping("single")
        public Curse getSingleBook() {
            Curse curse = new Curse("Cooking with Java", "Rick Artz");
            return curse;
        }


        @PostMapping("new")
        public void createBook(@RequestBody Curse newBook) {
            this.bookRepository.saveCurse(newBook);
        }
    }
}
