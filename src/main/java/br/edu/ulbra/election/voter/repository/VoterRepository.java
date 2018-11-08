package br.edu.ulbra.election.voter.repository;

import br.edu.ulbra.election.voter.model.Voter;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface VoterRepository extends CrudRepository<Voter, Long> {
    Optional<Voter> findByEmail(String Email);
}
