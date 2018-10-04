package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
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

       return new ResponseEntity<>(timeEntry, HttpStatus.CREATED);

    }

    public ResponseEntity read(long id) {
        TimeEntry timeEntry = this.timeEntryRepository.find(id);

        if (timeEntry != null) {
            return new ResponseEntity<>(timeEntry, HttpStatus.OK);
        }
        return new ResponseEntity<>(timeEntry, HttpStatus.NOT_FOUND);

    }


    public ResponseEntity<List<TimeEntry>>  list() {
        List<TimeEntry> entryList = timeEntryRepository.list();

        return new ResponseEntity<>(entryList, HttpStatus.OK);
    }

    public ResponseEntity update(long id, TimeEntry timeEntry){
        TimeEntry timeEntryUpdate = this.timeEntryRepository.update(id, timeEntry);

        if (timeEntryUpdate != null) {
            return new ResponseEntity<>(timeEntryUpdate, HttpStatus.OK);
        }
        return new ResponseEntity<>(timeEntryUpdate, HttpStatus.NOT_FOUND);

    }

    public ResponseEntity delete(long id){
        return null;
    }
}
