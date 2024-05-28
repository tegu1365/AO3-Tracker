package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Library;
import ao3.tracker.ao3tracker.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ao3.tracker.ao3tracker.repository.LibraryRepository;

import java.util.List;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository){
        this.libraryRepository=libraryRepository;
    }
    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public Library findById(Integer id) {
        return libraryRepository.findById(id).orElse(null);
    }

    public List<Library> getUserLibrary(Users userId){
        return  libraryRepository.findByUserId(userId);
    }

    public Library updateLibrary(Library library) {
        return  libraryRepository.save(library);
    }

    public void removeLibrary(Integer id) {
        libraryRepository.deleteById(id);
    }
}
