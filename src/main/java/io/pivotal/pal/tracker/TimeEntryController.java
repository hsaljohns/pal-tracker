package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    public ResponseEntity create(TimeEntry entry){
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
