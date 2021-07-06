package com.capgemini.curses.model;

public class Curse {



        private String basic;
        private String advance;

    public Curse(String basic, String advance) {
        this.basic = basic;
        this.advance = advance;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getAdvance() {
        return advance;
    }

    public void setAdvance(String advance) {
        this.advance = advance;
    }

    @Override
    public String toString() {
        return "JavaBasic{" +
                "basic='" + basic + '\'' +
                ", advance='" + advance + '\'' +
                '}';
    }
}
