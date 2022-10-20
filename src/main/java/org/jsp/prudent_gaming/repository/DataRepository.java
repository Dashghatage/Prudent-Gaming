package org.jsp.prudent_gaming.repository;

import org.jsp.prudent_gaming.dto.Bets_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Bets_Details, Integer> {
}
