package com.notification.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.domain.NotificationEntity;
import com.notification.dto.NotificationDTO;
import com.notification.service.NotificationService;

@RestController
@RequestMapping("/api")
public class NotificationController 
{

	@Autowired
	private NotificationService notificationRepository;

	@PostMapping(path = "/saveNotification")
	public void createNotification(@RequestBody NotificationDTO notificationDTO) 
	{
		NotificationEntity notification = new NotificationEntity();

		BeanUtils.copyProperties(notificationDTO, notification);
		notificationRepository.save(notification);
		
	}

		
	@GetMapping(path = "/getNotificationList")
	public List<NotificationEntity> getNotificationList() 
	{
		List<NotificationEntity> notificationList = (List<NotificationEntity>) notificationRepository.findAll();
		
		return notificationList;
	}

	@DeleteMapping("/deleteNotificationbyid/{notificationid}")
	private void deleteNotification(@PathVariable("notificationid") Integer notificationid) 
	{
		notificationRepository.delete(notificationid);
	}

	@GetMapping(path = "/getNotificationcount")
	private Long count() 
	{
		return notificationRepository.count();

	}

	@GetMapping(path = "/getNotification/{id}")
	public Optional<NotificationEntity> getNotificationById(@PathVariable("id") Integer id) 
	{

		return notificationRepository.findById(id);

	}
	
	
}
