package ufv.dis.final2021.SLG;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ipRepository extends JpaRepository<IP, Long> {

    List<IP> findByLastNameStartsWithIgnoreCase(String ip_from);
}