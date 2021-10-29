/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.jku.gusenbauer.springbackend.repositories;

import at.jku.gusenbauer.springbackend.entities.SystemUser;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 */
@Repository
@Component
    public interface SystemRepository extends CrudRepository<SystemUser, Integer> {
       
}
