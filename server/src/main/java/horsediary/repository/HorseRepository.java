package main.java.horsediary.repository;

import horsediary.model.Horse;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HorseRepository extends CassandraRepository<Horse> {
}
