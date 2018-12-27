package daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import beans.Snake;

public class SnakesDAOImpl implements SnakesDAO {

	public SnakesDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Snake> snakeAll() {
		// TODO Auto-generated method stub
		List<Snake> snk = new ArrayList<>();
		String sql = "SELECT * FROM SNAKE";
		try {
			try {
				Connection con = ConnectionUtil.getConnection("connection.properties");
				PreparedStatement pstm = con.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();
				while (rs.next()) {
					snk.add(new Snake(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getInt(5)));
				}
				con.close();
				rs.close();
//				in.close();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return snk;
	}

	public Snake getSnakeByID(int id) {
		// TODO Auto-generated method stub
		Snake snk = null;
		String sql = "SELECT * FROM SNAKE WHERE SNAKE_ID = ?";
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");

			PreparedStatement ptsm = con.prepareStatement(sql);
			ptsm.setInt(1, id);

			ResultSet rs = ptsm.executeQuery();

			while (rs.next()) {
				snk = new Snake(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
			System.out.println(snk);
			con.close();
			rs.close();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return snk;
	}

	public void createSnake(Snake s) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO SNAKE (FIRSTNAME, SPECIES, AGE, H_ID) \r\n" + "VALUES (?,?,?,?) ";
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, s.getFirstName());
			psmt.setString(2, s.getSpecies());
			psmt.setInt(3, s.getAge());
			psmt.setInt(4, s.getH_ID());
			psmt.executeUpdate();
			con.close();
		} catch (SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void deleteSnake(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM SNAKE WHERE SNAKE_ID = ?";
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			PreparedStatement ppmt = con.prepareStatement(sql);
			ppmt.setInt(1, id);
			ppmt.executeUpdate();
			con.close();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateSnake(Snake s) {
		// TODO Auto-generated method stub
		String sql = "UPDATE SNAKE SET FIRSTNAME = ?, SPECIES=?, AGE=? H_ID=? WHERE SNAKE_ID = ?";

		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, s.getFirstName());
			psmt.setString(2, s.getSpecies());
			psmt.setInt(3, s.getAge());
			psmt.setInt(4, s.getH_ID());
			psmt.executeUpdate();
			con.close();
		} catch (SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
