package cinema.management.app.screeningservice.repository;

import cinema.management.app.screeningservice.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    @Query("SELECT s FROM Screening s WHERE s.date = :date")
    List<Screening> findScreeningsByDate(@Param("date") LocalDate date);

    boolean existsByDate(LocalDate date);
}
