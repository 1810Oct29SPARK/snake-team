package daos;


import java.util.List;

import beans.Snake;

public interface SnakesDAO {
	
	public List<Snake> snakeAll(); 

	public Snake getSnakeByID(int id);

	public void createSnake(Snake s); 

	public void deleteSnake(int id);

	public void updateSnake(Snake s); 


}
