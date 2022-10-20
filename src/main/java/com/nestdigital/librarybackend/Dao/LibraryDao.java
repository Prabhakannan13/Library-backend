package com.nestdigital.librarybackend.Dao;

import com.nestdigital.librarybackend.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void deleteBookById(Integer id);
}
