package com.abw12.springbootawsebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/player-service")
public class SpringbootAwsEbApiApplication {

	List<Players> playerList=new ArrayList<>();

	@GetMapping("/fetchPlayerList")
	public List<Players> getPlayer(){
		return playerList;
	}

	@PostMapping("/addPlayer")
	public List<Players> addPlayer(@RequestBody Players player){
		playerList.add(player);
		return playerList;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsEbApiApplication.class, args);
	}

}
