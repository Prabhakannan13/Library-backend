package com.nestdigital.librarybackend.Controller;

import com.nestdigital.librarybackend.Dao.LibraryDao;
import com.nestdigital.librarybackend.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;
    @CrossOrigin(origins = "*")

    @PostMapping(path = "/addlibrary",consumes = "application/json",produces = "application/json")
    public String addlibrary(@RequestBody LibraryModel reciepe){
        System.out.println(reciepe.toString());
        dao.save(reciepe);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewlibrary")
    public List<LibraryModel>viewlibrary(){
        return (List<LibraryModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deletebook",consumes = "application/json",produces = "application/json")
    public String deletebook(@RequestBody LibraryModel library){
        dao.deleteBookById(library.getId());
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchbook",consumes = "application/json",produces = "application/json")
    public List<LibraryModel>searchBook(@RequestBody LibraryModel library){
        return (List<LibraryModel>) dao.searchBook(library.getBookname());
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/editbook",consumes = "application/json",produces = "application/json")
    public String editbook(@RequestBody LibraryModel library){
        dao.editBook(library.getAuthor(),library.getBookname(),library.getDescription(), library.getId());
        return "{status:'success}";
    }
}
