package org.glamourArts.Services.Artist;

import org.glamourArts.Data.Model.Art;
import org.glamourArts.Dtos.Request.ArtRequest.ArtRequest;

import java.util.List;

public interface ArtistService {
    void showArt(ArtRequest artRequest) ;
    List<Art> findAllArts(Long artistId) ;
    void removeArt(Long artistId, Long artId) ;
}
