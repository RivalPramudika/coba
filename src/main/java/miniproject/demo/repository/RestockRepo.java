package miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miniproject.demo.entity.Restock;

@Repository
public interface RestockRepo extends JpaRepository<Restock, Long>{
    
}
