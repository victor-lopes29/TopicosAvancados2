package br.edu.utfpr.todo.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.todo.model.Person;

public interface PersonRepository extends JpaRepository<Person, UUID> {

        public boolean existsByIdAndEmail(UUID id, String email);

        public boolean existsByEmail(String email);

        public boolean existsByEmailAndPassword(String email, String password);

        public Optional<Person> findByEmail(String email);

        public Optional<Person> findByEmailAndPassword(String email, String password);

        public List<Person> findByName(String name);
}
