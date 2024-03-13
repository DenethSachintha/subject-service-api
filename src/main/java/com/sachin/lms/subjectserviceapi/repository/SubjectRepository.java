package com.sachin.lms.subjectserviceapi.repository;


import com.sachin.lms.subjectserviceapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
    List<Subject> findByIdIn(List<Long> ids);
}