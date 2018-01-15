/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.nooble.perpustng.controller;

import java.util.List;
import lab.nooble.perpustng.entity.Perpus;
import lab.nooble.perpustng.repo.PerpusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Toshiba
 */
@RestController
public class ApiController {
    @Autowired
    private PerpusRepo perpusRepo;

    @RequestMapping("/get-home")
    public List<Perpus> getListPerpus() {
        
    //List<Perpus> data = perpusRepo.findAll();
      //  for(int i=0; i<data.size(); i++) {
        //    System.out.println(((Perpus) data.get(i)).getId_buku());
        //}
return perpusRepo.findAll();
        
    }

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST)
    public void tambah(@RequestBody Perpus perpus) {
        //System.out.println("id : " + pegawai.getId());
        //System.out.println("nama : " + pegawai.getNama());
        //System.out.println("jabatan : " + pegawai.getJabatan());
        perpusRepo.save(perpus);
    }

    @RequestMapping(value = "/api/delete/{id_buku}", method = RequestMethod.DELETE)
    public void hapus(@PathVariable("id_buku") int id_buku) {
        perpusRepo.delete(id_buku);
    }
    
    
}
