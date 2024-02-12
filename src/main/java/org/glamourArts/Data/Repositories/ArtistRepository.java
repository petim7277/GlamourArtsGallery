package org.glamourArts.Data.Repositories;

import org.glamourArts.Data.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
