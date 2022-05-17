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
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaksi")
    private Long idTransaksi;

    @Column(name = "id_barang")
    private Integer idBarang;

    @Column(name = "restock_barang")
    private Integer restockBarang;

    @Column(name = "createdAt", nullable = true)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt", nullable = true)
    @UpdateTimestamp
    private Date updatedAt;
}
