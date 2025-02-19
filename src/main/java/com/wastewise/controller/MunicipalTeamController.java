package com.wastewise.controller;

import com.wastewise.dto.MunicipalTeam;
import com.wastewise.service.MunicipalTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mct")
@RequiredArgsConstructor
@CrossOrigin
public class MunicipalTeamController {

    final MunicipalTeamService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTeam(@RequestBody MunicipalTeam team) {
        service.addTeam(team);
    }

    @GetMapping("/all")
    public List<MunicipalTeam> getAllTeams() {
        return service.getTeams();
    }

    @PutMapping("/update")
    public void updateTeam(@RequestBody MunicipalTeam team) {
        service.addTeam(team);
    }

    @DeleteMapping("/delete/{teamId}")
    public void deleteTeam(@PathVariable String teamId) {
        service.deleteTeam(teamId);
    }
}
