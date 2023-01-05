package com.arco.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arco.hrpayroll.entities.Worker;

@Component
@FeignClient(value = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClients {
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}