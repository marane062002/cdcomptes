package com.example.cdccomptes.Repository;

import com.example.cdccomptes.Model.DonateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateurRepository extends JpaRepository<DonateurEntity,Long> {
}
