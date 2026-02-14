package br.edu.java.model;

import java.util.Date;

@Entity
public class Game {

    //Propriedades
    public int ID;
    public String Title;
    public String Description;
    public Date ReleaseDate;
    public int DeveloperId;
    public int PublisherId;
    public String CoverImageUrl;
    public int NumberOfPlayers;
    public String Platform;
    public String Genre;
    public float Rating;
    public Date PublishedAt;
    public String CreatedBy;
    public Date CreatedDate;
    public String ModifiedBy;
    public Date ModifiedDate;

    //Construtor
    public Game(
        int id,
        String title,
        String description,
        Date releaseDate,
        int developerId,
        int publisherId,
        String coverImageUrl,
        int numberOfPlayers,
        String platform,
        String genre,
        float rating,
        Date publishedAt,
        String createdBy,
        Date createdDate,
        String modifiedBy,
        Date modifiedDate)
    {
        this.ID = id;
        //TODO
    }

    //Métodos
}