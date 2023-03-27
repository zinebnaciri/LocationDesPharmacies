package gestion.packages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.packages.entities.Zone;

public interface ZoneRep extends JpaRepository<Zone, Integer> {
	Zone findById(int id);
	 @Query("select z.nom from Zone z where z.ville.nom= :nom order by z.nom")
    List<Zone> findZoneByVille(@Param("nom") String nom);
}
