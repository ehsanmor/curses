package com.capgemini.curses.repository;

import com.capgemini.curses.model.Curse;
import com.capgemini.curses.repository.CurseReposetory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurseRepository implements CurseReposetory {

    private List<Curse> books;

    public CurseRepository() {
        this.books = new ArrayList<>();
        this.books.add(new Curse("Koken met Rick", "Rick Artz"));
        this.books.add(new Curse("Java met Rick", "Rick Artz"));
    }




    @Override
    public List<CurseReposetory> getCurses() {
        return null;
    }

    @Override
    public Curse saveCurse(Curse curse) {
        return null;
    }
}