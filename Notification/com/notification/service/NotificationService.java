package com.notification.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.notification.domain.NotificationEntity;

@Service
public interface NotificationService extends CrudRepository<NotificationEntity,Integer>
{
		
	@Modifying
	@Query(value="delete from notification  where id=:id",nativeQuery=true)
	public void delete(@Param("id")Integer id);
	
}
