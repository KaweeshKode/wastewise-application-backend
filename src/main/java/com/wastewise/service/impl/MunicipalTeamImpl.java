package com.wastewise.service.impl;

import com.wastewise.dto.MunicipalTeam;
import com.wastewise.entity.MunicipalTeamEntity;
import com.wastewise.repository.MunicipalTeamRepository;
import com.wastewise.service.MunicipalTeamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MunicipalTeamImpl implements MunicipalTeamService {

    final MunicipalTeamRepository repository;
    final ModelMapper mapper;

    @Override
    public void addTeam(MunicipalTeam team) {
        repository.save(mapper.map(team, MunicipalTeamEntity.class));
    }

    @Override
    public List<MunicipalTeam> getTeams() {
        List<MunicipalTeam> teamList = new ArrayList<>();
        repository.findAll().forEach(team -> teamList.add(mapper.map(team, MunicipalTeam.class)));
        return teamList;
    }

    @Override
    public void deleteTeam(String teamId) {
        repository.deleteById(teamId);
    }
}
