package com.spring.reserves.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("games")
public class Game {
    @Id
    public String id;
    public String name;
    public String launchDate;
    public String developers;
    public List<String> authors;

}
