package com.tianbiaoge.example.fanruidemo.Repository;

import com.tianbiaoge.example.fanruidemo.domain.CompanyAccount;
import com.tianbiaoge.example.fanruidemo.domain.HangUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICompanyAccountRepository extends JpaRepository<CompanyAccount, Integer> {

    List<CompanyAccount> findAllByIdProject(String idProject);

    @Override
    List<CompanyAccount> findAll();
}
