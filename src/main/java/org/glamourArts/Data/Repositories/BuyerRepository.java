package org.glamourArts.Data.Repositories;

import org.glamourArts.Data.Model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
