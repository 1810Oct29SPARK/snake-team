package services;

import java.util.List;

import beans.Snake;
import daos.SnakesDAO;
import daos.SnakesDAOImpl;

public class SnakeServiceImpl {

	public SnakeServiceImpl() {
		
	}

	private SnakesDAO snk = new SnakesDAOImpl();
	
	public List<Snake> getAllSnakes() {
		return snk.snakeAll();
	}
	public Snake getSnakeByID(int id) {
		return snk.getSnakeByID(id);
	}
	
	public void createSnake(Snake snake) {
		snk.createSnake(snake);
	}
	public void updateSnake(Snake snake) {
		 snk.updateSnake(snake);
	}
	
	public void deleteSnake (int id) {
		snk.deleteSnake(id);
	}
}
