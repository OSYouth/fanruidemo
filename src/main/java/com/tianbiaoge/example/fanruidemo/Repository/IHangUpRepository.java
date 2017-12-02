package com.tianbiaoge.example.fanruidemo.Repository;

import com.tianbiaoge.example.fanruidemo.domain.HangUp;
import com.tianbiaoge.example.fanruidemo.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHangUpRepository extends JpaRepository<HangUp, Integer> {
    @Override
    List<HangUp> findAll();

    List<HangUp> findAllByIdProject(String idProject);
}
