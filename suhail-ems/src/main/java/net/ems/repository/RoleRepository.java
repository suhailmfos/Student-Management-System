package net.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ems.model.ERole;
import net.ems.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
