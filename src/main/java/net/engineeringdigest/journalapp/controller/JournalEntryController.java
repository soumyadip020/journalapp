package net.engineeringdigest.journalapp.controller;

import net.engineeringdigest.journalapp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class JournalEntryController {
    private Map<Long,JournalEntry> journalEntries=new HashMap<>();
@GetMapping()
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping()
    public  boolean CreateEntry(@RequestBody JournalEntry entry){
        journalEntries.put(entry.getId(),entry);
        return true;

    }
@GetMapping("id/{myid}")
    public  JournalEntry getJournalEntryById(@PathVariable long myid){
 return journalEntries.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public  JournalEntry deleteJournalEntryById(@PathVariable long myid){
        return journalEntries.remove(myid);
    }

@PutMapping("/id/{id}")
    public JournalEntry updateJournalById(@PathVariable long id, @RequestBody JournalEntry entry){
    return journalEntries.put(id,entry);
    }
}
