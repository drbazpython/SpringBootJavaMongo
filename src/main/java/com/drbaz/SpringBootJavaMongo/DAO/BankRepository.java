package com.drbaz.SpringBootJavaMongo.DAO;

import com.drbaz.SpringBootJavaMongo.Model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
//this is the interface to the MongoDB database
// by instancing this class we get access to all the MongoDB methods
public interface BankRepository extends MongoRepository<Bank,Integer> {
}
