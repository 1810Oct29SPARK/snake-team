package services;

import java.util.List;

import beans.Snake;

public interface SnakeService {
	
	public List<Snake> getAllSnakes();
	public Snake getSnakeByID(int id); 
	public void createSnake(Snake snake);
	public void updateSnake(Snake snake);
	
	public void deleteSnake (int id);

}
