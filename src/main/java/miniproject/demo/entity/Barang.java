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
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barang")
    private Long  idBarang;

    @Column(name = "nama_barang", nullable = true)
    private String namaBarang;

    @Column(name = "harga", nullable = true)
    private Integer hargaBarang;

    @Column(name = "detail", nullable = true)
    private String detailBarang;

    @Column(name = "stock", nullable = true)
    private Integer stockBarang;

    @Column(name = "createdAt", nullable = true)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt", nullable = true)
    @UpdateTimestamp
    private Date updatedAt;

}