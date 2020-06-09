package com.mtg.bookstore.repository;

import com.mtg.bookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "bookCateogry",path="book-category")
public interface BookCategoryRespository  extends JpaRepository<BookCategory,Long> {
}
