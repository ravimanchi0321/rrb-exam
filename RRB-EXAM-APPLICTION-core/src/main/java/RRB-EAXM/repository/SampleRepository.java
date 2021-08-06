package RRB-EAXM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import RRB-EAXM.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
