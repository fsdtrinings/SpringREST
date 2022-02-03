package com.ecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ecom.app.entity.Account;

public interface IAccountRepository extends CrudRepository<Account, Integer>
{
   // findALL , Save, findById , delete 
}
