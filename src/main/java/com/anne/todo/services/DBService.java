package com.anne.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anne.todo.domain.Todo;
import com.anne.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);
		Todo t2 = new Todo(null, "Ler", "Ouvir Música",
				LocalDateTime.parse("25/03/2022 10:40", formatter), true);
		Todo t3 = new Todo(null, "Dançar", "Ir pra academia",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);
		Todo t4 = new Todo(null, "Comer uma banana", "Brincar com a gata",
				LocalDateTime.parse("25/03/2022 10:40", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
