package net.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ems.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}
