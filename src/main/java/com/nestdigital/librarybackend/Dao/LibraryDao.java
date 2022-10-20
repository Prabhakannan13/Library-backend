package com.nestdigital.librarybackend.Dao;

import com.nestdigital.librarybackend.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void deleteBookById(Integer id);

    @Query(value = "SELECT `id`, `author`, `bookname`, `description` FROM `library` WHERE `bookname`=:bookname",nativeQuery = true)
    List<LibraryModel>searchBook(String bookname);
}
