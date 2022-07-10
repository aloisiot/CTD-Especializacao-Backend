package com.example.seriesservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.util.List;

@Document(collation = "series")
public class Serie {

    @Id
    private Long id;
    public String name;
    public List<Episode> episodeList;
}
