package br.com.exame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.exame.dto.ExameDto;
import br.com.exame.entity.Exame;
import br.com.exame.repository.ExameRepository;

@Service
public class ExameService {

    @Autowired
    private ExameRepository repository;

    public void save(ExameDto exameDto) {
        repository.save(exameDto.toEntity());
    }

    public List<ExameDto> list() {
        List<Exame> exames = repository.findAll(Sort.by(Sort.Direction.ASC, "paciente", "exame"));
        return exames.stream().map(ExameDto::new).collect(Collectors.toCollection(ArrayList::new));
    }

    public void delete(ExameDto exameDto) {
        repository.deleteById(exameDto.getId());
    }

    public void update(ExameDto exameDto) {
        repository.save(exameDto.toEntity());
    }
}
