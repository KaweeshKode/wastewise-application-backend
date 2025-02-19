package com.wastewise.repository;

import com.wastewise.dto.MunicipalTeam;
import com.wastewise.entity.MunicipalTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipalTeamRepository extends JpaRepository<MunicipalTeamEntity, String> {
}
