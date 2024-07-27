package net.engineeringdigest.journalapp.controller;

import net.engineeringdigest.journalapp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

@GetMapping()
    public List<JournalEntry> getAll() {
        return null;
    }
    @PostMapping()
    public  boolean CreateEntry(@RequestBody JournalEntry entry){

        return true;

    }
@GetMapping("id/{myid}")
    public  JournalEntry getJournalEntryById(@PathVariable long myid){

    return null;
    }

    @DeleteMapping("id/{myid}")
    public  JournalEntry deleteJournalEntryById(@PathVariable long myid){

    return null;
    }

@PutMapping("/id/{id}")
    public JournalEntry updateJournalById(@PathVariable long id, @RequestBody JournalEntry entry){
    return null;
    }
}
