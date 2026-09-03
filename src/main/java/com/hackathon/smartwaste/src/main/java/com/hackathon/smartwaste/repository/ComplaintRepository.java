package com.hackathon.smartwaste.repository;

import com.hackathon.smartwaste.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository
        extends JpaRepository<Complaint, Long> {

    List<Complaint> findByStatus(String status);

    List<Complaint> findByPriority(String priority);
}
package com.hackathon.smartwaste.repository;

import com.hackathon.smartwaste.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository
        extends JpaRepository<Complaint, Long> {

    List<Complaint> findByStatus(String status);

    List<Complaint> findByPriority(String priority);
}
