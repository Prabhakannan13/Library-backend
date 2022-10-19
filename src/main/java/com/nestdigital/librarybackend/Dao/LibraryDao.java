package com.nestdigital.librarybackend.Dao;

import com.nestdigital.librarybackend.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}
