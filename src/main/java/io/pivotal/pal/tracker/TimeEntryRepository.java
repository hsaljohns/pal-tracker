package io.pivotal.pal.tracker;

import java.util.List;

import static java.util.Arrays.asList;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry entry);

    public TimeEntry find (long id);

    public List<TimeEntry> list();

    public TimeEntry update(long id, TimeEntry timeEntry);

    public TimeEntry delete(long id);
}
