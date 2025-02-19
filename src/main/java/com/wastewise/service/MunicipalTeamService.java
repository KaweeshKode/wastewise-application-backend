package com.wastewise.service;

import com.wastewise.dto.MunicipalTeam;

import java.util.List;

public interface MunicipalTeamService {
    void addTeam(MunicipalTeam team);

    List<MunicipalTeam> getTeams();

    void deleteTeam(String teamId);
}
