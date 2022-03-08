package com.app.criatsoft.main.adminRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.criatsoft.main.adminModel.Applicant;


@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, String> {

	Applicant findByApplicantFname(String name);

}
