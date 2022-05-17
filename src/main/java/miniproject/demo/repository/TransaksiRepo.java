package miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miniproject.demo.entity.Transaksi;

@Repository
public interface TransaksiRepo extends JpaRepository<Transaksi, Long> {
    
}
