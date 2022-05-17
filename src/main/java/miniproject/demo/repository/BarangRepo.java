package miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miniproject.demo.entity.Barang;

@Repository
public interface BarangRepo extends JpaRepository<Barang, Long> {
    
}

