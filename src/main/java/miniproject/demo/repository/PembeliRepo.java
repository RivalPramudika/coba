package miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miniproject.demo.entity.Pembeli;

@Repository
public interface PembeliRepo extends JpaRepository<Pembeli, Long> {
    
}
