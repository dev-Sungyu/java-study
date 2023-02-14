package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.ReplyVO;

public class Test {
	   public Connection connection;
	   public PreparedStatement preparedStatement;
	   public ResultSet resultSet;
	   
	   
	   public void insert(ReplyVO replyVO, Long target) {
		   String query = "INSERT INTO TBL_REPLY"
		   		+ "(REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH)"
		   		+ "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, ?, (SELECT REPLY_DEPTH + 1 FROM TBL_REPLY WHERE REPLY_ID = ?))";
		      connection = DBConnecter.getConnection();
		      try {
		    	  preparedStatement = connection.prepareStatement(query);
		    	  preparedStatement.setString(1, replyVO.getReplyContent());
		    	  preparedStatement.setLong(2, UserDAO.userId);
		    	  preparedStatement.setLong(3, replyVO.getBoardId());
		    	  preparedStatement.setLong(4, replyVO.getBoardId());
		    	  preparedStatement.setLong(5, replyVO.getBoardId());
		    	  
		      
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   }

