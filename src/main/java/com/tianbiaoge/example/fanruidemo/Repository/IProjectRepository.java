package com.tianbiaoge.example.fanruidemo.Repository;

import com.tianbiaoge.example.fanruidemo.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProjectRepository extends JpaRepository<Project, Integer> {
    @Override
    List<Project> findAll();

    List<Project> findByDesignName(String designName);

    Project findByIdProject(String idProject);

    Project findByIdProjectLike(String idProject);

    Project findById(Integer id);
}
