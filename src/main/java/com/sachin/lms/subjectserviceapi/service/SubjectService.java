package com.sachin.lms.subjectserviceapi.service;


import com.sachin.lms.subjectserviceapi.dto.request.RequestSubjectDto;

public interface SubjectService {
    public void createSubject(RequestSubjectDto dto);
}