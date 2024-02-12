package org.glamourArts.Data.Repositories;

import org.glamourArts.Data.Model.Art;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtRepository extends JpaRepository<Art, Long> {
}
