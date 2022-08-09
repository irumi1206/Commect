package PoolC.Comect.repository;

import PoolC.Comect.domain.relation.Relation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RelationRepository extends MongoRepository<Relation, ObjectId> {

    @Override
    public Optional<Relation> findById(ObjectId objectId);

}