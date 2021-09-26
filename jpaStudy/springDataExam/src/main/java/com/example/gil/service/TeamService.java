package com.example.gil.service;

import com.example.gil.entity.Team;
import com.example.gil.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void save(Team team) {
        teamRepository.save(team);
    }
}
