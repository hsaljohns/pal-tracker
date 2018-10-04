package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {
    TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    public ResponseEntity create(TimeEntry entry){
       TimeEntry timeEntry = this.timeEntryRepository.create(entry);

       return null;
    }

    public ResponseEntity read(long id) {
        return null;
    }


    public ResponseEntity<List<TimeEntry>>  list() {
        return null;
    }

    public ResponseEntity update(long id, TimeEntry timeEntry){
        return null;
    }

    public ResponseEntity delete(long id){
        return null;
    }
}
