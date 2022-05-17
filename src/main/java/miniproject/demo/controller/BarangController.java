package miniproject.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miniproject.demo.entity.Barang;
import miniproject.demo.repository.BarangRepo;

@RestController
@RequestMapping("/api")
public class BarangController {
    @Autowired
    private BarangRepo barangRepo;

    @GetMapping("/barang")
    public List<Barang> getBarang(){
        return barangRepo.findAll();
    }

    @GetMapping("/barang/{id}")
    public Optional <Barang> getBarang(@PathVariable Long id){
        return barangRepo.findById(id);
    }

    @PostMapping("/barang")
    public Barang createNewBarang(@RequestBody Barang payload){
        return barangRepo.save(payload);
    }

    // @PutMapping("/barang/{id}")
    // public Optional<Barang> updateBarang(
    //     @PathVariable Long id,
    //     @RequestBody Barang barang) {
    //         Optional<Barang> barangById = barangRepo.findById(id);
        
    //     // barangById.ifPresent(res ->{
    //     //     res.setNama_barang(barang.getNama_barang());
    //     //     res.setHargaBarang(barang.getHargaBarang());
    //     // });
    //     }
       
    

}