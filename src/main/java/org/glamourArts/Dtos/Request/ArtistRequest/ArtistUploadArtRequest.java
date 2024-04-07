package org.glamourArts.Dtos.Request.ArtistRequest;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ArtistRequest {
    private Long artistId;
    private String artistName;
    private String artistPassword;
    private String artistEmail;
}
