package miniproject.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Restock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restock")
    private Long idRestock;

    @Column(name = "id_barang")
    private Integer idBarang;

    @Column(name = "nama_barang")
    private String namaBarang;

    @Column(name = "restock_barang")
    private Integer restockBarang;

    @Column(name = "catatan")
    private String catatanRestock;

    @Column(name = "username")
    private String username;

    @Column(name = "createdAt", nullable = true)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt", nullable = true)
    @UpdateTimestamp
    private Date updatedAt;
}
