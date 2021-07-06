package com.capgemini.curses.repository;

import com.capgemini.curses.model.Curse;

import java.util.List;

public interface CurseReposetory {
    List <CurseReposetory>getCurses();
    Curse saveCurse(Curse curse);
}



