package com.company;

public class Author {
    public String name;
    public int booksCount;
    boolean isBestseller;

    public Author(String name, int booksCount, boolean isBestseller) {
        this.name = name;
        this.booksCount = booksCount;
        this.isBestseller = isBestseller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public void setBestseller(boolean bestseller) {
        isBestseller = bestseller;
    }

    public Author() {
    }
}
