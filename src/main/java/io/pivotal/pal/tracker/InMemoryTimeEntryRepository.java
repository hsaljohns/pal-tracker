package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private long idValue = 0L;
    private HashMap<Long, TimeEntry> timeEntryMap = new HashMap<>();


    public TimeEntry create(TimeEntry timeEntry) {
//
//        long genId  = timeEntryMap.size()+ 1L;
//
//        TimeEntry generatedEntry = new TimeEntry(genId, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
//        timeEntryMap.put(genId, generatedEntry);
//        return generatedEntry;

        Long id = timeEntryMap.size() + 1L;
                TimeEntry newTimeEntry = new TimeEntry(
                           id,
                          timeEntry.getProjectId(),
                        timeEntry.getUserId(),
                           timeEntry.getDate(),
                        timeEntry.getHours()
                         );
            timeEntryMap.put(id, newTimeEntry);
               return newTimeEntry;

    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        TimeEntry updateEntry = timeEntryMap.get(id);
        updateEntry.setProjectId(timeEntry.getProjectId());
        updateEntry.setDate(timeEntry.getDate());
        updateEntry.setHours(timeEntry.getHours());
        updateEntry.setUserId(timeEntry.getUserId());

        return updateEntry;
    }

    public TimeEntry find(long id) {
        return timeEntryMap.get(id);
    }

    public TimeEntry delete(long id) {
        TimeEntry objectToDelete = timeEntryMap.get(id);
        timeEntryMap.remove(id);
        return objectToDelete;
    }

    public List<TimeEntry> list() {

        return new ArrayList<TimeEntry>(timeEntryMap.values());
    }


}
