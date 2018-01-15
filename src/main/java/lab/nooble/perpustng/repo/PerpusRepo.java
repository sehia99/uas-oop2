/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.nooble.perpustng.repo;

import lab.nooble.perpustng.entity.Perpus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Toshiba
 */
@Repository
public interface PerpusRepo extends JpaRepository<Perpus,Integer>{
    
}
